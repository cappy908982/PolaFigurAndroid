package com.example.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prostokat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prostokat);

        Button calculate=(Button)findViewById(R.id.button2);
        EditText side1=(EditText)findViewById(R.id.editText2);
        EditText side2=(EditText)findViewById(R.id.editText3);
        TextView result = (TextView) findViewById (R.id.textView9);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                result.setText((Double.parseDouble
                        (side1.getText().toString()))*Double.parseDouble(side2.getText().toString())+"");
            }
        });
    }
}