package com.example.learning_animations;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tv2,coffee;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv2=findViewById(R.id.textView2);
        coffee=findViewById(R.id.coffee);
        btn1=findViewById(R.id.order);
        Animation a= AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
        //a.setRepeatMode(5);//to repeat 5 times
        tv2.setAnimation(a);
        //Animation c=AnimationUtils.loadAnimation(MainActivity.this, android.R.anim.fade_out);
        Animation b=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
        coffee.setAnimation(b);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this, Page2Activity.class);
                startActivity(in);
            }
        });
        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in=new Intent(MainActivity.this, Page2Activity.class);
                startActivity(in);
            }
        }, 4000);
    }

}