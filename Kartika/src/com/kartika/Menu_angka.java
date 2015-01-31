package com.kartika;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Menu_angka extends Activity implements
MediaPlayer.OnCompletionListener {

private ImageButton tombol_play_1;
private ImageButton tombol_play_2;
private ImageButton tombol_play_3;
private ImageButton tombol_play_4;
private ImageButton tombol_play_5;
private ImageButton tombol_play_6;
private ImageButton tombol_play_7;
private ImageButton tombol_play_8;
private ImageButton tombol_play_9;
private ImageButton tombol_play_10;
private ImageButton tombol_play_0;

private MediaPlayer MPlayer_1;
private MediaPlayer MPlayer_2;
private MediaPlayer MPlayer_3;
private MediaPlayer MPlayer_4;
private MediaPlayer MPlayer_5;
private MediaPlayer MPlayer_6;
private MediaPlayer MPlayer_7;
private MediaPlayer MPlayer_8;
private MediaPlayer MPlayer_9;
private MediaPlayer MPlayer_10;
private MediaPlayer MPlayer_0;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_menu_angka);
setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

tombol_play_1 = (ImageButton) findViewById(R.id.Btn_1);
tombol_play_2 = (ImageButton) findViewById(R.id.Btn_2);
tombol_play_3 = (ImageButton) findViewById(R.id.Btn_3);
tombol_play_4 = (ImageButton) findViewById(R.id.Btn_4);
tombol_play_5 = (ImageButton) findViewById(R.id.Btn_5);
tombol_play_6 = (ImageButton) findViewById(R.id.Btn_6);
tombol_play_7 = (ImageButton) findViewById(R.id.Btn_7);
tombol_play_8 = (ImageButton) findViewById(R.id.Btn_8);
tombol_play_9 = (ImageButton) findViewById(R.id.Btn_9);
tombol_play_10 = (ImageButton) findViewById(R.id.Btn_10);
tombol_play_0 = (ImageButton) findViewById(R.id.Btn_0);


aktif();

tombol_play_1.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_1();
	}
});
tombol_play_2.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_2();
	}
});
tombol_play_3.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_3();
	}
});
tombol_play_4.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_4();
	}
});
tombol_play_5.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_5();
	}
});
tombol_play_6.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_6();
	}
});
tombol_play_7.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_7();
	}
});
tombol_play_8.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_8();
	}
});
tombol_play_9.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_9();
	}
});
tombol_play_10.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_10();
	}
});
tombol_play_0.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View view) {
		play_0();
	}
});

}

