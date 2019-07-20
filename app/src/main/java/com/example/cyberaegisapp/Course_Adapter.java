package com.example.cyberaegisapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Course_Adapter extends RecyclerView.Adapter<Course_Adapter.Course_viewholder>{

    private Context context;
    private List<com.example.cyberaegisapp.Course_row_parts> course_list;


    public Course_Adapter(Context context, List<com.example.cyberaegisapp.Course_row_parts> course_list) {
        this.context = context;
        this.course_list = course_list;
    }

    @NonNull
    @Override
    public Course_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(context);
        View view =layoutInflater.inflate(R.layout.cardviewlist,parent,false);
        Course_viewholder holder = new Course_viewholder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Course_viewholder holder, int position) {

        Course_row_parts course= course_list.get(position);
        holder.course_title.setText(course.getCourse());
        holder.course_desc.setText(course.getCourse_description());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(course.getImage()));


    }

    @Override
    public int getItemCount() {
        return course_list.size();
    }

    class Course_viewholder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView course_title,course_desc;


        public Course_viewholder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            course_title=itemView.findViewById(R.id.course);
            course_desc=itemView.findViewById(R.id.course_desc);


        }


        }

}
