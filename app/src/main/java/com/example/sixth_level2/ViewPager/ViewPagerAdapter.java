package com.example.sixth_level2.ViewPager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return position + 1 + "";
    }

    @Override
    public Fragment getItem(int i) {
        if (0 == i) {
            Fragment firstFragment = new ViewPager1();
            return firstFragment;
        } else if (1 == i) {
            Fragment secondFragment = new ViewPager2();
            return secondFragment;
        } else if (2 == i) {
            Fragment thirdFragment = new ViewPager3();
            return thirdFragment;
        } else if (3 == i) {
            Fragment forthFragment = new ViewPager4();
            return forthFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
