package com.matric.inter.preferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText ed_email= findViewById(R.id.editTextTextEmailAddress2);
        EditText ed_passwrd= findViewById(R.id.editTextTextPassword);
        Button button =findViewById(R.id.button_login);
        Button webview =findViewById(R.id.button_webview);
        TextView createNewAccoutn =findViewById(R.id.textView_createNewAccout);

        SharedPreferences sharedPreferences = getSharedPreferences("Profile",MODE_PRIVATE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = sharedPreferences.getString("EMAIL", "");
                String passwrod = sharedPreferences.getString("PASSWORD", "");
                if (ed_email.getText().toString().equals(email) && ed_passwrd.getText().toString().equals(passwrod)){
                    Toast.makeText(SplashActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(SplashActivity.this, "Invalid Credintials", Toast.LENGTH_LONG).show();

                }
            }
        });
        createNewAccoutn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SplashActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SplashActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

    }
}