package com.example.cyberaegisapp;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import com.ms.square.android.expandabletextview.ExpandableTextView;


public class CourseDesc extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    String longText="Introduction to Python:\n1).  Different types of predictive analytics – prediction, forecasting,\n\n2).  Optimization , segmentation etc.\n\n3).  Simple Linear Regression.\n\n4).  Model development and interpretation.\n\n5).  Multiple linear regressions";
    String decisiontree="Decision trees \n1). C5.0\n\n2).  Classification and Regression trees\n\n3).  Process of tree building\n\n4).  Entropy and Gini Index\n\n5).  Problem of over fitting\n\n6).  Pruning a tree back\n\n.7).  Trees for Prediction (Linear) – example\n\n.8).  Tress for classification models – example";
    String introR="Introduction to R \n1).  A Primer to R programming\n\n2).  What is R? similarities to OOP and SQL\n\n3).  Creating new variables or updating existing variables\n\n4).  IF statements and conditional loops - For, while etc.\n\n5).  String manipulations\n\n6).Sub setting data from matrices and data.frames\n\n7).  Casting and melting data to long and wide format.\n\n8).  Merging datasets";
    String dataAnalysis="Exploratory Data Analysis And Visualization\n1). Getting data into R – reading from files\n\n2). Cleaning and preparing the data – converting data types (Character to numeric etc.)\n\n3). Handling missing values – Imputation or replacing with place holder\n\n4). Visualization in R using ggplot2(plots and charts) – Histograms, bar\n\n5). charts, box plot, scatter plots\n\n6). Adding more dimensions to the plots\nAdding more dimensions to the plots\n\n7). Visualization using Tableau( Introduction)\n\n8). Correlation – Positive , negative and no correlation\n\n9). Correlation vs. causation";
    String practical="Practical Use Cases And Best Practices\n1).  Business problem to an analytical problem\n\n2). Problem definition and analytical method selection\n\n3). Guidelines in model development\n";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_desc);
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


        SpannableString ss= new SpannableString(longText);
        StyleSpan bold=new StyleSpan(Typeface.BOLD);
        ss.setSpan(bold,0,23, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        SpannableString ss1= new SpannableString(decisiontree);
        StyleSpan bold1=new StyleSpan(Typeface.BOLD);
        ss1.setSpan(bold1,0,14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        SpannableString ss2= new SpannableString(introR);
        StyleSpan bold2=new StyleSpan(Typeface.BOLD);
        ss2.setSpan(bold2,0,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        SpannableString ss3= new SpannableString(dataAnalysis);
        StyleSpan bold3=new StyleSpan(Typeface.BOLD);
        ss3.setSpan(bold3,0,43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


        SpannableString ss4= new SpannableString(practical);
        StyleSpan bold4=new StyleSpan(Typeface.BOLD);
        ss4.setSpan(bold4,0,38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);




        ExpandableTextView expt1=(ExpandableTextView)findViewById(R.id.expand_text_view);
        expt1.setText(ss);

        ExpandableTextView expt2=(ExpandableTextView)findViewById(R.id.expand_text_view1);
        expt2.setText(ss1);

        ExpandableTextView expt3=(ExpandableTextView)findViewById(R.id.expand_text_view2);
        expt3.setText(ss2);


        ExpandableTextView expt4=(ExpandableTextView)findViewById(R.id.expand_text_view3);
        expt4.setText(ss3);

        ExpandableTextView expt5=(ExpandableTextView)findViewById(R.id.expand_text_view4);
        expt5.setText(ss4);

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
        getMenuInflater().inflate(R.menu.course_desc, menu);
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
