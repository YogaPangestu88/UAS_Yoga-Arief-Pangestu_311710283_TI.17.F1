package com.example.uas_yoga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    TextView text1,text2;

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text1=(TextView) findViewById(R.id.text1);
        text2=(TextView) findViewById(R.id.textView2);

        TextView textView = findViewById(R.id.text1);
        text1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(activity2Intent);
            }
        });

        text2=(TextView) findViewById(R.id.textView2);

        TextView textView1 = findViewById(R.id.textView2);
        text2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(activity2Intent);
            }
        });


        btn1=(Button)findViewById(R.id.btn1);

        Button button = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), apotekActivity.class);
                startActivity(activity2Intent);
            }
        });


    }

}
