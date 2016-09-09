package com.example.hp.testinglogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    Button signup,fb,google;
    TextView Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         email =(EditText)findViewById(R.id.email);
        password =(EditText)findViewById(R.id.password);
        signup =(Button)findViewById(R.id.signup);
        fb =(Button)findViewById(R.id.fb);
        google =(Button)findViewById(R.id.google);
        Login =(TextView)findViewById(R.id.login);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplication(),Register.class);
                startActivity(in);
            }
        });



    }
}
