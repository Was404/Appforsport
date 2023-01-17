package com.example.appforsport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class GameActivity extends AppCompatActivity {

    ImageButton btn_back, btn_left, btn_right;
    ImageView soccer;
    //ConstraintLayout container1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
          //класс создай
        btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_left = (ImageButton) findViewById(R.id.btn_left);
        btn_right = (ImageButton) findViewById(R.id.btn_right);
        soccer = (ImageView) findViewById(R.id.soccer);
        //container1 = (ConstraintLayout) findViewById(R.id.container1);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameActivity.this, ScrollingActivity.class);
                startActivity(intent);
                soccer.setX(soccer.getX());
            }
        });
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soccer.setX(soccer.getX() - 40);

            }
        });
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soccer.setX(soccer.getX() + 40);
            }
        });
        soccer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soccer.setImageResource(R.drawable.soccer_shoot);
            }
        });
    }
}
