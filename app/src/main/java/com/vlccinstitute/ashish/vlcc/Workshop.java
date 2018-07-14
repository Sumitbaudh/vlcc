package com.vlccinstitute.ashish.vlcc;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 500039306 on 3/24/2016.
 */
public class Workshop extends AppCompatActivity {


    ListView lv;

    String s[]={"Make-Up","Air Brush Make-Up","Customised Workshops","Corrective Make-Up Workshop","Hair Treatment Workshop","Fusion Hair Cuts","Customised Hair Workshop","Chemical Jobs","Advance skin treatment workshop","Customised skin workshop","Personal Grooming Head to Toe","Personal Grooming Make-up/Skin","Nail art and Nail extension",};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshop);

        lv=(ListView)findViewById(R.id.workshop_listview);
        List<String> list = new ArrayList<String>(Arrays.asList(s));
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1,android.R.id.text1,s){
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.BLACK);

                // Generate ListView Item using TextView
                return view;
            }


        };



        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //   Toast.makeText(MainActivity.this, ""+s[position], Toast.LENGTH_SHORT).show();
                String val=lv.getItemAtPosition(position).toString();
                //Toast.makeText(MainActivity.this, ""+val, Toast.LENGTH_SHORT).show();
            }
        });
    }


}

