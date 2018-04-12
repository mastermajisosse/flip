package com.example.otmane.flip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Flip extends AppCompatActivity {

    Button b_flip;
    ImageView iv_coin;

    Random r ;
    int coinSide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip);

        b_flip = (Button) findViewById(R.id.b_flip);

        iv_coin = (ImageView) findViewById(R.id.rass);

        r = new Random();

        b_flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                coinSide = r.nextInt(2);
                if (coinSide == 0){
                    iv_coin.setImageResource(R.drawable.rass);
                }else if(coinSide == 1) {
                    iv_coin.setImageResource(R.drawable.nejma);
                }


                RotateAnimation rotat = new RotateAnimation(0,360 ,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f,RotateAnimation.RELATIVE_TO_SELF,0.5f);

                rotat.setDuration(1000);
                iv_coin.startAnimation(rotat);
            }
        });
    }
}
