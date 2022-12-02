package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab1_Fragment();
            case 1:
                return new Tab2_Fragment();
            case 2:
                return new Tab3_Fragment();
            case 3:
                return new Tab4_Fragment();
            case 4:
                return new Tab5_Fragment();
            default:
                return new Tab1_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
