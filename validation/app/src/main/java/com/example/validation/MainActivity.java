package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    EditText u1,p1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);

        u1 = (EditText) findViewById(R.id.u1);
        p1 =  (EditText) findViewById(R.id.p1);

        b1.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        if (u1.getText().toString().matches("[a-zA-Z]+") && p1.getText().toString().matches("[0-9]+") && p1.getText().toString().length() == 4) {
            Toast T = Toast.makeText(getApplicationContext(), "SUCCESSFULLY VALIDATED", Toast.LENGTH_LONG);
            T.show();
        } else {
            Toast T = Toast.makeText(getApplicationContext(), "ENTER VALID DETAILS", Toast.LENGTH_LONG);
            T.show();
        }
    }


}