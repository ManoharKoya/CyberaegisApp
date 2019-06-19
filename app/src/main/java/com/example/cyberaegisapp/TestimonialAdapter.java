package com.example.cyberaegisapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TestimonialAdapter extends PagerAdapter {

    private String[] names= {"-'Deepika.G'","-'Ms Vara Lakshmi'","-'Madhusudhan Redyy'"};
    private String[] descr={"As part of my academics and after long search I have joined Cyberaegis for 6 month industrial training program for Computer Hardware, MCSE, LINUX, CCNA, VMWARE, FIREWALLS. Today I am so much happy and grateful to Veerareddy sir and his teaching team for there knowledge delivery and care. In feature when ever I get time I will join cyberaegis again for ETHICAL HACKING. I heard form many students they are best in this."
            ,"I am Vara Lakshmi ..I am completed Tally ERP & SAP FICO # Cyberaegis. i have faced friendly atmosphere during my training period and they provide lot of time for practice and especially Nisha Medam the way she teach us and the way she clarify our doubts is simply awesome. Thank you Cyberaegis & Thanks alot Nisha Madam" ,
                "I joined Cyberaegis for SeleniUm tool 1 month back and at that time I was having no knowledge about testing and now after completion of the course, I have a very good knowledge of the tool and testing. My tutor is an excellent tutor as he guided me in every way to get a better career. Thank You."
                            };
    private Context ctx;
    private LayoutInflater linf;

    public TestimonialAdapter(Context ctx){ this.ctx=ctx;}


    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return (view==(LinearLayout)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        linf = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = linf.inflate(R.layout.testimonial_layout,container,false);
        TextView t1 = (TextView) item_view.findViewById(R.id.desc);
        TextView t2 = (TextView) item_view.findViewById(R.id.name);
        t1.setText(descr[position]);
        t2.setText(names[position]);
        container.addView(item_view);
        return item_view;
    }
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
