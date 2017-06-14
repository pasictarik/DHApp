package com.example.user.seconddiabetesapp.Onboarding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

import com.example.user.seconddiabetesapp.R;

public class SignupSecond extends AppCompatActivity {

    EditText password;
    EditText confirmPassword;
    EditText average;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_second);

        password=(EditText)findViewById(R.id.passwordEditText);
        confirmPassword=(EditText)findViewById(R.id.confirmPasswordEditText);
        average=(EditText)findViewById(R.id.averageEditText);

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(password.getText().toString().equals("Password"))
                    password.setText("");
                password.setTransformationMethod(new PasswordTransformationMethod().getInstance());
            }
        });

        confirmPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(confirmPassword.getText().toString().equals("Confirm password"))
                    confirmPassword.setText("");
                confirmPassword.setTransformationMethod(new PasswordTransformationMethod().getInstance());
            }
        });

        average.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(average.getText().toString().equals("0.0"))
                    average.setText("");
            }
        });
    }

}
