 package com.example.chintandalal.wolfpackandroid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TutorialActivity extends Activity implements OnClickListener {
	TextView infoLabel1;
	Button storyButton;
	ImageView backButton ,tutoialImage;
	
	
	int maxTutorial = 6;
	int tutorialIndex = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tutorial);
		infoLabel1 = (TextView)findViewById(R.id.infoLabel1);
		storyButton = (Button)findViewById(R.id.storyButton1);
		backButton = (ImageView)findViewById(R.id.backImage);
		tutoialImage = (ImageView)findViewById(R.id.tutorialOne);
		backButton.setOnClickListener(this);
		storyButton.setOnClickListener(this);
		setTypeFace();
		
		Bundle extras = getIntent().getExtras();
		if (extras != null) 
		{
		    this.tutorialIndex = extras.getInt("tutorialIndex");
		}
		
		System.out.print(this.tutorialIndex);
		
		switch(this.tutorialIndex)
		{
		case 0:
			this.infoLabel1.setText("Do you find yourself scrolling through your phone looking for buddies to hang out with only to realize they've all moved away or gotten married?");
			this.tutoialImage.setImageResource(R.drawable.scene1);
			this.storyButton.setText("STORY OF MY LIFE");
			break;
		case 1:
			this.infoLabel1.setText("We feel ya. If you've lost touch with your buddies or you're looking to meet new ones, Wolfpack has got your back!");
			this.tutoialImage.setImageResource(R.drawable.wolfpack_tutorial_scene2);
			this.storyButton.setText("YOU DO?");
			break;
		case 2:
			this.infoLabel1.setText("Yeah! Using our advanced algorithms, Wolfpack helps you discover buddies nearby with common intrests in your SAME SITUATION!");
			this.tutoialImage.setImageResource(R.drawable.wolfpack_tutorial_scene3);
			this.storyButton.setText("COOL! TELL ME MORE.");
			break;
			
		case 3:
			this.infoLabel1.setText("Totally. Using our advanced algorithms, we make event suggestions to YOU based on the type of events and the intrests of event attendees.");
			this.tutoialImage.setImageResource(R.drawable.wolfpack_tutorial_scene4);
			this.storyButton.setText("EVENTS? LIKE WHAT?");
			break;
		case 4:
			this.infoLabel1.setText("Poker nights. Pick up basketball, you name it. Group and categorize your friends and buddies based on their favorite things to do and their key interests.");
			this.tutoialImage.setImageResource(R.drawable.wolfpack_tutorial_scene5);
			this.storyButton.setText("WOW! I LIKE THAT!");
			break;
		case 5:
			this.infoLabel1.setText("Looking for something local? Browse events in your area organized by distance and filtered by your interests. No more going to bars alone!");
			this.tutoialImage.setImageResource(R.drawable.wolfpack_tutorial_scene6);
			this.storyButton.setText("COOL! BUT I'VE GOT UNIQUE HOBBIES...");
			break;
		case 6:
			this.infoLabel1.setText("Don't we all? You can get specific! Search the wild for something cool. The power of the pack has got your back! Give it a try now.");
			this.tutoialImage.setImageResource(R.drawable.wolfpack_tutorial_scene7);
			this.storyButton.setText("GET STARTED");
			break;
		default:
			break;
		}
		
	}

	public void setTypeFace(){
		  final Typeface fontRun = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Book.ttf");
	      infoLabel1.setTypeface(fontRun);
//	      infoLabel2.setTypeface(fontRun);
//	      infoLabel3.setTypeface(fontRun);
//	      infoLabel4.setTypeface(fontRun);
	      
		  final Typeface fontButtonStory = Typeface.createFromAsset(getAssets(), "fonts/Gotham-Light.ttf");
		  storyButton.setTypeface(fontButtonStory);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.backImage)
		{
			int nextTutorialIndex = this.tutorialIndex - 1;
			
			if(nextTutorialIndex < 0)
			{
				Intent homeIntent = new Intent(TutorialActivity.this, MainActivity.class);
				startActivity(homeIntent);
			}
			else
			{
				Intent nextIntent = new Intent(TutorialActivity.this, TutorialActivity.class);
				nextIntent.putExtra("tutorialIndex", nextTutorialIndex);
				startActivity(nextIntent);
			}
			
//			Intent homeIntent = new Intent(infoActivity1.this, MainActivity.class);
//			startActivity(homeIntent);
		}
		if(v.getId()==R.id.storyButton1)
		{
			int nextTutorialIndex = this.tutorialIndex + 1;
			
			if(nextTutorialIndex > this.maxTutorial)
			{
				Intent homeIntent = new Intent(TutorialActivity.this, MainActivity.class);
				startActivity(homeIntent);
			}
			else
			{
				Intent nextIntent = new Intent(TutorialActivity.this, TutorialActivity.class);
				nextIntent.putExtra("tutorialIndex", nextTutorialIndex);
				startActivity(nextIntent);
			}
		}
	}
}
