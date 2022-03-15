package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add, sub, mul, div;
    EditText num1;
    EditText num2;
    TextView result;

    float f1 , f2 , res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = (Button) findViewById(R.id.addb);
        sub = (Button) findViewById(R.id.subb);
        mul = (Button) findViewById(R.id.mulb);
        div = (Button) findViewById(R.id.divb);

        num1 = (EditText) findViewById(R.id.in1);
        num2 =  (EditText) findViewById(R.id.in2);
        result = (TextView) findViewById(R.id.res);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

    }

    @Override
    public void onClick(View view){
        f1 = Float.parseFloat(num1.getText().toString());
        f2 = Float.parseFloat(num2.getText().toString());

        if(view == add){
            res = f1 + f2;
            result.setText(""+ res);
        }
        if(view == sub){
            res = f1 - f2;
            result.setText(""+ res);
        }
        if(view == mul){
            res = f1 * f2;
            result.setText(""+ res);
        }
        if(view == div){
            res = f1 / f2;
            result.setText(""+ res);
        }
    }
}

