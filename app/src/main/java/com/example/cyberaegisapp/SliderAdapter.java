package com.example.cyberaegisapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.cyberaegisapp.R;

public class SliderAdapter extends PagerAdapter {

    private int[] image_res = {R.drawable.cyb1,R.drawable.cyb2,R.drawable.cyb3,R.drawable.cyb4,R.drawable.cyb5,
            R.drawable.cyb6,R.drawable.cyb7,R.drawable.cyb8,R.drawable.cyb9,R.drawable.cyb10,R.drawable.cyb11};
    private Context ctx;
    private LayoutInflater linf;

    public SliderAdapter(Context ctx){
        this.ctx=ctx;
    }



    @Override
    public int getCount() {
        return image_res.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view==(LinearLayout)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        linf = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = linf.inflate(R.layout.swipe_layout,container,false);
        ImageView imgV  = (ImageView) item_view.findViewById(R.id.image);
        ImageView imgV1 = (ImageView) item_view.findViewById(R.id.image1);
        //TextView txtV = (TextView) item_view.findViewById(R.id.text);
        imgV.setImageResource(image_res[position]);
        if(position+1>=image_res.length){
            position = ((position+1)%image_res.length)-1;
        }
        imgV1.setImageResource(image_res[position+1]);
        //txtV.setText("Image : "+position);
        container.addView(item_view);
        return item_view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
