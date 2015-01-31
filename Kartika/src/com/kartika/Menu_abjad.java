package com.kartika;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class Menu_abjad extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_abjad);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
	}
	public void btn_a_Clicked(View v) {
		Intent panggil_class = new Intent(this, AActivity.class);
		startActivity(panggil_class);
	}
	public void btn_b_Clicked(View v) {
		Intent panggil_class = new Intent(this, BActivity.class);
		startActivity(panggil_class);
	}

	public void btn_c_Clicked(View v) {
		Intent panggil_class = new Intent(this, CActivity.class);
		startActivity(panggil_class);
	}

	public void btn_d_Clicked(View v) {
		Intent panggil_class = new Intent(this, DActivity.class);
		startActivity(panggil_class);
	}

	public void btn_e_Clicked(View v) {
		Intent panggil_class = new Intent(this, EActivity.class);
		startActivity(panggil_class);
	}

	public void btn_f_Clicked(View v) {
		Intent panggil_class = new Intent(this, FActivity.class);
		startActivity(panggil_class);
	}

	public void btn_g_Clicked(View v) {
		Intent panggil_class = new Intent(this, GActivity.class);
		startActivity(panggil_class);
	}

	public void btn_h_Clicked(View v) {
		Intent panggil_class = new Intent(this, HActivity.class);
		startActivity(panggil_class);
	}

	public void btn_i_Clicked(View v) {
		Intent panggil_class = new Intent(this, IActivity.class);
		startActivity(panggil_class);
	}

	public void btn_j_Clicked(View v) {
		Intent panggil_class = new Intent(this, JActivity.class);
		startActivity(panggil_class);
	}

	public void btn_k_Clicked(View v) {
		Intent panggil_class = new Intent(this, KActivity.class);
		startActivity(panggil_class);
	}

	public void btn_l_Clicked(View v) {
		Intent panggil_class = new Intent(this, LActivity.class);
		startActivity(panggil_class);
	}

	public void btn_m_Clicked(View v) {
		Intent panggil_class = new Intent(this, MActivity.class);
		startActivity(panggil_class);
	}

	public void btn_n_Clicked(View v) {
		Intent panggil_class = new Intent(this, NActivity.class);
		startActivity(panggil_class);
	}

	public void btn_o_Clicked(View v) {
		Intent panggil_class = new Intent(this, OActivity.class);
		startActivity(panggil_class);
	}

	public void btn_p_Clicked(View v) {
		Intent panggil_class = new Intent(this, PActivity.class);
		startActivity(panggil_class);
	}

	public void btn_q_Clicked(View v) {
		Intent panggil_class = new Intent(this, QActivity.class);
		startActivity(panggil_class);
	}

	public void btn_r_Clicked(View v) {
		Intent panggil_class = new Intent(this, RActivity.class);
		startActivity(panggil_class);
	}

	public void btn_s_Clicked(View v) {
		Intent panggil_class = new Intent(this, SActivity.class);
		startActivity(panggil_class);
	}

	public void btn_t_Clicked(View v) {
		Intent panggil_class = new Intent(this, TActivity.class);
		startActivity(panggil_class);
	}

	public void btn_u_Clicked(View v) {
		Intent panggil_class = new Intent(this, UActivity.class);
		startActivity(panggil_class);
	}

	public void btn_v_Clicked(View v) {
		Intent panggil_class = new Intent(this, VActivity.class);
		startActivity(panggil_class);
	}

	public void btn_w_Clicked(View v) {
		Intent panggil_class = new Intent(this, WActivity.class);
		startActivity(panggil_class);
	}

	public void btn_x_Clicked(View v) {
		Intent panggil_class = new Intent(this, XActivity.class);
		startActivity(panggil_class);
	}

	public void btn_y_Clicked(View v) {
		Intent panggil_class = new Intent(this, YActivity.class);
		startActivity(panggil_class);
	}

	public void btn_z_Clicked(View v) {
		Intent panggil_class = new Intent(this, ZActivity.class);
		startActivity(panggil_class);
	}

}

