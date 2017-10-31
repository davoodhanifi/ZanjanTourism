package com.hitech.src;

import java.util.ArrayList;

import com.gc.materialdesign.views.ButtonRectangle;
import com.hitech.qtourism.R;
import com.hitech.src.utility.ListAdapter;
import com.hitech.src.utility.TextViewPlus;
import com.nhaarman.listviewanimations.appearance.simple.AlphaInAnimationAdapter;
import com.nhaarman.listviewanimations.appearance.simple.SwingBottomInAnimationAdapter;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;

public class QazvinBio extends ActionBarActivity implements
android.view.View.OnClickListener {
    TextViewPlus txtview;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_view);
        mContext = this;
        setTitle(null);
        txtview = (TextViewPlus) findViewById(R.id.textView);
        txtview.setText(mContext.getString(R.string.about_zanjan));
    }


@Override
public boolean onCreateOptionsMenu(Menu menu) {
try {
	getMenuInflater().inflate(R.menu.activity_main, menu);
	menu.removeItem(R.id.actin_setting);
} catch (Exception e) {
}
return true;
}

@Override
public boolean onOptionsItemSelected(MenuItem item) {
// Handle action bar actions click
switch (item.getItemId()) {

case R.id.exit:
	try {
		this.finish();
	} catch (Exception e) {
		e.printStackTrace();
		this.finish();
	}
	return true;
default:
	return super.onOptionsItemSelected(item);
}
}

@Override
public void onClick(View view) {
try {
		Intent intent;
    	/*if (view == btnGallery) {
			try {
			   intent = new Intent(this, ImageGallery.class);
				startActivity(intent);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}  */
} catch (Exception e) {
	e.printStackTrace();
}
}

@Override
public void setTitle(CharSequence title) {
try {
	getSupportActionBar().setDisplayShowCustomEnabled(true);
	getSupportActionBar().setDisplayShowTitleEnabled(false);
	LayoutInflater inflator = LayoutInflater.from(mContext);
	View v = inflator.inflate(R.layout.titleview, null);
	((TextViewPlus) v.findViewById(R.id.title)).setText(title);
	getSupportActionBar().setCustomView(v);
} catch (Exception e) {
	e.printStackTrace();
}
}
}
