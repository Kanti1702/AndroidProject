package com.example.chintandalal.fragments;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.example.chintandalal.adapter.VivzAdapter;
import com.example.chintandalal.menudrawer.NavDrawItem;
import com.example.chintandalal.wolfpackandroid.LoginActivity;
import com.example.chintandalal.wolfpackandroid.R;


import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class NavigationDrawerFragment extends Fragment implements VivzAdapter.ClickListener{
    public static final String PREF_FILE_NAME="testpref";
    public ActionBarDrawerToggle mDrawerToggle;
    public DrawerLayout mDrawerLayout;
    public static final String KEY_USER_LEARNED_DRAWER = "user_learned_drawer";
    private boolean mUserLearnedDrawer;
    private View containerView;
    private boolean mFromSavedInstance;
    private RecyclerView recyclerView;
    private VivzAdapter adapter;

    public NavigationDrawerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mUserLearnedDrawer = Boolean.valueOf(readFromPreferences(getActivity(), KEY_USER_LEARNED_DRAWER, "false"));
        if(savedInstanceState==null){
            mFromSavedInstance=true;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        mDrawerLayout = (DrawerLayout)layout.findViewById(R.id.drawer_layout);
        recyclerView = (RecyclerView)layout.findViewById(R.id.drawerList);
        adapter = new VivzAdapter(getActivity(), getData());
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return layout;
    }
    public void setUp(int fragmentId, DrawerLayout drawerLayout, final Toolbar toolbar) {
        containerView = getActivity().findViewById(fragmentId);
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle(getActivity(),drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

                if(!mUserLearnedDrawer){
                    mUserLearnedDrawer=true;
                    saveToPreferences(getActivity(),KEY_USER_LEARNED_DRAWER,mUserLearnedDrawer+"");
                }

                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                if(slideOffset < 0.6) {
                    toolbar.setAlpha(1 - slideOffset);
                }
                Log.d("VIVZ", "offset " + slideOffset);

            }
        };
        if(!mUserLearnedDrawer && !mFromSavedInstance) {
            mDrawerLayout.openDrawer(containerView);
        }
        mDrawerLayout.setDrawerListener(mDrawerToggle);
        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState();
            }
        });
    }



    public static  void saveToPreferences(Context context, String preferenceName, String preferenceValue){
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(preferenceName,preferenceValue);
        editor.apply();
    }
    public static  String readFromPreferences(Context context, String preferenceName, String defaultValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getString(preferenceName, defaultValue);
    }


    public static List<NavDrawItem> getData() {
        List<NavDrawItem> data = new ArrayList<>();
        int[] icons = {R.drawable.icon_gowild, R.drawable.icon_build, R.drawable.icon_gowild, R.drawable.icon_event, R.drawable.icon_mypack, R.drawable.icon_profile, R.drawable.icon_settings};

        String[] titles = {"GO WILD", "BUILD WOLFPACK", "PACK REQUESTS", "EVENTS", "MY PACK", "MY PROFILE", "SETTINGS"};
        for (int i = 0; i < titles.length && i < icons.length; i++) {
            NavDrawItem current = new NavDrawItem();
            current.iconId = icons[i];
            current.title = titles[i];
            data.add(current);
        }
        return data;
    }

    @Override
    public void itemClicked(View view, int position) {

         //       startActivity(new Intent(getActivity(), LoginActivity.class));
                displayView(position);
        mDrawerLayout.closeDrawers();
    }

    private void displayView(int position){
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new GoWildFragments();
                break;
            case 1:
                fragment = new BuildFragment();
                break;
            case 2:
                fragment = new PackRequestFragment();
                break;
            case 3:
                fragment = new EventsFragment();
                break;
            case 4:
                fragment = new MyPackFragment();
                break;
            case 5:
                fragment = new MyProfileFragment();
                break;
            case 6:
                fragment = new SettingFragment();
                break;
            default:
                break;
        }
        if (fragment != null){
              FragmentManager fragmentManager = getFragmentManager();
              fragmentManager.beginTransaction().replace(R.id.frame_container, fragment).commit();
           //    recyclerView.setSelected(true);
          //     mDrawerLayout.closeDrawer(recyclerView);
            //update selected item and title, then close the drwer

        }
    }
}
