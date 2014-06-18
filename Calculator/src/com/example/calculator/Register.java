package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class Register extends ActionBarActivity {
	//declaration
	EditText etfirstname;
	EditText etsecondname;
	EditText etemail;
	EditText etidnumber;
	Button btnsubmit;
	Button btncancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		//initializing
		etfirstname=(EditText) findViewById(R.id.editText1);
		etsecondname=(EditText) findViewById(R.id.editText2);
		etemail=(EditText) findViewById(R.id.editText3);
		etidnumber=(EditText) findViewById(R.id.editText4);
		btnsubmit= (Button) findViewById(R.id.btnsubmitregister);
		btnsubmit.setOnClickListener((OnClickListener) this); 
		btncancel= (Button) findViewById(R.id.btncancelregister);
		btncancel.setOnClickListener((OnClickListener) this);
		
		}

	
		@SuppressLint("ShowToast")
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btnsubmitregister:
			     Toast.makeText(getApplicationContext(), "love going wild", Toast.LENGTH_SHORT).show();
			     startActivity(new Intent(getApplicationContext(),Register.class));
				
				break;
			case R.id.btnlogin:
				Toast.makeText(getApplicationContext(), "Lets get mad people", Toast.LENGTH_SHORT);
				startActivity(new Intent(getApplicationContext(),Login.class));

			default:
				break;
			}
			

		
	}
	}

