package com.example.id2013_03.android_app.EXCLUSIVITY_POPUP_MSO_LIMITED;

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

import com.example.id2013_03.android_app.EXCLUSIVITY_POPUP_MSO_BESPOKE.Bespoke_Paintwork;
import com.example.id2013_03.android_app.EXCLUSIVITY_POPUP_MSO_BESPOKE.Create_Your_Perfect_McLaren;
import com.example.id2013_03.android_app.EXCLUSIVITY_POPUP_MSO_BESPOKE.Custom_Interior_Tailoring;
import com.example.id2013_03.android_app.EXCLUSIVITY_POPUP_MSO_BESPOKE.Introduction_Bespoke;
import com.example.id2013_03.android_app.EXCLUSIVITY_POPUP_MSO_BESPOKE.Limitless_Customisation;
import com.example.id2013_03.android_app.R;

import static android.view.Gravity.BOTTOM;

/**
 * Created by ID2013-03 on 31/05/2016.
 */
public class Mso_Limited_Popup extends AppCompatActivity{

    ViewPager viewPager;
    TabLayout tabLayout;
    ImageView closeLimited;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mso_limited_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((width * 1), (int) (height * .95));

        getWindow().setGravity(BOTTOM);

        closeLimited = (ImageView)findViewById(R.id.closeLimited);
        closeLimited.setOnClickListener(new View.OnClickListener() {
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
        private String fragments[] = {"Introduction", "650S Can-AM (2016)", "650S Le Mans (2015)", "MSO 650S (2014)", "McLaren 50 12C Spider (2013)"};

        public CustomAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new Introduction_Limited();
                case 1:
                    return new Can_Am();
                case 2:
                    return new Le_Mans();
                case 3:
                    return new Mso();
                case 4:
                    return new McLaren_Spider();
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
