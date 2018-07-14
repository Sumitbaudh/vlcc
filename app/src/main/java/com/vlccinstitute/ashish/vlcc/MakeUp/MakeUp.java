package com.vlccinstitute.ashish.vlcc.MakeUp;

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
public class MakeUp extends AppCompatActivity {
String makeups[]={"Advance Diploma in Cosmetic Makeup","Advance Diploma in Makeup"," Professional Diploma in Makeup"};
ListView makeup_list;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.makeup);

        makeup_list = (ListView) findViewById(R.id.makeup_list);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, makeups);
        makeup_list.setAdapter(adapter);
makeup_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            case 0:Intent amu = new Intent(MakeUp.this, Pmu.class);
                startActivity(amu);
                break;
            case 1:Intent pmu = new Intent(MakeUp.this,Amu.class);
                startActivity(pmu);
                break;
            case 2: Intent classical = new Intent(MakeUp.this,AdvanceMakeup.class);
                startActivity(classical);
                break;



        }

        }
});


    }
}
