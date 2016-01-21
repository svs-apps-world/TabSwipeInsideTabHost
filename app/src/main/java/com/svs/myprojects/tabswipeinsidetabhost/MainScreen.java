package com.svs.myprojects.tabswipeinsidetabhost;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class MainScreen extends FragmentActivity {

    // Fragment TabHost as mTabHost
    private FragmentTabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Solutions"),
                Tab1Fragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Services"),
                Tab2Fragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Industry Expertise"),
                Tab3Fragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("Industry "),
                Tab3Fragment.class, null);
    }




}
