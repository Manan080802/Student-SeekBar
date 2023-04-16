package com.manan.studentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class Sekkbar extends AppCompatActivity {
    SeekBar Red,Green,Blue;
    ImageView img;
    int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekkbar);
        img = findViewById(R.id.imageView2);
        Red = findViewById(R.id.Red);
        Green = findViewById(R.id.Green);
        Blue = findViewById(R.id.Blue);
        Red.setMax(250);
        Green.setMax(250);
        Blue.setMax(250);
        Red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                a=progress;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                reb();

            }
        });
        Green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                b= progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                reb();
            }
        });
        Blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                c=progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                reb();

            }
        });
    }
    public  void  reb()
    {
        int reg = Color.rgb(a,b,c);
        img.setBackgroundColor(reg);

    }
}