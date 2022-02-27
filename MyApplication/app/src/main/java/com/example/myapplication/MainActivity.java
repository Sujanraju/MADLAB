package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView t1;
    LinearLayout lay;
    Button b1 , b2 , b3 ,b4;
    int txtSize = 5;
    int switch_var = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b4 = (Button) findViewById(R.id.b4);
        b3 = (Button) findViewById(R.id.b3);
        lay = (LinearLayout) findViewById(R.id.bgcolor);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        t1.setTextColor(Color.BLACK);
        b4.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
//        t1.setText("Hello Whatsup!");
        if(view == b1) {
            if(t1.getCurrentTextColor() == Color.BLACK)
            {
                t1.setTextColor(Color.BLUE);
            }
            else if(t1.getCurrentTextColor() == Color.BLUE)
            {
                t1.setTextColor(Color.RED);
            }
            else if(t1.getCurrentTextColor() == Color.RED)
            {
                t1.setTextColor(Color.GREEN);
            }
            else if(t1.getCurrentTextColor() == Color.GREEN)
            {
                t1.setTextColor(Color.BLACK);
            }
//            b1.setText("Reset");
        }
        else if(view == b2) {
            if (txtSize<=50) {
                t1.setTextSize(txtSize = txtSize + 5);
            }
            else{
                txtSize = 5;
                t1.setTextSize(txtSize);
            }        }
        else if(view == b3){
            t1.setTextColor(Color.BLACK);
            t1.setTextSize(16);
            Toast T = Toast.makeText(this , "Reset Successfully" , Toast.LENGTH_SHORT);
            T.show();
        }
        else if(view == b4){
            switch(switch_var) {

                case 1:
                    lay.setBackgroundColor(Color.RED);
                    switch_var = switch_var + 1;
                    break;

                case 2:
                    lay.setBackgroundColor(Color.GREEN);
                    switch_var = switch_var + 1;
                    break;

                case 3:
                    lay.setBackgroundColor(Color.BLUE);
                    switch_var = switch_var + 1;
                    break;

                default:
                    switch_var = 1;
                    lay.setBackgroundColor(Color.WHITE);
            }
        }
    }
}