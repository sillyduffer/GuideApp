package com.example.android.lowtohightrailguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ResupplyFragment();
        } else if (position == 1){
            return new HiddenTreasuresFragment();
        } else if (position == 2){
            return new StatsFragment();
        }else {
            return new WaterSourcesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
