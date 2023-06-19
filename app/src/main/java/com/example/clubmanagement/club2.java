package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class club2 extends AppCompatActivity {
    TextView tv, tv1;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club1);
        tv = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        reg = findViewById(R.id.reg);
        tv.setText("Rachana");
        String all = "The club conducts various art events, training programs, and workshops to enhance the skill and creativity of the members. Club Rachana encourages the members to excel in their drawing and painting skills. The club conducts several competitions and exhibitions to portray the works of members. Club also runs training programs on sketching, painting, digital doodling, and crafts.";
        tv1.setText(all);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(club2.this,
                        register.class);
                startActivity(intent);

            }
        });
    }


}