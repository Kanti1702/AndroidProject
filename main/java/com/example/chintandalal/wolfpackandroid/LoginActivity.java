package com.example.chintandalal.wolfpackandroid;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.chintandalal.fragments.NavigationDrawerFragment;

public class LoginActivity extends Activity implements OnClickListener {
	ImageView bannerImage;
	EditText edtUserName, edtPassword;
	TextView tvRegister, tvForgotPassword;
	Button btnLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		bannerImage = (ImageView)findViewById(R.id.bannerImage);
		edtUserName = (EditText)findViewById(R.id.UserNameEditText);
		edtPassword = (EditText)findViewById(R.id.PasswordEditText);
		tvRegister = (TextView)findViewById(R.id.RegisterLabel);
		tvForgotPassword = (TextView)findViewById(R.id.ForgotPasswordLabel);
		btnLogin = (Button)findViewById(R.id.loginbutton);

        //method calling
		randomBackground();
		setTypeFace();
		//listenrs
		tvRegister.setOnClickListener(this);
		tvForgotPassword.setOnClickListener(this);
		btnLogin.setOnClickListener(this);
	}
	 public void randomBackground(){
	   	  Resources res = getResources();
	         final TypedArray myImage = res.obtainTypedArray(R.array.imagebanner);
	         final Random random = new Random();
	         
	         int randomInt = random.nextInt(myImage.length());
	         int drawableID = myImage.getResourceId(randomInt, -1);
	         bannerImage.setBackgroundResource(drawableID);
	   }
	 public void setTypeFace(){
		 final Typeface hintFont = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Light.ttf");
		 	
		    edtPassword.setTypeface(hintFont);
		    edtUserName.setTypeface(hintFont);
		    btnLogin.setTypeface(hintFont);
		    final Typeface fontLabel = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Medium.ttf");
		    tvRegister.setTypeface(fontLabel);
		    tvForgotPassword.setTypeface(fontLabel);
	 }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.RegisterLabel){
			Intent registerIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
			startActivity(registerIntent);
		}
		if (v.getId()==R.id.ForgotPasswordLabel){
			Intent forgotpasswordIntent =new Intent(LoginActivity.this, ForgotPasswordActivity.class);
			startActivity(forgotpasswordIntent);
		}
		if (v.getId()==R.id.loginbutton){
			Intent loginIntent = new Intent(LoginActivity.this, NavigationActivity.class);
			startActivity(loginIntent);
		}
	}
}
