package com.wedeploy.tutorial_auth_android;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.wedeploy.android.Callback;
import com.wedeploy.android.transport.Response;
import com.wedeploy.tutorial_auth_android.databinding.SignUpActivityBinding;

public class SignUpActivity extends BaseActivity {

	private SignUpActivityBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_up_activity);

		binding = DataBindingUtil.setContentView(this, R.layout.sign_up_activity);

		binding.goToLogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});

		binding.signUp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String name = binding.name.getText().toString();
				String email = binding.email.getText().toString();
				String password = binding.password.getText().toString();

				if (!name.isEmpty() && !email.isEmpty() && !password.isEmpty()) {
					doSignUp(name, email, password);
				} else {
					Toast.makeText(SignUpActivity.this, "You have to fill all the fields",
						Toast.LENGTH_SHORT).show();
				}
			}
		});
	}

	private void doSignUp(String name, String email, String password) {
		// Add the code of the tutorial below

		// -------
	}
}
