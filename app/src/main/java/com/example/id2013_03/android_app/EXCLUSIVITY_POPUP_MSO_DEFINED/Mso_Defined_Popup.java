package com.example.id2013_03.android_app.EXCLUSIVITY_POPUP_MSO_DEFINED;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.example.id2013_03.android_app.R;
import com.example.id2013_03.android_app.TABS.Exclusivity;
import com.example.id2013_03.android_app.TABS.Overview;

import static android.view.Gravity.BOTTOM;

/**
 * Created by ID2013-03 on 27/05/2016.
 */
public class Mso_Defined_Popup extends AppCompatActivity{

    ViewPager viewPager;
    TabLayout tabLayout;
    ImageView closeDefined;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mso_defined_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((width * 1), (int) (height * .975));

        getWindow().setGravity(BOTTOM);

        closeDefined = (ImageView)findViewById(R.id.closeDefined);
        closeDefined.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        viewPager = (ViewPager) findViewById(R.id.exclusivity_pop_View);
        viewPager.setAdapter(new CustomAdapter(getSupportFragmentManager(), getApplicationContext()));
        viewPager.setOffscreenPageLimit(2);

        tabLayout = (TabLayout) findViewById(R.id.exclusivity_pop_Tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

        });


    }


    private class CustomAdapter extends FragmentStatePagerAdapter {
        private String fragments[] = {"Sport Series", "Super Series", "Ultimate Series"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new SportsSeries();
                case 1:
                    return new SuperSeries();
                case 2:
                    return new UltimateSeries();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }


    }
}