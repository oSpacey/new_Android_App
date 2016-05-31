package com.example.id2013_03.android_app.Exclusivity_TABS;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.id2013_03.android_app.R;

/**
 * Created by ID2013-03 on 26/05/2016.
 */
public class GrandReveal extends Fragment {

    ImageView backToTop;

    ViewPager viewPager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.grand_reveal, container, false);

        viewPager = (ViewPager)getActivity().findViewById(R.id.vert_view);
        backToTop = (ImageView)rootView.findViewById(R.id.grand_BackTop);

        backToTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });



        return rootView;
    }
}
