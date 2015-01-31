package com.kartika;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Lagu_cicak extends Activity {
	private MediaPlayer MPlayer;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lagu_cicak);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		buka_file_suara();
	}
	
	public void onResume() {
		super.onResume();
		stop_lagu();
		play_lagu();
	}

	private void play_lagu() {
		if (MPlayer != null && !MPlayer.isPlaying()) {
			MPlayer.setLooping(true);
			MPlayer.start();
		} else {
			MPlayer.setLooping(true);
		}
	}

	private void stop() {
		MPlayer.stop();
		try {
			MPlayer.prepare();
			MPlayer.seekTo(0);

		} catch (Throwable t) {
			error_(t);
		}
	}

	private void stop_lagu() {
		if (MPlayer.isPlaying()) {
			stop();
		}
	}

	private void buka_file_suara() {
		try {
			MPlayer = MediaPlayer.create(this, R.raw.cicak);
		} catch (Throwable t) {
			error_(t);
		}
	}

	private void error_(Throwable t) {
		AlertDialog.Builder pesan_error = new AlertDialog.Builder(this);
		pesan_error.setTitle("Failed!").setMessage(t.toString())
				.setPositiveButton("OK", null).show();
	}
	
	public void onBackPressed() {
		if (MPlayer.isPlaying()) {
			MPlayer.stop();
			stop_lagu();
		}
		finish();
	}
}