private void play_1() {
MPlayer_1.stop();
try {
	MPlayer_1.prepare();
	MPlayer_1.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_1.start();
tombol_play_1.setImageResource(R.drawable.item_1);
}

private void play_2() {
MPlayer_2.stop();
try {
	MPlayer_2.prepare();
	MPlayer_2.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_2.start();
tombol_play_2.setImageResource(R.drawable.item_2);
tombol_play_2.setEnabled(false);
}

private void play_3() {
MPlayer_3.stop();
try {
	MPlayer_3.prepare();
	MPlayer_3.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_3.start();
tombol_play_3.setImageResource(R.drawable.item_3);
tombol_play_3.setEnabled(false);
}

private void play_4() {
MPlayer_4.stop();
try {
	MPlayer_4.prepare();
	MPlayer_4.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_4.start();
tombol_play_4.setImageResource(R.drawable.item_4);
tombol_play_4.setEnabled(false);
}

private void play_5() {
MPlayer_5.stop();
try {
	MPlayer_5.prepare();
	MPlayer_5.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_5.start();
tombol_play_5.setImageResource(R.drawable.item_5);
tombol_play_5.setEnabled(false);
}

private void play_6() {
MPlayer_6.stop();
try {
	MPlayer_6.prepare();
	MPlayer_6.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_6.start();
tombol_play_6.setImageResource(R.drawable.item_6);
tombol_play_6.setEnabled(false);
}

private void play_7() {
MPlayer_7.stop();
try {
	MPlayer_7.prepare();
	MPlayer_7.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_7.start();
tombol_play_7.setImageResource(R.drawable.item_7);
tombol_play_7.setEnabled(false);
}

private void play_8() {
MPlayer_8.stop();
try {
	MPlayer_8.prepare();
	MPlayer_8.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_8.start();
tombol_play_8.setImageResource(R.drawable.item_8);
tombol_play_8.setEnabled(false);
}

private void play_9() {
MPlayer_9.stop();
try {
	MPlayer_9.prepare();
	MPlayer_9.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_9.start();
tombol_play_9.setImageResource(R.drawable.item_9);
tombol_play_9.setEnabled(false);
}

private void play_10() {
MPlayer_10.stop();
try {
	MPlayer_10.prepare();
	MPlayer_10.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_10.start();
tombol_play_10.setImageResource(R.drawable.item_10);
tombol_play_10.setEnabled(false);
}

private void play_0() {
MPlayer_0.stop();
try {
	MPlayer_0.prepare();
	MPlayer_0.seekTo(0);
} catch (Throwable t) {
	error_(t);
}
stop_all();
MPlayer_0.start();
tombol_play_0.setImageResource(R.drawable.item_0);
tombol_play_0.setEnabled(false);
}


@Override
public void onCompletion(MediaPlayer MP) {
stop_all();
}

private void TombolIsEnabled() {
tombol_play_1.setEnabled(true);
tombol_play_2.setEnabled(true);
tombol_play_3.setEnabled(true);
tombol_play_4.setEnabled(true);
tombol_play_5.setEnabled(true);
tombol_play_6.setEnabled(true);
tombol_play_7.setEnabled(true);
tombol_play_8.setEnabled(true);
tombol_play_9.setEnabled(true);
tombol_play_10.setEnabled(true);
tombol_play_0.setEnabled(true);
}
private void stop_all() {
tombol_play_1.setImageResource(R.drawable.item_1);
tombol_play_2.setImageResource(R.drawable.item_2);
tombol_play_3.setImageResource(R.drawable.item_3);
tombol_play_4.setImageResource(R.drawable.item_4);
tombol_play_5.setImageResource(R.drawable.item_5);
tombol_play_6.setImageResource(R.drawable.item_6);
tombol_play_7.setImageResource(R.drawable.item_7);
tombol_play_8.setImageResource(R.drawable.item_8);
tombol_play_9.setImageResource(R.drawable.item_9);
tombol_play_10.setImageResource(R.drawable.item_10);
tombol_play_0.setImageResource(R.drawable.item_0);

try {
	TombolIsEnabled();
} catch (Throwable t) {
	error_(t);
}

}

private void aktif() {
try {
	MPlayer_1 = MediaPlayer.create(this, R.raw.s01);
	MPlayer_1.setOnCompletionListener(this);
	MPlayer_2 = MediaPlayer.create(this, R.raw.s02);
	MPlayer_2.setOnCompletionListener(this);
	MPlayer_3 = MediaPlayer.create(this, R.raw.s03);
	MPlayer_3.setOnCompletionListener(this);
	MPlayer_4 = MediaPlayer.create(this, R.raw.s04);
	MPlayer_4.setOnCompletionListener(this);
	MPlayer_5 = MediaPlayer.create(this, R.raw.s05);
	MPlayer_5.setOnCompletionListener(this);
	MPlayer_6 = MediaPlayer.create(this, R.raw.s06);
	MPlayer_6.setOnCompletionListener(this);
	MPlayer_7 = MediaPlayer.create(this, R.raw.s07);
	MPlayer_7.setOnCompletionListener(this);
	MPlayer_8 = MediaPlayer.create(this, R.raw.s08);
	MPlayer_8.setOnCompletionListener(this);
	MPlayer_9 = MediaPlayer.create(this, R.raw.s09);
	MPlayer_9.setOnCompletionListener(this);
	MPlayer_10 = MediaPlayer.create(this, R.raw.s10);
	MPlayer_10.setOnCompletionListener(this);
	MPlayer_0 = MediaPlayer.create(this, R.raw.s00);
	MPlayer_0.setOnCompletionListener(this);

} catch (Throwable t) {
	error_(t);
}
TombolIsEnabled();
}

private void error_(Throwable t) {
AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setTitle("Failed!").setMessage(t.toString())
		.setPositiveButton("OK", null).show();
}
}