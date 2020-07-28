package com.katibu.misaumodelacademy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class PageAdapter extends FragmentStatePagerAdapter {

    String[] tabarray = new String[]{"From Propriator", "Mission & Vission", "Our Galant Staffs"};
    Integer tabnumber = 3;

   public PageAdapter(FragmentManager fm){
       super(fm);
   }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                PropriatorFragment propriatorFragment1 = new PropriatorFragment();
                return propriatorFragment1;
            case 1:
                MissionFragment missionFragment1 = new MissionFragment();
                return missionFragment1;
            case 2:
                OfficersFragment officersFragment1 = new OfficersFragment();
                return officersFragment1;

                }
                return null;

    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
