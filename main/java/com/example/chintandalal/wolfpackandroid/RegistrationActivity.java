package com.example.chintandalal.wolfpackandroid;

import java.util.Calendar;
import java.util.Random;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

public class RegistrationActivity extends Activity implements OnClickListener {
	ImageView bannerImage;
	EditText edtCalendar, edtFirstName, edtLastName, edtUserName, edtPassword, edtConfirmPassword, edtEmail;
	Button btnRegister, btnUpload;
	private Calendar calendar;
	int day, month, year;
	View header;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		bannerImage = (ImageView)findViewById(R.id.imageView1);
		edtCalendar = (EditText)findViewById(R.id.CalendarEditText);
		edtFirstName = (EditText)findViewById(R.id.firstNameEditText);
		edtLastName = (EditText)findViewById(R.id.lastNameEditText);
		edtUserName = (EditText)findViewById(R.id.userNameEditText);
		edtPassword = (EditText)findViewById(R.id.passwordEditText);
		edtConfirmPassword = (EditText)findViewById(R.id.confirmPasswordEditText);
		edtEmail = (EditText)findViewById(R.id.emailEditText);
		btnRegister = (Button)findViewById(R.id.RegisterButton);
		btnUpload = (Button)findViewById(R.id.uploadButton);
		header = findViewById(R.id.header);
		//set calendar for choose date
		calendar = Calendar.getInstance();
		day = calendar.get(Calendar.DAY_OF_MONTH);
		month = calendar.get(Calendar.MONTH);
		year = calendar.get(Calendar.YEAR);
		//call method
		randomBackground();
		setTypeFace();
		
		//listeners
		header.setOnClickListener(this);
		edtCalendar.setOnClickListener(this);
	}
	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub
		return new DatePickerDialog(this, datePickerListener, year, month, day);
	}
	
	private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
		  public void onDateSet(DatePicker view, int selectedYear,
		    int selectedMonth, int selectedDay) {
		   edtCalendar.setText(selectedDay + " / " + (selectedMonth + 1) + " / "
		     + selectedYear);
		  }
	};
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
		 	edtCalendar.setTypeface(hintFont);
		 	edtConfirmPassword.setTypeface(hintFont);
		 	edtFirstName.setTypeface(hintFont);
		 	edtLastName.setTypeface(hintFont);
		    edtPassword.setTypeface(hintFont);
		    edtUserName.setTypeface(hintFont);
		    edtEmail.setTypeface(hintFont);
		    btnRegister.setTypeface(hintFont);
		    btnUpload.setTypeface(hintFont);
		    final Typeface fontLabel = Typeface.createFromAsset(getAssets(), "fonts/NeutraDisplay-Bold.ttf");
	 }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.header){
			Intent homeIntent = new Intent(RegistrationActivity.this, MainActivity.class);
			startActivity(homeIntent);
		}
		if (v.getId()==R.id.CalendarEditText){
			showDialog(0);
		}
	}
}
