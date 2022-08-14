package com.example.tabviewandviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tab;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//          finding view by id of TabLayout and ViewPager-----
        tab = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPage);

       ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
       viewPager.setAdapter(adapter);

       //Syncronis ViewPager and TabLayout------
        tab.setupWithViewPager(viewPager);
    }
}