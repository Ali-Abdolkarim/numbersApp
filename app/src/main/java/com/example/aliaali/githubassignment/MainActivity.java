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


//        binding.numOneImageButton.setOnClickListener(this);
//        binding.numTwoImageButton.setOnClickListener(this);
//        binding.numThreeImageButton.setOnClickListener(this);
//        binding.numFourImageButton.setOnClickListener(this);
//        binding.numFiveImageButton.setOnClickListener(this);
//        binding.numSixImageButton.setOnClickListener(this);
//        binding.numSevenImageButton.setOnClickListener(this);
//        binding.numEightImageButton.setOnClickListener(this);
//        binding.numNineImageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.num_one_image_button:
//               MediaPlayer.create(this,R.raw.one).start();
//                break;
//           case R.id.num_two_image_button:
//               MediaPlayer.create(this,R.raw.two).start();
//                break;
//           case R.id.num_three_image_button:
//               MediaPlayer.create(this,R.raw.three).start();
//                break;
//           case R.id.num_four_image_button:
//               MediaPlayer.create(this,R.raw.four).start();
//                break;
//           case R.id.num_five_image_button:
//               MediaPlayer.create(this,R.raw.five).start();
//                break;
//           case R.id.num_six_image_button:
//               MediaPlayer.create(this,R.raw.six).start();
//                break;
//           case R.id.num_seven_image_button:
//               MediaPlayer.create(this,R.raw.seven).start();
//                break;
//           case R.id.num_eight_image_button:
//               MediaPlayer.create(this,R.raw.eight).start();
//                break;
//           case R.id.num_nine_image_button:
//               MediaPlayer.create(this,R.raw.nine).start();
//                break;
        }
    }
}
