package com.example.id2013_03.android_app.TABS;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Imported necessary functions
     ---------------------------------------------------------------------------------------------------------------------------
*/
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.id2013_03.android_app.R;

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                            Main class for this section
     ---------------------------------------------------------------------------------------------------------------------------
*/
public class Overview extends Fragment {

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                        This page if inflated with a blank view...

                                    This is intended as it has not yet been implemented
     ---------------------------------------------------------------------------------------------------------------------------
*/
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Creating the view layout for this class... It calls the cml file tabbed_heritage
        // This is then stored into the variable view to make it easier to call upon again later
        View view = inflater.inflate(R.layout.overview, container, false);

/*
     ---------------------------------------------------------------------------------------------------------------------------
                                               Returning the root view
                                          This allows everything to be shown
     ---------------------------------------------------------------------------------------------------------------------------
*/
        return view;
    }

}
