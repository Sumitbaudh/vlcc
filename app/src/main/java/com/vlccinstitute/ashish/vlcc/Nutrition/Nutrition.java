package com.vlccinstitute.ashish.vlcc.Nutrition;

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
public class Nutrition extends AppCompatActivity {
    ListView nutrition_list;
    String nutrition[]={"Diploma in Nutrition and Health Education(DNHE)","Diploma in Dietetics, Health and Nutriton (DDHN)","Certificate Course in Weight Management and Slimming Therapies"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nutrition);

        nutrition_list = (ListView) findViewById(R.id.nutrition_list);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, android.R.id.text1, nutrition);
        nutrition_list.setAdapter(adapter);

        nutrition_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                                    switch (i) {
                                                        case 0:
                                                            Intent nc1 = new Intent(Nutrition.this,NutritionCourse2.class);
                                                            startActivity(nc1);
                                                            break;
                                                        case 1:
                                                            Intent nc2 = new Intent(Nutrition.this,NutritionCourse3.class);
                                                            startActivity(nc2);
                                                            break;
                                                        case 2:
                                                            Intent nc3 = new Intent(Nutrition.this,NutritionCourse1.class);
                                                            startActivity(nc3);
                                                            break;
                                                        }
                                                }
                                            });



    }
}
