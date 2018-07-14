package com.vlccinstitute.ashish.vlcc.Spa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vlccinstitute.ashish.vlcc.R;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Spa extends AppCompatActivity {

    ListView spa_list;
    String spa_course[]={"Diploma in Spa Therapies"};


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spa);

        spa_list=(ListView)findViewById(R.id.spa_list);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,spa_course);
        spa_list.setAdapter(adapter);

        spa_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:Intent spa1 = new Intent(Spa.this, SpaType3.class);
                           startActivity(spa1);
                           break;



                }
            }
        });


    }
}
