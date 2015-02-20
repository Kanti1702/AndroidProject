package com.example.chintandalal.fragments;

import android.app.ActionBar;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import  android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

import com.example.chintandalal.wolfpackandroid.R;

import java.io.File;

/**
 * Created by chintandalal on 2/13/15.
 */
public class BuildFragment extends Fragment {

  //  LinearLayout myGallery;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.activity_build, container, false);
        return layout;
    }

}
