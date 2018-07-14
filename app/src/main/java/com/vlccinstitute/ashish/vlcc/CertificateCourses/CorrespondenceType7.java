package com.vlccinstitute.ashish.vlcc.CertificateCourses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vlccinstitute.ashish.vlcc.R;

public class CorrespondenceType7 extends AppCompatActivity {
    private ListView list;
    String list_item[]={"Oriental Spa Therapies",

            "Western Spa Therapies",

            "Hot Stone Therapy",

            "Body Massage/Therapies" };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correspondence_type7);
        list=(ListView)findViewById(R.id.list7);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,list_item);
        list.setAdapter(adapter);
    }
}
