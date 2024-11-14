package com.example.pairgame;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class pair extends BaseAdapter {
   private Context context;

   public pair (Context context){
       this.context = context;
   }


    @Override
    public int getCount() {
        return 12;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView;
                if(view== null)
                {
                    imageView = new ImageView(this.context);
                    imageView.setLayoutParams(new GridView.LayoutParams(250,300));
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);

                }

                else imageView = (ImageView)view;
                {

                    imageView.setImageResource(R.drawable.questionmark);
                }
                return imageView;

    }
}
