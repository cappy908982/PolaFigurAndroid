package com.example.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t1=(TextView)findViewById(R.id.textView4);
        TextView t2=(TextView)findViewById(R.id.textView5);
        TextView t3=(TextView)findViewById(R.id.textView6);
        TextView t4=(TextView)findViewById(R.id.textView7);
        t1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(),Kwadrat.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(),Prostokat.class);
                startActivity(i);
            }
        });
        t3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(),Romb.class);
                startActivity(i);
            }
        });
        t4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(),Trojkat.class);
                startActivity(i);
            }
        });
    }
}