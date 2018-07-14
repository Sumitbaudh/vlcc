package com.vlccinstitute.ashish.vlcc.CertificateCourses;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vlccinstitute.ashish.vlcc.Cosmetology.Cosmetology;
import com.vlccinstitute.ashish.vlcc.R;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by Abhi on 1/5/2018.
 */

public class CustomeAdapterCertificate extends RecyclerView.Adapter<CustomeAdapterCertificate.imageViewHolder> {

    String string[];
    int image[];

    CustomeAdapterCertificate(String s[],int img []){
        this.string=s;
        this.image=img;
    }

    @Override
    public imageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.customeadapterrow,parent,false);
    imageViewHolder ihv= new imageViewHolder(view);

        return ihv;
    }

    @Override
    public void onBindViewHolder(imageViewHolder holder, int position) {

        holder.iView.setImageResource(image[position]);
        holder.tView.setText(string[position]);


    }

    @Override
    public int getItemCount() {
        return string.length;
    }

    public class imageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView iView;
        TextView tView;
        CardView cardView;
        private final Context context;
        imageViewHolder(View itemView){

            super(itemView);
            context=itemView.getContext();
            cardView=(CardView)itemView.findViewById(R.id.cv);
            tView=(TextView)itemView.findViewById(R.id.txt1);
            iView = (ImageView)itemView.findViewById(R.id.img1);
            cardView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int pos =getAdapterPosition();
             Intent intent = null;
            switch (pos){
                case 0:
                    intent = new Intent(context, CorrespondenceType1.class);

                    break;
                case 1:
                    intent = new Intent(context, CorrespondenceType2.class);

                    break;
                case 2:
                    intent  = new Intent(context, CorrespondenceType3.class);

                    break;
                case 3:
                    intent = new Intent(context, CorrespondenceType4.class);

                    break;
                case 4:
                   intent = new Intent(context, CorrespondenceType5.class);

                    break;
                case 5:
                    intent = new Intent(context, CorrespondenceType6.class);

                    break;
                case 6:
                    intent = new Intent(context, CorrespondenceType7.class);

                    break;
            }
            context.startActivity(intent);



        }
    }



}
