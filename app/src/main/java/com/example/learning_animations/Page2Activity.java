package com.example.learning_animations;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Page2Activity extends AppCompatActivity {
    RadioGroup rg1;
    RadioButton r1,r2,r3,r4;
    CheckBox cb1,cb2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_page2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        rg1=findViewById(R.id.rg1);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        btn1=findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="";
                int sid=rg1.getCheckedRadioButtonId();
                if (sid==R.id.r1){
                    msg="Iced Americano";
                }
                else if (sid==R.id.r2){
                    msg="Iced Mocha";
                }
                else if (sid==R.id.r3){
                    msg="Espresso";
                }
                else {
                    msg = "Cappuccino";
                }
                if(cb1.isChecked() & cb2.isChecked()){
                    msg+=" with Cream and Sugar";
                }
                else{
                    if(cb1.isChecked()){
                        msg+=" with Cream";
                    }
                    if(cb2.isChecked()){
                        msg+=" with Sugar";
                    }
                }
               Toast.makeText(Page2Activity.this,msg,Toast.LENGTH_LONG).show();

            }
        });
    }
}