package com.vlccinstitute.ashish.vlcc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;

/**
 * Created by 500039306 on 3/20/2016.
 */
public class LoadPhotoGallery extends AsyncTask<String, Void, Bitmap>{
    ImageView bmImage;
    public LoadPhotoGallery(ImageView bmImage){
        this.bmImage = bmImage;
    }
    protected Bitmap doInBackground(String... urls){
        String urldisplay = urls[0];
        Bitmap mIcon = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon = BitmapFactory.decodeStream(in);
        }catch (Exception e){
            Log.e("Error", e.getMessage());
            e.printStackTrace();
        }
        return  mIcon;
    }
    protected void onPostExecute(Bitmap result){
        bmImage.setImageBitmap(result);
    }
}
