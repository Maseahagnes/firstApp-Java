package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class Homescreen extends ActionBarActivity {
	//declaration
	EditText etnumberone;
	EditText etnumbertwo;
	EditText etresults;
	Button btnaddition;
	Button btnsubstraction;
	Button btndivision;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_homescreen);
		//initialization
		etnumberone=(EditText) findViewById(R.id.editText1);
		etnumbertwo=(EditText) findViewById(R.id.editText2);
		etresults=(EditText) findViewById(R.id.editText5);
		btnaddition=(Button) findViewById(R.id.button1);
		btnaddition.setOnClickListener((OnClickListener) this);
		btnsubstraction=(Button) findViewById(R.id.button2);
		btnsubstraction.setOnClickListener((OnClickListener) this);
		btndivision=(Button) findViewById(R.id.button3);
		btndivision.setOnClickListener((OnClickListener) this);
		
		
	}

}
