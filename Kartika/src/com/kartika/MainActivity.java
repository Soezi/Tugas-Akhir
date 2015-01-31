package com.kartika;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;

public class MainActivity extends Activity {
	protected boolean _aktif = true;
	protected int splash_ = 5000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		Thread splashTread = new Thread() {
			@Override
			public void run() {
				try {
					int delay_ = 0;
					while (_aktif && (delay_ < splash_)) {
						sleep(100);
						if (_aktif) {
							delay_ += 100;
						}
					}
				} catch (InterruptedException e) {
				} finally {
					finish();
					Intent panggil_class = new Intent(MainActivity.this,
							Menu_utama.class);
					startActivityForResult(panggil_class, 0);
				}
			}
		};
		splashTread.start();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if (event.getAction() == MotionEvent.ACTION_DOWN) {
			_aktif = false;
		}
		return true;
	}

	@Override
	public void onBackPressed() {
		finish();
		System.exit(0);
	}
}
