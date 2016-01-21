package com.svs.myprojects.tabswipeinsidetabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by snehalsutar on 1/20/16.
 */
public class DemoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout resource that'll be returned
        View rootView = inflater.inflate(R.layout.tab1_fragment1, container, false);

        // Get the arguments that was supplied when
        // the fragment was instantiated in the
        // CustomPagerAdapter
        Bundle args = getArguments();
        ((TextView) rootView.findViewById(R.id.textView)).setText("Page " + args.getInt("page_position"));

        return rootView;
    }
}
