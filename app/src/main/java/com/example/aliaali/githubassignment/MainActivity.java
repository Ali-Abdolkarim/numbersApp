package com.example.aliaali.githubassignment;

import android.databinding.DataBindingUtil;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.aliaali.githubassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.numOneLinearLayout.setOnClickListener(this);
        binding.numTwoLinearLayout.setOnClickListener(this);
        binding.numThreeLinearLayout.setOnClickListener(this);
        binding.numFourLinearLayout.setOnClickListener(this);
        binding.numFiveLinearLayout.setOnClickListener(this);
        binding.numSixLinearLayout.setOnClickListener(this);
        binding.numSevenLinearLayout.setOnClickListener(this);
        binding.numEightLinearLayout.setOnClickListener(this);
        binding.numNineLinearLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.num_one_linear_layout:
               MediaPlayer.create(this,R.raw.one).start();
                break;
           case R.id.num_two_linear_layout:
               MediaPlayer.create(this,R.raw.two).start();
                break;
           case R.id.num_three_linear_layout:
               MediaPlayer.create(this,R.raw.three).start();
                break;
           case R.id.num_four_linear_layout:
               MediaPlayer.create(this,R.raw.four).start();
                break;
           case R.id.num_five_linear_layout:
               MediaPlayer.create(this,R.raw.five).start();
                break;
           case R.id.num_six_linear_layout:
               MediaPlayer.create(this,R.raw.six).start();
                break;
           case R.id.num_seven_linear_layout:
               MediaPlayer.create(this,R.raw.seven).start();
                break;
           case R.id.num_eight_linear_layout:
               MediaPlayer.create(this,R.raw.eight).start();
                break;
           case R.id.num_nine_linear_layout:
               MediaPlayer.create(this,R.raw.nine).start();
                break;
        }
    }
}
