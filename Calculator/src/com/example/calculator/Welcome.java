package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Welcome extends ActionBarActivity {
  Button btnregister,btnlogin;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		// initializing of variables
		btnregister = (Button) findViewById(R.id.btnregister);
		btnregister.setOnClickListener((OnClickListener) this);
		btnlogin =(Button) findViewById(R.id.btnlogin);
		btnlogin.setOnClickListener((OnClickListener) this);
				
		
	}
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btnlogin:
	     Toast.makeText(getApplicationContext(), "love going wild", Toast.LENGTH_SHORT).show();
	     startActivity(new Intent(getApplicationContext(),Login.class));
		
		break;
	case R.id.btnregister:
		Toast.makeText(getApplicationContext(), "Lets get mad people", Toast.LENGTH_SHORT);
		startActivity(new Intent(getApplicationContext(),Register.class));

	default:
		break;
	}
	

}}
