package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class club6 extends AppCompatActivity {
    TextView tv, tv1;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club1);
        tv = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        reg = findViewById(R.id.reg);
        tv.setText("Taaleem");
        String all = "Taaleem, the niche of drama and theatre enthusiasts of NMAMIT, is known for its exotic troupe of actors, scriptwriters, videographers, and editors. The aim of the club is to nurture budding talents in various fields, including mad ads, skits, mimes, street, and stage plays.";
        tv1.setText(all);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(club6.this,
                        register.class);
                startActivity(intent);

            }
        });
    }



}