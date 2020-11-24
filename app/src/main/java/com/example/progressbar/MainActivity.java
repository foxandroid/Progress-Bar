package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button design1,design2,design3,design4;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        design1 = findViewById(R.id.design1btn);
        design2 = findViewById(R.id.design2btn);
        design3 = findViewById(R.id.design3btn);
        design4 = findViewById(R.id.design4btn);

        design1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_wait1);
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();

                new CountDownTimer(5000,1000){


                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {

                        dialog.dismiss();

                    }
                }.start();

            }
        });

        design2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_wait2);
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();

                new CountDownTimer(5000,1000){


                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {

                        dialog.dismiss();

                    }
                }.start();

            }
        });

        design3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_wait3);
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();

                new CountDownTimer(5000,1000){


                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {

                        dialog.dismiss();

                    }
                }.start();


            }
        });

        design4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = new Dialog(MainActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog_wait4);
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();

                new CountDownTimer(5000,1000){


                    @Override
                    public void onTick(long millisUntilFinished) {

                    }

                    @Override
                    public void onFinish() {

                        dialog.dismiss();

                    }
                }.start();


            }
        });


    }
}