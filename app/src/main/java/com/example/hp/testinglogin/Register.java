package com.example.hp.testinglogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Register extends AppCompatActivity {
    EditText email, password, repassword, firstname, lastname, phonenumber;
    Button signup, fb, google;
    TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = (EditText) findViewById(R.id.emailreg);
        password = (EditText) findViewById(R.id.passworreg);
        repassword = (EditText) findViewById(R.id.rpwdreg);
        firstname = (EditText) findViewById(R.id.fnamereg);
        lastname = (EditText) findViewById(R.id.Lnamereg);
        phonenumber = (EditText) findViewById(R.id.pnumreg);
        fb = (Button) findViewById(R.id.fb);
        google = (Button) findViewById(R.id.google);
        register = (TextView) findViewById(R.id.Register);
        signup=(Button)findViewById(R.id.signup);

        signup.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplication(),MainActivity.class);
                startActivity(in);
            }
        });

    }
}