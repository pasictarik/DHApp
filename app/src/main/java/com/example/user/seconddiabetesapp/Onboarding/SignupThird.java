package com.example.user.seconddiabetesapp.Onboarding;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.seconddiabetesapp.R;

public class SignupThird extends AppCompatActivity{
    EditText doctorName;
    EditText doctorSurname;
    EditText doctorEmail;
    Button submitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_third);

        doctorName=(EditText)findViewById(R.id.doctorNameEditText);
        doctorSurname=(EditText)findViewById(R.id.doctorSurnameEditText);
        doctorEmail=(EditText)findViewById(R.id.doctorEmailEditText);
        submitBtn=(Button)findViewById(R.id.submitBtn);


        doctorName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doctorName.getText().toString().equals("Name"))
                    doctorName.setText("");
            }
        });

        doctorSurname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doctorSurname.getText().toString().equals("Surname"))
                    doctorSurname.setText("");
            }
        });

        doctorEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(doctorEmail.getText().toString().equals("Email Address"))
                    doctorEmail.setText("");
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
