package com.example.android.lowtohightrailguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new WaterSourcesFragment();
        } else if (position == 1){
            return new ResupplyFragment();
        } else if (position == 2){
            return new HiddenTreasuresFragment();
        }else {
            return new StatsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.water_sources);
        } else if (position == 1) {
            return mContext.getString(R.string.resupply);
        } else if (position == 2) {
            return mContext.getString(R.string.hidden_treasures);
        } else {
            return mContext.getString(R.string.stats);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
