package com.example.appforsport;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class GameActivity extends AppCompatActivity implements View.OnTouchListener {

    ImageButton btn_back, btn_left, btn_right;
    ConstraintLayout game;

    public static boolean isLeftOn = false;
    public static boolean isRightOn = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_main);
        GameView gameView = new GameView(this); //класс создай
        game = (ConstraintLayout) findViewById(R.id.game);
        btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_left = (ImageButton) findViewById(R.id.btn_left);
        btn_right = (ImageButton) findViewById(R.id.btn_right);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GameActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });
        btn_left.setOnTouchListener(this);
        btn_left.setOnTouchListener(this);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (ImageButton.getId()){
            case R.id.btn_left:
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        isLeftOn = true;
                        break;
                    case MotionEvent.ACTION_UP:
                        isLeftOn = false;
                        break;
                }
                break;
            case R.id.btn_right:
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:

                }
        }
        return false;
    }
}
