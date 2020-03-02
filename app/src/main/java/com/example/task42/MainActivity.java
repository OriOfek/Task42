package com.example.task42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int i;
    ImageButton ib;
    ImageView iv;
    Random rnd=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib=(ImageButton)findViewById(R.id.imageButton);
        iv=(ImageView)findViewById(R.id.imageView2);
    }

    public void change(View view) {

        i=rnd.nextInt(3);
        i=i+1;


        switch (i) {
            case 1:
                //one is android
                ib.setImageResource(R.drawable.one);
                iv.setImageResource(R.drawable.android);
                break;
            case 2:
                //two is apple
                ib.setImageResource(R.drawable.two);
                iv.setImageResource(R.drawable.apple);
                break;
            case 3:
                //three is windows
                ib.setImageResource(R.drawable.three);
                iv.setImageResource(R.drawable.windoes);
                break;
        }
    }
}
