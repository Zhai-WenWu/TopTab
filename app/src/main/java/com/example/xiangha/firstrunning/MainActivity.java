package com.example.xiangha.firstrunning;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private TabAdapter tabAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        initView();
        initTab();
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager = findViewById(R.id.view_page);
    }

    private void initTab() {
        tabAdapter = new TabAdapter(getSupportFragmentManager());
        ItemFragment goodsRecycleFragment = new ItemFragment();
        tabAdapter.addFragment(goodsRecycleFragment, "视频");
        goodsRecycleFragment = new ItemFragment();
        tabAdapter.addFragment(goodsRecycleFragment, "美食");

        mViewPager.setAdapter(tabAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
