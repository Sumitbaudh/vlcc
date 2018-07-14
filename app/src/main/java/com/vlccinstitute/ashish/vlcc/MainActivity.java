package com.vlccinstitute.ashish.vlcc;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import com.vlccinstitute.ashish.vlcc.CertificateCourses.Correspondence;
import com.vlccinstitute.ashish.vlcc.Gallery.PhotoGallery;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Timer scrollTimer = null;
    private TimerTask scrollerSchedule;
    private int scrollPos = 0;
    private HorizontalScrollView horizontalScrollView;
    private int scrollMax;
    private LinearLayout horizontalOuterLayout;
    private Button playButton;
    private VideoView videoview;
    private ProgressDialog pDialog;

    private String VideoURL = "https://dl.dropboxusercontent.com/s/5gnlzmi3np0wyzu/VLCC%20intro.mp4?dl=0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                videoview = (VideoView) findViewById(R.id.VideoView);
                // Execute StreamVideo AsyncTask

                // Create a progressbar
                pDialog = new ProgressDialog(MainActivity.this);
                // Set progressbar title
                pDialog.setTitle("Please Wait...");
                // Set progressbar message
                pDialog.setMessage("Buffering...");
                pDialog.setIndeterminate(false);
                pDialog.setCancelable(true);
                // Show progressbar
                pDialog.show();

                try {
                    // Start the MediaController
                    MediaController mediacontroller = new MediaController(
                            MainActivity.this);
                    mediacontroller.setAnchorView(videoview);
                    // Get the URL from String VideoURL
                    Uri video = Uri.parse(VideoURL);
                    videoview.setMediaController(mediacontroller);
                    videoview.setVideoURI(video);

                } catch (Exception e) {
                    Log.e("Error", e.getMessage());
                    e.printStackTrace();
                }

                videoview.requestFocus();
                videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    // Close the progress bar and play the video
                    public void onPrepared(MediaPlayer mp) {
                        pDialog.dismiss();
                        videoview.start();
                    }
                });

            }
        });




      /*  TextView tv= (TextView) findViewById(R.id.about_us);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this, AboutUs.class);
                startActivity(about);
            }
        });*/






        ImageView img = (ImageView)findViewById(R.id.fb);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/Vlcc-Institute-Vaishali-Ghaziabad-480809702094310/?fref=ts"));
                startActivity(intent);
            }
        });
        ImageView img2 = (ImageView)findViewById(R.id.tw);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.twitter.com/institute_vlcc"));
                startActivity(intent);
            }
        });
        ImageView img3 = (ImageView)findViewById(R.id.in);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://in.linkedin.com/in/vlccgzb"));
                startActivity(intent);
            }
        });
        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hsv);
        horizontalOuterLayout = (LinearLayout) findViewById(R.id.innerLay);

        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        ViewTreeObserver vto =horizontalOuterLayout.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                horizontalScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                getScrollMaxAmount();
                startAutoScrolling();
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
       fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/

                String shareBody = "Hey, I just downloaded the VLCC Institute Android App. Get it now from :" +
                        "http://play.google.com/store/apps/details?id=com.vlccinstitute.ashish.vlcc";
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "VLCC Institute Android App");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, getResources().getString(R.string.app_name)));



            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void getScrollMaxAmount(){
        int actualWidth = (horizontalOuterLayout.getMeasuredWidth() - 512);
        scrollMax = actualWidth;
    }
    public void startAutoScrolling(){
        if(scrollTimer == null){
            scrollTimer = new Timer();
            final Runnable Timer_Tick = new Runnable() {
                @Override
                public void run() {
                    moveScrollView();
                }
            };
            if(scrollerSchedule != null){
                scrollerSchedule.cancel();
                scrollerSchedule = null;
            }
            scrollerSchedule = new TimerTask() {
                @Override
                public void run() {
                        runOnUiThread(Timer_Tick);
                    }
                };
            scrollTimer.schedule(scrollerSchedule, 20, 20);
            }
        }
    public void moveScrollView(){
        scrollPos = (int) (horizontalScrollView.getScrollX() + 1.0);
        if(scrollPos >= scrollMax){
            scrollPos = 0;
        }

        horizontalScrollView.scrollTo(scrollPos,0);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.regular_courses) {
            Intent regular_course = new Intent(this,RegularCourse.class);
            startActivity(regular_course);
        }
        else if (id == R.id.correspondence) {
            Intent contact = new Intent(this, Correspondence.class);
            startActivity(contact);
        }
        else if (id == R.id.workshop) {
            Intent workshop = new Intent(this, Workshop.class);
            startActivity(workshop);

        }
        else if (id == R.id.placement) {
            Intent placement = new Intent(this, Placements.class);
            startActivity(placement);
        }
        else if (id == R.id.photo_gallery) {
            Intent photo = new Intent(this, PhotoGallery.class);
            startActivity(photo);
        }
        else if (id == R.id.contact_us) {
            Intent contact = new Intent(this, ContactUs.class);
            startActivity(contact);
        }
        else if (id == R.id.about_us1) {
            Intent about = new Intent(this, AboutUs.class);
            startActivity(about);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    
}

