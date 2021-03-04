package com.example.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trojkat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trojkat);

        Button calculate=(Button)findViewById(R.id.button3);
        EditText side=(EditText)findViewById(R.id.editText4);
        EditText height=(EditText)findViewById(R.id.editText5);
        TextView result = (TextView) findViewById (R.id.textView15);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                result.setText(0.5*(Double.parseDouble
                        (side.getText().toString()))*Double.parseDouble(height.getText().toString())+"");
            }
        });
    }
}