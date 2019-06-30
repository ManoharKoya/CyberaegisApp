package com.example.cyberaegisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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
import android.widget.TextView;

public class AboutUs extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
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


        TextView mMessageWindow = (TextView) findViewById(R.id.messageWindow);
        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "Cyberaegis is established with the aim of providing interactive learning of essential IT related courses and Job support on various technologies to all Working/Non Managing Candidates throughout USA, UAE, UK, Canada, Saudi Arabia, New Zealand, South Africa,India and Many Other Countries. We provide training by a Real Time Professionals. We are driven by our belief in the potential of new technologies to enrich the world We are convinced that we can leverage these technologies to help individuals add more value to their career and allow us to synergistically grow together. We meet student needs in training and job oriented requirements on IT training. We also offer good quality tips to improve acquaintance more in the software training Courses & Computer IT Training at online to contend with today competitive software world." +
                "We train the students in different modes of directions to be the paramount in the online software training field as to make them finest amongst with latest technology. We have highly practiced and proficient faculty to polish the trainees in a contemporary manner to amplify their style of learning and grabbing the existing issues as fine as that helps them to grow intelligent in this field.";
        stringBuilder.append(someMessage);
        mMessageWindow.setText(stringBuilder.toString());

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)  {
                openContactUs();
            }
        });


    }

    public void openContactUs()
    {
        Intent intent = new Intent(this, ContactUs.class);
        startActivity(intent);
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
        getMenuInflater().inflate(R.menu.about_us, menu);
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
            startActivity(new Intent(this,MainActivity.class));
        } else if (id == R.id.Login) {
            startActivity(new Intent(this,login.class));
        } else if (id == R.id.nav_dashboard) {
            startActivity(new Intent(this,Dashboard.class));
        } else if (id == R.id.Enroll) {
            startActivity(new Intent(this,Enroll.class));
        } else if (id == R.id.nav_contactUs) {
            startActivity(new Intent(this, ContactUs.class));
        }  else if (id == R.id.nav_AboutUS) {
            startActivity(new Intent(this,AboutUs.class));
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
