package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class club5 extends AppCompatActivity {
    TextView tv, tv1;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club1);
        tv = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        reg = findViewById(R.id.reg);
        tv.setText("SACA");
        String all = "SACA emphasizes enhancing peers' soft skills. SACA provides a platform for enthusiastic speakers about leading, communicating, and public speaking. The association organises many events such as mock interviews, debates, Model United Nations (MUN), open mics, and personal development activities.";
        tv1.setText(all);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(club5.this,
                        register.class);
                startActivity(intent);

            }
        });
    }


}