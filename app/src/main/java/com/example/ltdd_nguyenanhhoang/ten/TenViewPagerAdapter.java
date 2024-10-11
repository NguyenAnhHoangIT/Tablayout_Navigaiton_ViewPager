package com.example.ltdd_nguyenanhhoang.ten;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.ltdd_nguyenanhhoang.fragment.LhpFragment;
import com.example.ltdd_nguyenanhhoang.fragment.MsvFragment;
import com.example.ltdd_nguyenanhhoang.fragment.TenFragment;

public class TenViewPagerAdapter extends FragmentStatePagerAdapter {
    public TenViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new fragment_tab1();
            case 1:
                return new fragment_tab2();
            case 2:
                return new fragment_tab3();
            default:
                return new fragment_tab1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Tab 1";
            case 1:
                return "Tab 2";
            case 2:
                return "Tab 3";
            default:
                return  "Tab 1";
        }
    }
}
