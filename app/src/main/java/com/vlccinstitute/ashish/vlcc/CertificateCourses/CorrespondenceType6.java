package com.vlccinstitute.ashish.vlcc.CertificateCourses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vlccinstitute.ashish.vlcc.R;

public class CorrespondenceType6 extends AppCompatActivity {
    private ListView list;
    String list_item[]={ "Certificate Course in Nutrition and Dietetics",
            "Certificate Course in Clinical Nutrition",
            "Certificate Course in Sports and Fitness Nutrition",
            "Certificate Course in Child Care Nutrition"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correspondence_type6);
        list=(ListView)findViewById(R.id.list6);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,list_item);
        list.setAdapter(adapter);
    }
}
