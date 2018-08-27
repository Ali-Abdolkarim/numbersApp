package com.example.aliaali.githubassignment;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer mediaPlayer;
    private ImageButton num1;
    private ImageButton num2;
    private ImageButton num3;
    private ImageButton num4;
    private ImageButton num5;
    private ImageButton num6;
    private ImageButton num7;
    private ImageButton num8;
    private ImageButton num9;
    private ImageButton num0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num_one_image_button);
        num2=findViewById(R.id.num_two_image_button);
        num3=findViewById(R.id.num_three_image_button);
        num4=findViewById(R.id.num_four_image_button);
        num5=findViewById(R.id.num_five_image_button);
        num6=findViewById(R.id.num_six_image_button);
        num7=findViewById(R.id.num_seven_image_button);
        num8=findViewById(R.id.num_eight_image_button);
        num9=findViewById(R.id.num_nine_image_button);
        num0=findViewById(R.id.num_zero_image_button);

        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        num0.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.num_one_image_button:
              //  mediaPlayer=MediaPlayer.create()
        }
    }
}
