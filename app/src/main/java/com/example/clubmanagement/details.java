package com.example.clubmanagement;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class details extends AppCompatActivity {
    SQLiteDatabase db;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        b = findViewById(R.id.button);
        db = openOrCreateDatabase("Register", MODE_PRIVATE, null);
        Cursor c = db.rawQuery("SELECT * FROM MESSAGE", null);
        if(c.getCount()==0)
            Toast.makeText(details.this, "no data available", Toast.LENGTH_SHORT).show();
        else
        {
            c.moveToFirst();
            String all = "";
            do{
                int ssn = c.getInt(0);
                String name = c.getString(1);
                String email = c.getString(2);
                String phone = c.getString(3);
                String clubs = c.getString(4);
                all = all + "\nUsername : " + ssn + "\nNAME : " + name + "\nEmail : " + email + "\nPhone : " + phone + "\nClub : " + clubs + "\n";
            }while(c.moveToNext());

            AlertDialog.Builder aa = new AlertDialog.Builder(details.this);
            aa.setTitle("Member details");
            aa.setMessage(all);
            AlertDialog adb = aa.create();
            adb.show();
        }
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(details.this,second.class);
                startActivity(intent);
            }
        });
    }
}