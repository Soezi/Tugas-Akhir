package com.kartika;

import com.kartika.R;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.media.MediaPlayer;

public class HActivity extends Activity implements
MediaPlayer.OnCompletionListener {
private ImageButton tombol_suara;
private MediaPlayer MPlayer;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
this.requestWindowFeature(Window.FEATURE_NO_TITLE);
setContentView(R.layout.activity_h);

tombol_suara = (ImageButton) findViewById(R.id.play);
aktif();

tombol_suara.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play();
	}
});

}

@Override
public void onCompletion(MediaPlayer MP) {
stop();
}

private void play() {
stop();
MPlayer.start();
tombol_suara.setImageResource(R.drawable.item_h_2);
tombol_suara.setEnabled(false);
}

private void stop() {
MPlayer.stop();
tombol_suara.setImageResource(R.drawable.item_h_1);
try {
	MPlayer.prepare();
	MPlayer.seekTo(0);
	tombol_suara.setEnabled(true);
} catch (Throwable t) {
	error_(t);
}
}

private void buka_file_suara() {
try {
	MPlayer = MediaPlayer.create(this, R.raw.h);
	MPlayer.setOnCompletionListener(this);
} catch (Throwable t) {
	error_(t);
}
}

private void aktif() {
buka_file_suara();
tombol_suara.setEnabled(true);
}

private void error_(Throwable t) {
AlertDialog.Builder pesan_error = new AlertDialog.Builder(this);
pesan_error.setTitle("Failed!").setMessage(t.toString())
		.setPositiveButton("OK", null).show();
}

@Override
public void onBackPressed() {
if (MPlayer.isPlaying()) {
	MPlayer.stop();
}
finish();
}
}
