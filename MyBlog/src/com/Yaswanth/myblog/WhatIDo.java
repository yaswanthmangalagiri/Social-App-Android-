package com.Yaswanth.myblog;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class WhatIDo extends Activity
{
	String title="HACKED";
	String what="I do couple of things  1) Coding ) Ethical Hacking";
	String message="Just making fun.. You are safe..";			
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.whatido);		
	TextView myTextView = (TextView)findViewById(R.id.whati);
	Button whereb=(Button)findViewById(R.id.whereb);
	whereb.setOnClickListener(new View.OnClickListener() {
		public void onClick(View view)
		{
			Intent wherei=new Intent(WhatIDo.this,WhereIam.class);
			startActivity(wherei);						
		}
	});
	myTextView.setText(what);
	AlertDialog.Builder hack=new AlertDialog.Builder(this);
	hack.setTitle("HACKED");
	hack.setMessage(message);
	hack.show();
	}
}
