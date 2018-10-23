package com.example.xiangha.firstrunning;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragments = new ArrayList<Fragment>();
    private final List<String> mFragmentTitles = new ArrayList<String>();

    public String getFragmentTitles(int position) {
        return mFragmentTitles.get(position);
    }

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment, String title) {
        if (mFragments != null) {
            mFragments.add(fragment);
        }

        if (mFragmentTitles != null) {
            mFragmentTitles.add(title);
        }

    }


    @Override
    public Fragment getItem(int position) {
        return mFragments != null && mFragments.size() > 0 ? mFragments.get(position) : null;
    }

    @Override
    public int getCount() {
        return mFragments != null ? mFragments.size() : 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles != null && mFragmentTitles.size() > 0 ? mFragmentTitles.get(position) : null;
    }

}
