package com.vlccinstitute.ashish.vlcc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Therapy extends AppCompatActivity {

    String therapy []={"Diploma in Beauty Culture","Advance Certificate Course in Beauty Culture","Certificate Course in Beauty Culture","Advance Diploma in Asethetics (ADA)","Laser Hair Reduction","Cosmetic Peels (A.H.A and B.H.A)","Photofacials/IPL","Laser Tattoo Removal","Laser Hair Stimulation"};
    ListView therapy_list;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.therapy);
        therapy_list=(ListView)findViewById(R.id.therapy_list);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,therapy);
        therapy_list.setAdapter(adapter);


        therapy_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:Intent thp1 = new Intent(Therapy.this, TherapyType1.class);
                        startActivity(thp1);
                        break;
                    case 1:Intent thp2 = new Intent(Therapy.this, TherapyType2.class);
                        startActivity(thp2);
                        break;
                    case 2: Intent thp3 = new Intent(Therapy.this, TherapyType3.class);
                        startActivity(thp3);
                        break;
                    case 3:Intent thp = new Intent(Therapy.this, TherapyType4.class);
                        startActivity(thp);
                        break;
                    case 4:Intent thp4 = new Intent(Therapy.this, TherapyType5.class);
                        startActivity(thp4);
                        break;
                    case 5:Intent thp5 = new Intent(Therapy.this, TherapyType9.class);
                        startActivity(thp5);
                        break;
                    case 6:Intent thp6 = new Intent(Therapy.this, TherapyType8.class);
                        startActivity(thp6);
                        break;
                    case 7:Intent thp7 = new Intent(Therapy.this, TherapyType6.class);
                        startActivity(thp7);
                        break;
                    case 8:Intent thp8 = new Intent(Therapy.this, TherapyType7.class);
                        startActivity(thp8);
                        break;



                }
            }
        });



    }
}
