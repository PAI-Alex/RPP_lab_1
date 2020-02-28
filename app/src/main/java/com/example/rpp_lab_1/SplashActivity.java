package com.example.rpp_lab_1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate ( savedInstanceState );
       // setContentView ( R.layout.activity_splash );



        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        //
        runthread();
        finish();
    }
    private void runthread() {

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }
}
