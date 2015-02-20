package com.example.chintandalal.fragments;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.chintandalal.wolfpackandroid.R;

import java.io.File;

/**
 * Created by chintandalal on 2/12/15.
 */
public class GoWildFragments extends Fragment{

    LinearLayout myGallery;

    public GoWildFragments(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rooView = inflater.inflate(R.layout.fragment_go_wild, container, false);

        myGallery = (LinearLayout)rooView.findViewById(R.id.mygallery);

        ActionBarActivity actionBarActivity = (ActionBarActivity) getActivity();
        ActionBar actionBar = actionBarActivity.getSupportActionBar();
        actionBar.setTitle("SUGGESTIONS");
        String ExternalStorageDirectoryPath = Environment
                .getExternalStorageDirectory()
                .getAbsolutePath();

        String targetPath = ExternalStorageDirectoryPath + "/Pictures/Instagram/";

        Toast.makeText(getActivity().getApplicationContext(), targetPath, Toast.LENGTH_LONG).show();
        File targetDirector = new File(targetPath);

        File[] files = targetDirector.listFiles();
        for (int i = 0;i<10;i++) {
            myGallery.addView(insertPhoto(null, i + 1));
        }
        return rooView;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    View insertPhoto(String path, int id)
        {

        Bitmap bm = BitmapFactory.decodeResource(getActivity().getApplicationContext().getResources(),
                R.drawable.icon_events);
        RelativeLayout layout = new RelativeLayout(getActivity().getApplicationContext());
        layout.setLayoutParams(new RelativeLayout.LayoutParams(250, 250));
        layout.setGravity(Gravity.CENTER);

        ImageView imageView = new ImageView(getActivity().getApplicationContext());
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(220, 200);
        params.addRule(RelativeLayout.ALIGN_PARENT_TOP, layout.getId());
        imageView.setLayoutParams(params);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bm);
        imageView.setId(id);

        TextView textView = new TextView(getActivity().getApplicationContext());
        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, layout.getId());
        textView.setLayoutParams(params2);
        textView.setText("Abc Xyz");
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView.setTextSize(15);
        layout.addView(imageView);
        layout.addView(textView);

        return layout;
    }

    public Bitmap decodeSampledBitmapFromUri(String path, int reqWidth, int reqHeight) {
        Bitmap bm = null;

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        bm = BitmapFactory.decodeFile(path, options);

        return bm;
    }

    public int calculateInSampleSize(

            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {
            if (width > height) {
                inSampleSize = Math.round((float)height / (float)reqHeight);
            } else {
                inSampleSize = Math.round((float)width / (float)reqWidth);
            }
        }

        return inSampleSize;
    }
}
