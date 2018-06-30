package com.daiict.developers.intern;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    AHBottomNavigation bottomNavigation;
    NoSwipePager viewPager;
    BottomBarAdapter bottomBarAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_coordinator);

        bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

        AHBottomNavigationItem item1 = new AHBottomNavigationItem(getResources().getString(R.string.dashboard_text), R.drawable.dashboard_icon);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(getResources().getString(R.string.exams_text), R.drawable.exams_icon);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(getResources().getString(R.string.profile_text), R.drawable.profile_icon);

        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);

        // Making custom view pager
        viewPager = (NoSwipePager) findViewById(R.id.pager);
        viewPager.setPagingEnabled(false);

        bottomBarAdapter = new BottomBarAdapter(getSupportFragmentManager());

        // Creating Fragments
        FragmentOne fragmentOne = new FragmentOne();
        FragmentTwo fragmentTwo = new FragmentTwo();
        FragmentThree fragmentThree = new FragmentThree();

        // Adding fragments
        bottomBarAdapter.addFragments(fragmentOne);
        bottomBarAdapter.addFragments(fragmentTwo);
        bottomBarAdapter.addFragments(fragmentThree);

        viewPager.setAdapter(bottomBarAdapter);

        bottomNavigation.setCurrentItem(0);

        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {

                if (!wasSelected)
                    viewPager.setCurrentItem(position);
                return true;
            }
        });

        // Styling bottom navigation
        bottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.white));
        bottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        bottomNavigation.setAccentColor(getResources().getColor(R.color.colorPrimary));
    }

    private int fetchColor(@ColorRes int color) {
        return ContextCompat.getColor(this, color);
    }
}

