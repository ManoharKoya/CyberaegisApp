package com.example.cyberaegisapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourses extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private   RecyclerView recyclerView;
    private Course_Adapter adapter;
    private List<Course_row_parts> course_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_courses);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        course_list=new ArrayList<>();
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        course_list.add(new com.example.cyberaegisapp.Course_row_parts("Manual Testing","Manual testing is the process of using the functions and features of an application...",R.drawable.manual_testing));
        course_list.add(new com.example.cyberaegisapp.Course_row_parts("Advanced Java","Advanced Java comprises the very complex advanced programming like Swings,....",R.drawable.advanced_java));
        course_list.add(new com.example.cyberaegisapp.Course_row_parts("Android Web Services","A web service is a standard for exchanging information...",R.drawable.aws));
        course_list.add(new com.example.cyberaegisapp.Course_row_parts("C-Programming","C language is a low level language...",R.drawable.c_language));
        course_list.add(new com.example.cyberaegisapp.Course_row_parts("Linux Administrator","A linux system administrator is a person who is responsible for the configuration,...",R.drawable.linux));
        course_list.add(new com.example.cyberaegisapp.Course_row_parts("Machine Learning","Machine learning  provides systems the ability to automatically learn and...",R.drawable.machine_learing));
        course_list.add(new com.example.cyberaegisapp.Course_row_parts("Salesforce CRM ","Salesforce is a cloud-based customer relationship management (CRM) platform...",R.drawable.salesforce_development));
        course_list.add(new com.example.cyberaegisapp.Course_row_parts("SAP","The master data is used to create transactional data in SAP...",R.drawable.sap_mm));
        adapter=new Course_Adapter(this,course_list);
        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.online_courses, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
