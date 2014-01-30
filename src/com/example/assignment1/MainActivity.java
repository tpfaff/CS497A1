package com.example.assignment1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void parseButtonPressed(View v)
	{
		Intent intent = new Intent(MainActivity.this,StatsActivity.class);
		EditText userText=(EditText)findViewById(R.id.textField); //get a handle to the editText field.
		String textEntered=userText.getText().toString(); //get the data from the field
		intent.putExtra("dataEntered", textEntered); //put extra to pass the info to the new activity
		MainActivity.this.startActivity(intent); //start the new activity
	}
}
