package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class member1 extends AppCompatActivity {
    TextView sign;
    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member1);
        sign = findViewById(R.id.sign);

        login = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin") ){
                    Toast.makeText(member1.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(member1.this,
                            details.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(member1.this, "Login Failed!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}