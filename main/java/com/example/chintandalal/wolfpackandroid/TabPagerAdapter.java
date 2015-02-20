//package com.example.chintandalal.wolfpackandroid;
//
///**
// * Created by LLC on 2/18/2015.
// */
//        import android.support.v4.app.Fragment;
//        import android.support.v4.app.FragmentManager;
//        import android.support.v4.app.FragmentStatePagerAdapter;
//
//        import com.example.chintandalal.fragments.BuildFragment;
//        import com.example.chintandalal.fragments.GoWildFragments;
//        import com.example.chintandalal.fragments.NavigationDrawerFragment;
//
//public class TabPagerAdapter extends FragmentStatePagerAdapter
//{
//        public TabPagerAdapter(FragmentManager fm)
//        {
//            super(fm);
//            // TODO Auto-generated constructor stub
//        }
//
//        @Override
//        public Fragment getItem(int i)
//        {
//            switch (i)
//            {
//                case 0:
//                    //Fragement for Android Tab
//                    return new BuildFragment();
//                case 1:
//                    //Fragment for Ios Tab
//                    return new GoWildFragments();
//                case 2:
//                    //Fragment for Windows Tab
//                    return new NavigationDrawerFragment();
//            }
//            return null;
//        }
//
//        @Override
//        public int getCount()
//        {
//            // TODO Auto-generated method stub
//            return 3; //No of Tabs
//        }
//    }
