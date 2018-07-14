package com.vlccinstitute.ashish.vlcc.Hair;

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
public class Hair extends AppCompatActivity {

    String hair[]={"Advance Diploma in Hair Technology","Diploma in Hair Technology","Professional Diploma in Hair Technology"};
    ListView hair_list;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hair);


        hair_list=(ListView)findViewById(R.id.hair_list);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,hair);
        hair_list.setAdapter(adapter);

        hair_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i) {
                    case 0:
                        Intent chd = new Intent(Hair.this, DiplomaHair.class);
                        startActivity(chd);
                        break;
                    case 1:
                        Intent achd = new Intent(Hair.this, Chd.class);
                        startActivity(achd);
                        break;
                    case 2:
                        Intent hair = new Intent(Hair.this, Achd.class);
                        startActivity(hair);
                        break;

                }
            }
        });


    }
}
