package com.kartika;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Menu_utama extends Activity {
	private MediaPlayer MPlayer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_menu_utama);
		
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		buka_file_suara();
	}
	public void btn_abjad_Clicked(View v) {
		Intent panggil_class = new Intent(this,Menu_abjad.class);
		stop_intro();
		startActivity(panggil_class);
	}
	
	public void btn_angka_Clicked(View v) {
		Intent panggil_class = new Intent(this,Menu_angka.class);
		stop_intro();
		startActivity(panggil_class);
	}
	
	public void btn_lagu_Clicked(View v) {
		Intent panggil_class = new Intent(this,Menu_lagu.class);
		stop_intro();
		startActivity(panggil_class);
	}
	
	public void btn_cerita_Clicked(View v) {
		Intent panggil_class = new Intent(this,Cerita.class);
		stop_intro();
		startActivity(panggil_class);
	}
	
	public void btn_about_Clicked(View v) {
		Intent panggil_class = new Intent(this,About.class);
		startActivity(panggil_class);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		stop_intro();
		play_intro();
	}

	private void play_intro() {
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

	private void stop_intro() {
		if (MPlayer.isPlaying()) {
			stop();
		}
	}

	private void buka_file_suara() {
		try {
			MPlayer = MediaPlayer.create(this, R.raw.taman_kanak2x);
		} catch (Throwable t) {
			error_(t);
		}
	}

	private void error_(Throwable t) {
		AlertDialog.Builder pesan_error = new AlertDialog.Builder(this);
		pesan_error.setTitle("Failed!").setMessage(t.toString())
				.setPositiveButton("OK", null).show();
	}
	
	@Override
	public void onBackPressed() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setIcon(R.drawable.ic_launcher);
		builder.setTitle("Anak Kartika");
		builder.setMessage("Tutup Aplikasi KARTIKA ?")
				.setCancelable(false)
				.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int id) {
						Intent keluar = new Intent(Intent.ACTION_MAIN);
						keluar.addCategory(Intent.CATEGORY_HOME);
						keluar.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						finish();
						stop_intro();
						startActivity(keluar);
					}
				})
				.setNegativeButton("Tidak",
						new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog, int id) {
								dialog.cancel();
							}
						}).show();
	}
}
