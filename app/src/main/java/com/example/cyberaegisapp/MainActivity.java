package com.example.cyberaegisapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.InflateException;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ViewPager vpg,vpg_2;
    SliderAdapter adapter;
    TestimonialAdapter adapter_2;
    ImageView i1,i2;
    TextView t1,t2;
    LinearLayout cd,cd1;

    private Timer timer,timer_2;
    private int CurPosition=0,CurPosition_2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

         cd = (LinearLayout) findViewById(R.id.cd3);
         cd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(v.getContext(),OnlineCourses.class));
             }
         });

        cd1 = (LinearLayout) findViewById(R.id.cd1);
        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),ClassroomCourses.class));
            }
        });



        vpg = findViewById(R.id.viewPager);
        i1 = findViewById(R.id.image);
        i2 = findViewById(R.id.image1);
        adapter = new SliderAdapter(this);
        vpg.setAdapter(adapter);
        slideShow();

        vpg_2 = findViewById(R.id.viewPager_2);
        t1 = findViewById(R.id.desc);
        t2 = findViewById(R.id.name);
        adapter_2 = new TestimonialAdapter(this);
        vpg_2.setAdapter(adapter_2);
        slideShow_2();

    }



    public void slideShow_2(){
        final Handler handle1 = new Handler();
        final Runnable runable1 = new Runnable() {
            @Override
            public void run() {
                if (CurPosition_2 == 3) CurPosition_2 = 0;
                vpg_2.setCurrentItem(CurPosition_2++, true);
            }
        };
        timer_2 = new Timer();
        timer_2.schedule(new TimerTask() {
            @Override
            public void run() {
                handle1.post(runable1);
            }
        }, 350, 3500 );
    }


    public void slideShow(){
        final Handler handle = new Handler();
        final Runnable runable = new Runnable() {
            @Override
            public void run() {
                if (CurPosition == 11) CurPosition = 0;
                vpg.setCurrentItem(CurPosition++, true);
            }
        };
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handle.post(runable);
            }
        }, 250, 2500 );
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
        getMenuInflater().inflate(R.menu.main, menu);
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
//            startActivity(new Intent(this,MainActivity.class));
        } else if (id == R.id.Login) {
            startActivity(new Intent(this,login.class));
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
