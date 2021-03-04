package com.example.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Romb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romb);

        Button calculate=(Button)findViewById(R.id.button4);
        EditText side=(EditText)findViewById(R.id.editText6);
        EditText height=(EditText)findViewById(R.id.editText7);
        TextView result = (TextView) findViewById (R.id.textView14);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                result.setText((Double.parseDouble
                        (side.getText().toString()))*Double.parseDouble(height.getText().toString())+"");
            }
        });
    }
}