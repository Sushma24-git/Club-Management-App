package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class club1 extends AppCompatActivity {
    TextView tv, tv1;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club1);
        tv = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        reg = findViewById(R.id.reg);
        tv.setText("Grey Matter");
        String all = "Grey Matter, the quiz club of NMAMIT founded in 2009, is one of the oldest clubs on campus. The club's primary goal is to foster a quizzing culture among the members by nurturing new talents. The club conducts several quizzes on topics such as sports, mythology, anime, debates, and dumb charades. 'MELAS', the quiz event, is the flagship program of Grey Matter.";
        tv1.setText(all);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(club1.this,
                        register.class);
                startActivity(intent);

            }
        });
    }
}