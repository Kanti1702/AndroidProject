package com.example.chintandalal.wolfpackandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.chintandalal.fragments.SettingFragment;

/**
 * Created by chintandalal on 2/19/15.
 */
public class EditProfileActivity extends Activity implements View.OnClickListener{
    ImageView backImageArrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        backImageArrow = (ImageView)findViewById(R.id.imagebackArrow);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(EditProfileActivity.this, SettingFragment.class));
        overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
        finish();
    }


//  	@Override
//	public void onBackPressed()
//	{
//		//overridePendingTransition(R.anim.push_right_out, R.anim.push_right_in);
//		Intent i = new Intent(this, Invitations.class);
//		i.putExtra(ServerConnection.COMMAND, commandTitle);
//		i.putExtra(StringDefines.ACTIVITY_TITLE, activityTitle);
//	    startActivity(i);
//	    overridePendingTransition(R.anim.push_left_in, R.anim.push_right_out);
//		finish();
//	}
}
