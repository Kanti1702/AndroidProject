package com.example.chintandalal.wolfpackandroid;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.chintandalal.wolfpackandroid.R;


public class MainActivity extends Activity implements OnClickListener {
    TextView appLabel;
    TextView runLabel;
    TextView termLabel1 , termLabel2;
    Button facebookButton, loginButton, registerButton;
    ImageView infoImage;
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wolfpack_launcher);
        appLabel = (TextView)findViewById(R.id.appLabel);
        runLabel = (TextView)findViewById(R.id.runLabel);
        termLabel1 = (TextView)findViewById(R.id.termsLabel1);
        termLabel2 = (TextView)findViewById(R.id.termsLabel2);
        facebookButton = (Button)findViewById(R.id.FacebookButton);
        loginButton = (Button)findViewById(R.id.LoginButton);
        registerButton = (Button)findViewById(R.id.RegisterButton);
        infoImage = (ImageView)findViewById(R.id.infoImage);
        layout = (LinearLayout)findViewById(R.id.layout);

        //Method call
        setTypeFace();
        randomBackground();
        //Listener
        infoImage.setOnClickListener(this);
        registerButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);


    }

    public void randomBackground(){
        Resources res = getResources();
        final TypedArray myImage = res.obtainTypedArray(R.array.image);
        final Random random = new Random();

        int randomInt = random.nextInt(myImage.length());
        int drawableID = myImage.getResourceId(randomInt, -1);
        layout.setBackgroundResource(drawableID);
    }
    public void setTypeFace(){
        final Typeface fontLabel = Typeface.createFromAsset(getAssets(), "fonts/NeutraDisplay-Bold.ttf");
        appLabel.setTypeface(fontLabel);
        final Typeface fontRun = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Book.ttf");
        runLabel.setTypeface(fontRun);
        termLabel1.setTypeface(fontRun);
        termLabel2.setTypeface(fontRun);
        final Typeface buttonFont = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Light.ttf");
        facebookButton.setTypeface(buttonFont);
        loginButton.setTypeface(buttonFont);
        registerButton.setTypeface(buttonFont);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if(v.getId()==R.id.infoImage){
            Intent intent = new Intent(MainActivity.this, TutorialActivity.class);
            intent.putExtra("tutorialIndex", 0);
            startActivity(intent);
        }
        if(v.getId()==R.id.RegisterButton){
            Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
            intent.putExtra("registrationIndex", 0);
            startActivity(intent);
        }
        if(v.getId()==R.id.LoginButton){
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            //	 intent.putExtra("tutorialIndex", 0);
            startActivity(intent);
        }
    }
    public void changeImageColor(){

    }
}
