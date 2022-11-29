package com.example.apppqst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityLogin extends AppCompatActivity {
    Button loginbutton;
    ImageView backbtn;
    EditText password, username;
    TextView forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbutton=findViewById(R.id.btn_login);
        backbtn=findViewById(R.id.backbtn);
        password=findViewById(R.id.inputpass);
        username=findViewById(R.id.username);
        forgot=findViewById(R.id.forgotpass);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String LoginUsername = String.valueOf(username.getText());
                String Password = String.valueOf(password.getText());
                Intent intent=new Intent(view.getContext(),MainAppActivity.class);
                startActivity(intent);
            }
        });
    }
}