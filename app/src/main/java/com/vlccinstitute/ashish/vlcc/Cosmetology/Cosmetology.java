package com.vlccinstitute.ashish.vlcc.Cosmetology;

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
public class Cosmetology extends AppCompatActivity {
    String cosmetology []={ "Advance Diploma in Aesthetics"," Advance Diploma in Cosmetology"," Advance Diploma in Laser Aesthetics","  Diploma in Beauty Culture"," Diploma in Cosmetology"," Grand Master in Cosmetology"," International Diploma in Cosmetology"," Professional Diploma in Cosmetology"};
    ListView cosmetology_list;
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cosmetology);

        cosmetology_list=(ListView)findViewById(R.id.cosmetology_list);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,cosmetology);
        cosmetology_list.setAdapter(adapter);

        cosmetology_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i) {
                    case 0:
                        Intent ada = new Intent(Cosmetology.this, Ada.class);
                        startActivity(ada);
                        break;
                    case 1:
                        Intent adc = new Intent(Cosmetology.this, Adc.class);
                        startActivity(adc);
                        break;
                    case 2:
                        Intent adla = new Intent(Cosmetology.this, Adla.class);
                        startActivity(adla);
                        break;
                    case 3:
                        Intent dbc = new Intent(Cosmetology.this, Dbc.class);
                        startActivity(dbc);
                        break;
                    case 4:
                        Intent dic = new Intent(Cosmetology.this, Dic.class);
                        startActivity(dic);
                        break;
                    case 5:
                        Intent gmic = new Intent(Cosmetology.this, Gmic.class);
                        startActivity(gmic);
                        break;
                    case 6:
                        Intent idc = new Intent(Cosmetology.this, Idc.class);
                        startActivity(idc);
                        break;
                    case 7:
                        Intent pdc = new Intent(Cosmetology.this, Pdc.class);
                        startActivity(pdc);
                        break;
                }
            }
        });




    }
}
