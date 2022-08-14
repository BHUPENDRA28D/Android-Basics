package com.example.tabviewandviewpager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    //Constructer---

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new CFragment();
        }
        else if (position==1)
            return  new CplusFragment();

        else
            return new JAVAFragment();
    }

    @Override
    public int getCount() {
        return 3; // no. of Tabs (3 fragments)
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0){
            return "" +
                    "C Programming" ;
        }
        else if (position==1)
            return "C++";

        else
            return "JAVA";

    }
}
