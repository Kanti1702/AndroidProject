package com.example.chintandalal.wolfpackandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chintandalal.fragments.NavigationDrawerFragment;
import com.example.chintandalal.tabs.SlidingTabLayout;

/**
 * Created by chintandalal on 2/10/15.
 */
public class NavigationActivity extends ActionBarActivity implements View.OnClickListener{

    private Toolbar toolbar;
    SlidingTabLayout mTab;
    ViewPager mPager;
  //  ImageView imageBuild, imageMyPack, imageEvents, imageGoWild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_drawer);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
//        imageBuild = (ImageView) findViewById(R.id.imagBuild);
//        imageEvents = (ImageView) findViewById(R.id.imageEvents);
//        imageMyPack = (ImageView) findViewById(R.id.imageMyPack);
//        imageGoWild = (ImageView) findViewById(R.id.imageGoWild);
//        imageBuild.setOnClickListener(this);
//        imageGoWild.setOnClickListener(this);
//        imageMyPack.setOnClickListener(this);
//        imageEvents.setOnClickListener(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        NavigationDrawerFragment drawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);
      //  mPager = (ViewPager)findViewById(R.id.pager);
       // mTab = (SlidingTabLayout)findViewById(R.id.tabs);
       // mPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
       // mTab.setViewPager(mPager);

    }

    @Override
    public void onClick(View v) {
//        if(v.getId() == R.id.imagBuild){
//            Toast.makeText(getApplicationContext(),"Build Select", Toast.LENGTH_LONG).show();
//        }
//        else if(v.getId() == R.id.imageEvents){
//            Toast.makeText(getApplicationContext(),"Event Select", Toast.LENGTH_LONG).show();
//        }
//        else if(v.getId() == R.id.imageMyPack){
//            Toast.makeText(getApplicationContext(),"MyPack Select", Toast.LENGTH_LONG).show();
//        }
//        else if(v.getId() == R.id.imageGoWild){
//            Toast.makeText(getApplicationContext(),"Go Wild Select", Toast.LENGTH_LONG).show();
//        }
    }

//    class MyPagerAdapter extends FragmentPagerAdapter{
//        String[] tabs;
//        public MyPagerAdapter(FragmentManager fm) {
//            super(fm);
//            tabs = getResources().getStringArray(R.array.tabs);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            MyFragment myFragment = MyFragment.getInstance(position);
//            return myFragment;
//        }
//
//        @Override
//        public int getCount() {
//            return 2;
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return tabs[position];
//        }
//    }
//
//    public static class MyFragment extends Fragment{
//        private TextView textView;
//        public static MyFragment getInstance(int position){
//            MyFragment myFragment = new MyFragment();
//            Bundle args = new Bundle();
//            args.putInt("position", position);
//            myFragment.setArguments(args);
//            return myFragment;
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//            View layout = inflater.inflate(R.layout.fragment_my, container, false);
//            textView = (TextView)layout.findViewById(R.id.position);
//            Bundle bundle = getArguments();
//            if(bundle!= null){
//                textView.setText("The Page selected is " + bundle.getInt("position"));
//            }
//            return layout;
//        }
//    }
}
