package com.example.braintrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class Mainpage extends AppCompatActivity {
    TextView counttextview;

    CountDownTimer countDownTimer=new CountDownTimer(  30000 , 1000) {

        @Override
        public void onTick(long l) {
            counttextview.setText((int)l/1000 +"s");
        }

        @Override
        public void onFinish() {

        }
    }.start();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mainpage );

      counttextview = findViewById( R.id.counttextView);
    }
}
