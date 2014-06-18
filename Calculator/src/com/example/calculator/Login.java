package com.example.calculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Build;

public class Login extends ActionBarActivity implements OnClickListener {
	//declaration
	EditText etemail;
	EditText etpassword;
	Button btnsubmit;
	Button btncancel;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		//initializing of values
		
		etemail=(EditText) findViewById(R.id.textView1);
		etpassword=(EditText) findViewById(R.id.textView2);
		btnsubmit=(Button) findViewById(R.id.btnsubmitlogin);
        btnsubmit.setOnClickListener(this);
        btncancel=(Button) findViewById(R.id.btncancellogin);
        btncancel.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnsubmitlogin:
		
	     Toast.makeText(getApplicationContext(), "welcome to kenya", Toast.LENGTH_SHORT).show();
	     startActivity(new Intent(getApplicationContext(),Homescreen.class));
	     break;
	     
	case R.id.btncancellogin:
	    	 Toast.makeText(getApplicationContext(),"love getting more crazy",Toast.LENGTH_LONG).show();
	         startActivity(new Intent(getApplicationContext(),Welcome.class));
		break;

	default:
		break;
	}
	
	
	
	}

}
