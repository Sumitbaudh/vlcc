package com.vlccinstitute.ashish.vlcc.CertificateCourses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vlccinstitute.ashish.vlcc.R;

public class CorrespondenceType5 extends AppCompatActivity {
    private ListView list;
    String list_item[]={"Advance Nail Art and Nail Extensions",

            "Acrylic Nail Extensions",

            "Pedicure and Manicure"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correspondence_type5);
        list=(ListView)findViewById(R.id.list5);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,list_item);
        list.setAdapter(adapter);
    }
}
