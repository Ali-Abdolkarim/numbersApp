package com.example.aliaali.githubassignment;

import android.databinding.DataBindingUtil;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.aliaali.githubassignment.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private MediaPlayer mediaPlayer;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.numOneImageButton.setOnClickListener(this);
        binding.numTwoImageButton.setOnClickListener(this);
        binding.numThreeImageButton.setOnClickListener(this);
        binding.numFourImageButton.setOnClickListener(this);
        binding.numFiveImageButton.setOnClickListener(this);
        binding.numSixImageButton.setOnClickListener(this);
        binding.numSevenImageButton.setOnClickListener(this);
        binding.numEightImageButton.setOnClickListener(this);
        binding.numNineImageButton.setOnClickListener(this);
        binding.numZeroImageButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()){
//            case binding.numOneImageButton:
//                mediaPlayer=MediaPlayer.create(this,)
//            case binding.
//            case binding.
//            case binding.
//            case binding.
//            case binding.
//            case binding.
//        }
    }
}
