package com.example.hyunwoo.sampleviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hyunwoo on 2016. 8. 2..
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> items = new ArrayList<>();

    public void add(Fragment f) {
        items.add(f);
        notifyDataSetChanged();
    }

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
