package com.vlccinstitute.ashish.vlcc.CertificateCourses;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vlccinstitute.ashish.vlcc.R;

/**
 * Created by 500039306 on 3/24/2016.
 */
public class CorrespondenceType4 extends AppCompatActivity {
    private ListView list;
    String list_item[]={"Advance Certificate Course in Professional Makeup",

            "Certificate Course in Art of Makeup",

            "Media Makeup",

            "Air-brush Makeup"};


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correspondence_type4);
        list=(ListView)findViewById(R.id.list4);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,list_item);
        list.setAdapter(adapter);
    }
}
