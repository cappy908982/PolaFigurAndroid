package com.example.polafigur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Kwadrat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwadrat);

        Button calculate=(Button)findViewById(R.id.button);
        EditText side=(EditText)findViewById(R.id.editText);
        TextView result = (TextView) findViewById (R.id.textView);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                result.setText((Double.parseDouble
                        (side.getText().toString()))*Double.parseDouble(side.getText().toString())+"");
            }
        });
    }
}