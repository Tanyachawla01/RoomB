package com.example.roomb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdminLogin extends AppCompatActivity {



    EditText adminID;
    EditText adminPassword;

    Button adminLoginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        setTitle("Admin Login");

        adminID = findViewById(R.id.adminloginid);
        adminPassword = findViewById(R.id.adminloginpassword);

        adminLoginButton = findViewById(R.id.userloginButton);


        adminLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent admindashboard = new Intent(getApplicationContext(), UserLogin.class);
                startActivity(admindashboard);

            }


        });
        }
    }

