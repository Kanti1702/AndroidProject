package com.example.chintandalal.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chintandalal.wolfpackandroid.EditProfileActivity;
import com.example.chintandalal.wolfpackandroid.R;

/**
 * Created by chintandalal on 2/18/15.
 */
public class SettingFragment extends Fragment{
    TextView tvEditProfile, tvMyIntrest, tvresetPassword, tvTerms, tvFrequent, tvSignOut;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_settings, container, false);
        tvEditProfile = (TextView)layout.findViewById(R.id.editProfileText);
        tvMyIntrest = (TextView)layout.findViewById(R.id.myIntrestText);
        tvresetPassword = (TextView)layout.findViewById(R.id.resetPasswordText);
        tvTerms = (TextView)layout.findViewById(R.id.termsText);
        tvFrequent = (TextView)layout.findViewById(R.id.frequentText);
        tvSignOut = (TextView)layout.findViewById(R.id.signoutText);

        tvEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getActivity(), EditProfileActivity.class));

                getActivity().overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
                getActivity().finish();
            }
        });

        return layout;

    }
}
