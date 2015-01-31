package com.kartika;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class Menu_lagu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_menu_lagu);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}
	public void btn_lagu1_Clicked(View v) {
		Intent panggil_class = new Intent(this,Lagu_pelangi.class);
		startActivity(panggil_class);
	}
	
	public void btn_lagu2_Clicked(View v) {
		Intent panggil_class = new Intent(this,Lagu_burung_kutilang.class);
		startActivity(panggil_class);
	}
	
	public void btn_lagu3_Clicked(View v) {
		Intent panggil_class = new Intent(this,Lagu_cicak.class);
		startActivity(panggil_class);
	}
	
	public void btn_lagu4_Clicked(View v) {
		Intent panggil_class = new Intent(this,Lagu_naik_delman.class);
		startActivity(panggil_class);
	}
	
	public void btn_lagu5_Clicked(View v) {
		Intent panggil_class = new Intent(this,Lagu_topi.class);
		startActivity(panggil_class);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_lagu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
