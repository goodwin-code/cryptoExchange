package com.example.cryptoexchange.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cryptoexchange.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class home extends Fragment {
    View view;
    TabLayout tabLayout;
    TabItem trending,beginner,gainer,loser,fav;
    ViewPager viewPager;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        trending = (TabItem) view.findViewById(R.id.trending);
        beginner = (TabItem) view.findViewById(R.id.beginners);
        gainer = (TabItem) view.findViewById(R.id.gainer);
        loser = (TabItem) view.findViewById(R.id.loser);
        fav = (TabItem) view.findViewById(R.id.fav);




        return view;
    }
}