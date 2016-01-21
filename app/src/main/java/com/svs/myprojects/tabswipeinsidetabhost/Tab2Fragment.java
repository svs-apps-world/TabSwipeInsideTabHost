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
public class Tab2Fragment extends Fragment {

    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;
    Context mFragContext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab2_view, container, false);
//        view.setBackgroundColor(Color.CYAN);

        mCustomPagerAdapter = new CustomPagerAdapter(getFragmentManager());

        mViewPager = (ViewPager) view.findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);

        return view;
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
                    title = "SAP Implementation";
                    break;
                case 1:
                    title = "Application System Support";
                    break;
                case 2:
                    title = "Offshore Solutions";
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
}