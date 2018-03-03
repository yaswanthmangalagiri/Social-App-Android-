package com.Yaswanth.myblog;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageButton;
import android.content.Intent;
import android.view.View;
import android.net.Uri;

public class WhereIam extends Activity
{
	String text="I am available on";
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.whereiam);
		TextView tv=(TextView)findViewById(R.id.iamon);
		tv.setText(text);
	ImageButton fbb=(ImageButton)findViewById(R.id.fbb);
		fbb.setImageResource(R.drawable.facebook);
		ImageButton linkdb=(ImageButton)findViewById(R.id.linkdb);
		linkdb.setImageResource(R.drawable.linkedin);
		ImageButton googleb=(ImageButton)findViewById(R.id.googleb);
		googleb.setImageResource(R.drawable.google);
		ImageButton bloggerb=(ImageButton)findViewById(R.id.bloggerb);
		bloggerb.setImageResource(R.drawable.blogger);
		fbb.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view)
			{
		Intent fbi=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/yaswanthnmangalagiri"));
				startActivity(fbi);
			}
			});		
		linkdb.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view)
			{
				Intent linkdi=new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/yaswanth-mangalagiri-327056124"));
				startActivity(linkdi);
			}
		});
		googleb.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view)
			{
				Intent googlei=new Intent(Intent.ACTION_VIEW,Uri.parse("https://plus.google.com/110378162456343054458"));
				startActivity(googlei);
			}
		});
		bloggerb.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view)
			{
				Intent bloggeri=new Intent(Intent.ACTION_VIEW,Uri.parse("https://yaswanthmangalagiri.blogspot.com"));
				startActivity(bloggeri);
			}
		});

		}
		}

