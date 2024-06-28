package com.example.patientapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    AppCompatButton bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        e1=(EditText) findViewById(R.id.nam);
        e2=(EditText) findViewById(R.id.ag);
        e3=(EditText) findViewById(R.id.hname);
        e4=(EditText) findViewById(R.id.pcode);
        e5=(EditText) findViewById(R.id.mno);
        e6=(EditText) findViewById(R.id.uname);
        e7=(EditText) findViewById(R.id.pass);
        e8=(EditText) findViewById(R.id.confirm);
        bt1=(AppCompatButton) findViewById(R.id.registerbtn);
        bt2=(AppCompatButton) findViewById(R.id.loginbtn);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getName=e1.getText().toString();
                String getAge=e2.getText().toString();
                String getHname=e3.getText().toString();
                String getPincode=e4.getText().toString();
                String getMobileNo=e5.getText().toString();
                String getUsername=e6.getText().toString();
                String getPassword=e7.getText().toString();
                String getConfirmPassword=e8.getText().toString();
                Toast.makeText(getApplicationContext(),getName+" "+getAge+" "+getHname+" "+getPincode+" "+getMobileNo+" "+getUsername+" "+getPassword+" "+getConfirmPassword,Toast.LENGTH_LONG).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}