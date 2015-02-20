package com.example.chintandalal.wolfpackandroid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgotPasswordActivity extends Activity implements OnClickListener {
	ImageView backImage;
	EditText edtForgotPassword;
	TextView tvFaorgotPassword;
	Button btnDone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forgot_password);
		backImage = (ImageView)findViewById(R.id.backImage);
		edtForgotPassword = (EditText)findViewById(R.id.forgotedittext);
		tvFaorgotPassword = (TextView)findViewById(R.id.forgotpasswordLabel);
		btnDone = (Button)findViewById(R.id.forgotbutton);
		
		//method calling
		setTypeFace();
		//listener
		backImage.setOnClickListener(this);
	}
	public void setTypeFace(){
		 final Typeface forgotpasswordFont = Typeface.createFromAsset(getAssets(), "fonts/NeutraDisplay-Bold.ttf");
		 	
		    tvFaorgotPassword.setTypeface(forgotpasswordFont);
		    final Typeface fontLabel = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Light.ttf");
		    edtForgotPassword.setTypeface(fontLabel);
		    btnDone.setTypeface(fontLabel);
	 }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.backImage){
			Intent backIntent = new Intent(ForgotPasswordActivity.this,LoginActivity.class);
			startActivity(backIntent);
		}
		
	}
	
	
}
