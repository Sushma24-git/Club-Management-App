package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class second extends AppCompatActivity {
    TextView club;
    ImageView greymatter,kalanjali,rachana1,saca,stereo,talim1,member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // initialize imageView
        // with method findViewById()
        club = findViewById(R.id.club);
        greymatter = findViewById(R.id.iv);
        kalanjali = findViewById(R.id.iv1);
        rachana1 = findViewById(R.id.iv2);
        saca = findViewById(R.id.iv3);
        stereo = findViewById(R.id.iv4);
        talim1 = findViewById(R.id.iv5);
        member = findViewById(R.id.iv6);
        greymatter.setImageResource(R.drawable.c6);
        kalanjali.setImageResource(R.drawable.c5);
        rachana1.setImageResource(R.drawable.c4);
        saca.setImageResource(R.drawable.c3);
        stereo.setImageResource(R.drawable.c2);
        talim1.setImageResource(R.drawable.c1);
        member.setImageResource(R.drawable.organiser1);
        // Apply OnClickListener to imageView to
        // switch from one activity to another
        greymatter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this,
                        club1.class);
                startActivity(intent);
            }
        });
        kalanjali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this,
                        club2.class);
                startActivity(intent);
            }
        });
        rachana1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this,
                        club3.class);
                startActivity(intent);
            }
        });
        saca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this,club4.class);
                startActivity(intent);
            }
        });
        stereo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this,
                        club5.class);
                startActivity(intent);
            }
        });
        talim1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(second.this,
                        club6.class);
                startActivity(intent);
            }
        });
        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(second.this,
                        member1.class);
                startActivity(intent);

            }
        });


    }
}