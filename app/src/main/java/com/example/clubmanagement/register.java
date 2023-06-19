package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class register extends AppCompatActivity {
    TextView signup;
    Button register;
    EditText n, p, email, user,c;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        signup = findViewById(R.id.signup);
        register = findViewById(R.id.register);
        n = findViewById(R.id.un);
        user = findViewById(R.id.user);
        p = findViewById(R.id.p);
        c = findViewById(R.id.c);
        email = findViewById(R.id.email);
        db = openOrCreateDatabase("Register", MODE_PRIVATE, null);


        db.execSQL("CREATE TABLE IF NOT EXISTS MESSAGE(username int primary key, name varchar(30), email varchar(30), phone char(10),clubs varchar(30)) ");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = email.getText().toString();
                String phone = p.getText().toString();
                String name = n.getText().toString();
                String clubs = c.getText().toString();
                int usn1 = Integer.parseInt(user.getText().toString());

                Cursor c = db.rawQuery("SELECT * FROM MESSAGE where username="+usn1 ,null);
                if(c.getCount()==0){
                    db.execSQL("insert into MESSAGE values(" + usn1+ ",'" + name + "','" + pass + "','" + phone + "','" + clubs + "');");
                    Toast.makeText(register.this, "insert success", Toast.LENGTH_SHORT).show();
                    SmsManager sms = SmsManager.getDefault();
                    sms.sendTextMessage(p.getText().toString(), null, "Thank you for Registering. Welcome to "+clubs , null, null);
                    Toast.makeText(register.this, "message sent", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(register.this, second.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(register.this, "Username taken", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}