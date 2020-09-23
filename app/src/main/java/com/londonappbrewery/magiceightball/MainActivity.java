package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = findViewById(R.id.ball_image);
        Button askButton = findViewById(R.id.ask_button);

        final int[] ballimages = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();

                Log.d("Magic8Ball", "button pressed");
                int number = random.nextInt(5);
                Log.d("Magic8Ball", "number:"+ number);
                ballDisplay.setImageResource(ballimages[number]);

            }
        });

    }
}
