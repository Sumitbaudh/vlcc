package com.vlccinstitute.ashish.vlcc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Abhi on 12/7/2017.
 */

public class customeAdapter1 extends BaseAdapter{

    Context context;
    String string[];
            int image[];
            LayoutInflater layoutInflater;

            customeAdapter1(Context context,String[] string,int []image){
            this.context=context;
            this.string=string;
            this.image=image;
            layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            }
@Override
public int getCount() {
        return string.length;
        }

@Override
public Object getItem(int i) {
        return null;
        }

@Override
public long getItemId(int i) {
        return 0;
        }

@Override
public View getView(final int i, View convertView, ViewGroup viewGroup) {

        View view= convertView;
        if(convertView==null) {
        view = layoutInflater.inflate(R.layout.customeadapterrow, null);

        TextView tv = (TextView) view.findViewById(R.id.txt1);
        ImageView im = (ImageView) view.findViewById(R.id.img1);
        tv.setText(string[i]);
        im.setImageResource(image[i]);
        }

        return view;
        }



}
