package com.example.pip_boy;

import android.R;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.container);
        tabLayout = findViewById(R.id.tabs);
        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new StatFragment(), "Stats");
        adapter.addFragment(new HealthFragment(), "Quest");
        adapter.addFragment(new MapFragment(), "Map");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        String name = (String) getIntent().getStringExtra("name");
        String age = (String) getIntent().getStringExtra("age");
        String gender = (String) getIntent().getStringExtra("gender");
        String classType = (String) getIntent().getStringExtra("class");
        setAge(age);
        setName(name);
        setClass(classType);
        setGender(gender);
    }
    private void setAge(String setAge) {
        age = setAge;
    }
    public static String age;
    private void setName(String setName) {
        name = setName;
    }
    public static String name;
    private void setGender(String setGender) {
        gender = setGender;
    }
    public static String gender;
    private void setClass(String setClass) {
        classType = setClass;
    }
    public static String classType;
}
