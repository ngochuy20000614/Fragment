package com.example.test_image_rounded;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class AdapterViewPager extends FragmentStatePagerAdapter {

    ListViewFragment listViewFragment;
    GridViewFragment gridViewFragment;
    public AdapterViewPager(@NonNull FragmentManager fm) {
        super(fm);

        listViewFragment = new ListViewFragment();
        gridViewFragment = new GridViewFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return listViewFragment;
            case 1:
                return gridViewFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
