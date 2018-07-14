package com.vlccinstitute.ashish.vlcc.CertificateCourses;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.vlccinstitute.ashish.vlcc.R;

/**
 * Created by 500039306 on 3/21/2016.
 */
public class Correspondence extends AppCompatActivity {

    String correspondence[]={"Aesthetics & Skin","Cosmetology","Hair","MakeUp","Nails","Nutrition","Spa Therapies"};
    int[] image= new int []{R.drawable.cosmetology,R.drawable.hair,R.drawable.makeup,R.drawable.nutrition,R.drawable.therapy,R.drawable.spa,R.drawable.cosmetology,R.drawable.makeup};

        @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correspondence);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_images);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(layoutManager);

            CustomeAdapterCertificate adapter = new CustomeAdapterCertificate(correspondence,image);
            recyclerView.setAdapter(adapter);






        }
}
