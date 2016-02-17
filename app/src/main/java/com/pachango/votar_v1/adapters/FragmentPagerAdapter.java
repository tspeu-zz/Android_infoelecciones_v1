package com.pachango.votar_v1.adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.pachango.votar_v1.fragments.PusheenFragment;


public class FragmentPagerAdapter extends android.support.v4.app.FragmentPagerAdapter {

    private final String [] TITLES = {"Home", "Partidos", "Encuestas","Estadisticas", "Informacion"};
    private final int FRAGMENT_COUNT = 5;


    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public int getCount() {

        return FRAGMENT_COUNT;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return TITLES[position];
    }

    @Override
    public Fragment getItem(int position) {

          return new PusheenFragment();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }


}