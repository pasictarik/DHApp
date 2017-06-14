package com.example.user.seconddiabetesapp.Onboarding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.seconddiabetesapp.R;

public class SignupFirst extends AppCompatActivity {

    EditText name;
    EditText surname;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_first);

        name=(EditText)findViewById(R.id.nameEditText);
        surname=(EditText)findViewById(R.id.surnameEditText);
        email=(EditText)findViewById(R.id.emailEditText);


        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("Name"))
                    name.setText("");
            }
        });

        surname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(surname.getText().toString().equals("Surname"))
                    surname.setText("");
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("Email Address"))
                    email.setText("");
            }
        });
    }
}
