package com.example.app3;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private Button startButton;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startChronometer();
            }
        });
    }

    private void startChronometer() {
        countDownTimer = new CountDownTimer(10000, 1000) { // 10 segundos
            @Override
            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000;
                chronometer.setText(String.format("%02d:%02d:%02d",
                        seconds / 3600, (seconds % 3600) / 60, seconds % 60));
            }

            @Override
            public void onFinish() {
                chronometer.setText("00:00:00");
                goToSecondActivity();
            }
        }.start();
    }

    private void goToSecondActivity() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
