package com.example.sixth_level2.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sixth_level2.R;
import com.example.sixth_level2.ViewPager.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class TabLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        TabLayout tabLayout = findViewById(R.id.tb_1);
        for (int i = 1; i <= 4; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(""+i));
        }
        ViewPager viewPager = findViewById(R.id.vp_use_with_tb);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }
}
