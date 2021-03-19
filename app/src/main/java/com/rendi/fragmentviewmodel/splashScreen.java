package com.rendi.fragmentviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {
        private int waktu_loading = 1500;

        //4000=4 detik

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);


            setContentView(R.layout.activity_splash_screen);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    //setelah loading maka akan langsung berpindah ke home activity
                    Intent home = new Intent(splashScreen.this, ActivityHome.class);
                    startActivity(home);
                    finish();

                }
            }, waktu_loading);
        }
    }

