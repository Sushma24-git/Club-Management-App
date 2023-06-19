package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class club3 extends AppCompatActivity {
    TextView tv, tv1;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club1);
        tv = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        reg = findViewById(R.id.reg);
        tv.setText("Kalanjali");
        String all = "Ecolution is a club of environmentally conscious students at NMAMIT who believe in preserving nature for future generations. The club organises cleanups, sapling plantation drives, and environmental awareness campaigns.";
        tv1.setText(all);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(club3.this,
                        register.class);
                startActivity(intent);

            }
        });
    }


}