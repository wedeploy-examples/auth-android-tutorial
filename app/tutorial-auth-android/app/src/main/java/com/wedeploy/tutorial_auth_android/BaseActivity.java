package com.wedeploy.tutorial_auth_android;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import com.wedeploy.android.WeDeploy;

/**
 * @author Víctor Galán Grande
 */

public class BaseActivity extends AppCompatActivity {

	protected WeDeploy weDeploy;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		weDeploy = new WeDeploy.Builder().build();
	}

	protected void showAlert(String title, String message) {
		new AlertDialog.Builder(this)
			.setTitle(title)
			.setMessage(message)
			.setPositiveButton(android.R.string.ok, null)
			.show();
	}
}
