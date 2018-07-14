package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.vlccinstitute.ashish.vlcc.Cosmetology.Cosmetology;
import com.vlccinstitute.ashish.vlcc.Hair.Hair;
import com.vlccinstitute.ashish.vlcc.MakeUp.MakeUp;
import com.vlccinstitute.ashish.vlcc.Nutrition.Nutrition;
import com.vlccinstitute.ashish.vlcc.Spa.Spa;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class RegularCourse extends AppCompatActivity{



  customeAdapter1 adapter;
  ListView listView;
    String[] string=new String[]{"Aesthetics & Skin","Cosmetology","Hair","MakeUp","Nutrition","Spa Therapies"};
    int[] img=new int[]{R.drawable.cosmetology,R.drawable.hair,R.drawable.makeup,R.drawable.nutrition,R.drawable.therapy,R.drawable.spa};
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regular_courses);

        listView=(ListView)findViewById(R.id.lv);
        //  bt=(Button)findViewById(R.id.bt1);
        adapter=new customeAdapter1(this,string,img);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent newActivity = new Intent(RegularCourse.this, Cosmetology.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        Intent newActivity1 = new Intent(RegularCourse.this, Cosmetology.class);
                        startActivity(newActivity1);
                        break;
                    case 2:
                        Intent newActivity2 = new Intent(RegularCourse.this, Hair.class);
                        startActivity(newActivity2);
                        break;
                    case 3:
                        Intent newActivity3 = new Intent(RegularCourse.this, MakeUp.class);
                        startActivity(newActivity3);
                        break;
                    case 4:
                        Intent newActivity4 = new Intent(RegularCourse.this, Nutrition.class);
                        startActivity(newActivity4);
                        break;
                    case 5:
                        Intent newActivity5 = new Intent(RegularCourse.this, Spa.class);
                        startActivity(newActivity5);
                        break;

                }
            }
        });


    }


     }







        /*TextView cosmetology = (TextView)findViewById(R.id.cosmetology);
        cosmetology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cosmetology = new Intent(RegularCourse.this, Cosmetology.class);
                startActivity(cosmetology);
            }
        });

        TextView hair = (TextView)findViewById(R.id.hair);
        hair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hair = new Intent(RegularCourse.this, Hair.class);
                startActivity(hair);
            }
        });

        TextView makeup = (TextView)findViewById(R.id.makeup);
        makeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent makeup = new Intent(RegularCourse.this, MakeUp.class);
                startActivity(makeup);
            }
        });

        TextView nutrition = (TextView)findViewById(R.id.nutrition);
        nutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nutrition = new Intent(RegularCourse.this, Nutrition.class);
                startActivity(nutrition);
            }
        });

        TextView therapy = (TextView)findViewById(R.id.therapy);
        therapy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent therapy = new Intent(RegularCourse.this, Therapy.class);
                startActivity(therapy);
            }
        });

        TextView spa = (TextView)findViewById(R.id.spa);
        spa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spa = new Intent(RegularCourse.this, Spa.class);
                startActivity(spa);
            }
        });*/