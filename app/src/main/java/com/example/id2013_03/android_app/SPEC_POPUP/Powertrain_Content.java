package com.example.id2013_03.android_app.SPEC_POPUP;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;

import com.example.id2013_03.android_app.R;

/**
 * Created by ID2013-03 on 31/05/2016.
 */
public class Powertrain_Content extends Fragment {
    ImageView engineBtn;
    ImageView transmissionBtn;
    ImageView exhaustBtn;
    ImageView lubricationBtn;

    ScrollView powerScroll;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.powertrain_content, container, false);

        engineBtn = (ImageView)rootView.findViewById(R.id.powertrain_engine);
        transmissionBtn = (ImageView)rootView.findViewById(R.id.powertrain_transmission);
        exhaustBtn = (ImageView)rootView.findViewById(R.id.powertrain_exhaust);
        lubricationBtn = (ImageView)rootView.findViewById(R.id.powertrain_lubricant);

        powerScroll = (ScrollView)rootView.findViewById(R.id.power_Scroll);

        engineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 840);

            }
        });

        transmissionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 1680);
            }
        });

        exhaustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 2520);
            }
        });

        lubricationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                powerScroll.scrollTo(0, 3360);
            }
        });

        return rootView;
    }

}
