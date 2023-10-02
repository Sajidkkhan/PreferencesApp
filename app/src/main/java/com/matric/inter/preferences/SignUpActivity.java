package com.matric.inter.preferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
EditText ed_name, ed_fname,ed_address, ed_password, ed_email, ed_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ed_name=findViewById(R.id.editTextTextPersonName);
        ed_fname=findViewById(R.id.editTextTextPersonFatherName);
        ed_address=findViewById(R.id.editTextTextAddress);
        ed_password=findViewById(R.id.editTextTextPassword);
        ed_email=findViewById(R.id.editTextTextEmailAddress);
        ed_phone=findViewById(R.id.editTextPhone);
        Button button=findViewById(R.id.button_submit);
        // Storing data into SharedPreferences
        SharedPreferences sharedPreferences = getSharedPreferences("Profile",MODE_PRIVATE);
        // Creating an Editor object to edit(write to the file)
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myEdit.putString("NAME", ed_name.getText().toString());
                myEdit.putString("F_NAME", ed_fname.getText().toString());
                myEdit.putString("ADRESS", ed_address.getText().toString());
                myEdit.putString("PASSWORD", ed_password.getText().toString());
                myEdit.putString("EMAIL", ed_email.getText().toString());
                myEdit.putString("PHONE", ed_phone.getText().toString());

                myEdit.commit();
                Toast.makeText(SignUpActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
//        DBHandler dbHandler = new DBHandler(MainActivity.this);
//        long id=dbHandler.addNewContact("Ali", "0943847474","ali@gmail.com","Peshawar");
//        Toast.makeText(MainActivity.this, "Record#: "+id+" created successfully.", Toast.LENGTH_SHORT).show();
    }
}