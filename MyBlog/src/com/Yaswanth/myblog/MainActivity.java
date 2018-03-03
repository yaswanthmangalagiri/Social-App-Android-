package com.Yaswanth.myblog;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {

	String intro="HELLO THERE !I am Yaswanth, an undergraduate at IIT Roorkee. I made this app to show this as a demo. I started learning Java, later I came to know that Android App development is also an application of Java.So,I built this. is my first App.";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main);
		TextView listview=(TextView)findViewById(R.id.listview);
		listview.setText(intro);
		Button whati=(Button)findViewById(R.id.button1);
		whati.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view)
			{
				Intent whati=new Intent(MainActivity.this,WhatIDo.class);
				startActivity(whati);						
			}
		});
		Button iam=(Button)findViewById(R.id.button2);
		iam.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view)
			{				
				Intent wherei=new Intent(MainActivity.this,WhereIam.class);
				startActivity(wherei);				
			}
		});
	}
}

