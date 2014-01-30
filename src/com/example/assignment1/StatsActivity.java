package com.example.assignment1;

import java.util.Scanner;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class StatsActivity extends Activity {

	String userText;
	int charCount=0;
	int wordCount=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text_analyze_layout);
		Intent intent=getIntent();
		userText=intent.getStringExtra("dataEntered"); //retrieve the text entered in the last activity
		if(userText!=" "){
			wordCount=1;
		}
	}

	@Override
	public View onCreateView(String name, Context context, AttributeSet attrs) {
		// TODO Auto-generated method stub

		return super.onCreateView(name, context, attrs);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		
		parseData();
		  
		 
		TextView charCountView=(TextView)findViewById(R.id.charCountTextView);
		TextView wordCountView=(TextView)findViewById(R.id.wordCountTextView);
		String charMetrics="There were "+charCount+" characters in your text!";
		String wordMetrics="There were "+wordCount+" words in your text!";
		charCountView.setText(charMetrics);
		wordCountView.setText(wordMetrics);
		
		super.onStart();
	}

	private void parseData()
	{
		for(char c:userText.toCharArray())
		{
			charCount++;
		}
		
		for(char c:userText.toCharArray())
		{
			if(c==' '){
				wordCount++;
			}
		}
	}
}
