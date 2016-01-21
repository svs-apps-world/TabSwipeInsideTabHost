package com.svs.myprojects.tabswipeinsidetabhost;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by snehalsutar on 1/20/16.
 */
public class Tab1Fragment extends Fragment {

    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    Context mFragContext;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mFragContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.tab1_view, container, false);
        mCustomPagerAdapter = new CustomPagerAdapter(getFragmentManager());

        mViewPager = (ViewPager) V.findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);

        return V;
    }


    class CustomPagerAdapter extends FragmentStatePagerAdapter {

//        Context mContext;

        public CustomPagerAdapter(FragmentManager fm) {
            super(fm);
//            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {

            // Create fragment object
            Fragment fragment = new DemoFragment();

            // Attach some data to the fragment
            // that we'll use to populate our fragment layouts
            Bundle args = new Bundle();
            args.putInt("page_position", position + 1);

            // Set the arguments on the fragment
            // that will be fetched in the
            // DemoFragment@onCreateView
            fragment.setArguments(args);

            return fragment;
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title="";
            switch (position){
                case 0:
                    title = "SAP HANA Consultants";
                    break;
                case 1:
                    title = "SAP BPC Consultants";
                    break;
                case 2:
                    title = "SAP Mobility Solutions";
                    break;
                case 3:
                    title = "SAP 3D Visual Enterprise Software Consulting";
                    break;
                case 4:
                    title = "SAP Cloud Consultants";
            }
            return title; //"Page " + (position + 1);
        }
    }


//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
////        getMenuInflater().inflate(R.menu.gesture, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
////        if (id == R.id.action_settings) {
////            return true;
////        }
//        return super.onOptionsItemSelected(item);
//    }


}