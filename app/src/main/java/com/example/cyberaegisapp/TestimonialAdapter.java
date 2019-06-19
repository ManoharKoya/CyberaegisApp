package com.example.cyberaegisapp;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class TestimonialAdapter extends PagerAdapter {

    private String[] names= {"Deepika.G","Ms Vara Lakshmi","Madhusudhan Redyy"};
    private String[] descr={"As part of my academics and after long search I have joined Cyberaegis for 6 month industrial training program for Computer Hardware, MCSE, LINUX, CCNA, VMWARE, FIREWALLS. Today I am so much happy and grateful to Veerareddy sir and his teaching team for there knowledge delivery and care. In feature when ever I get time I will join cyberaegis again for ETHICAL HACKING. I heard form many students they are best in this."
            ,"I am Vara Lakshmi ..I am completed Tally ERP & SAP FICO # Cyberaegis. i have faced friendly atmosphere during my training period and they provide lot of time for practice and especially Nisha Medam the way she teach us and the way she clarify our doubts is simply awesome. Thank you Cyberaegis & Thanks alot Nisha Madam" ,
                "I joined Cyberaegis for SeleniUm tool 1 month back and at that time I was having no knowledge about testing and now after completion of the course, I have a very good knowledge of the tool and testing. My tutor is an excellent tutor as he guided me in every way to get a better career. Thank You."
                            };

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
        return super.instantiateItem(container, position);
    }
}
