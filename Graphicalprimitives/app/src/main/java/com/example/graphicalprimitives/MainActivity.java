package com.example.graphicalprimitives;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        SampleCanvas sc = new SampleCanvas(this);
        setContentView(sc);
    }
    private class SampleCanvas extends View {

        @Override
        protected void onDraw(Canvas canvas) {
            //super.onDraw(canvas);
            Paint paint = new Paint();
            Paint obj = new Paint();
            Paint paint2 = new Paint();
            paint2.setColor(Color.WHITE);
            obj.setColor(Color.WHITE);
            paint2.setTextSize(70f);
            paint.setColor(Color.rgb(255,165,0));
            canvas.drawPaint(paint);
            canvas.drawText("Rectangle", 420, 150, paint2);
            canvas.drawRect(400, 200, 650, 700, obj);

            canvas.drawText("Circle", 120, 150, paint2);
            canvas.drawCircle(200, 350, 150, obj);

            canvas.drawText("Square", 120, 800, paint2);
            canvas.drawRect(50, 850, 350, 1150, obj);
            canvas.drawText("Line", 480, 800, paint2);
            canvas.drawLine(520, 850, 520, 1150,obj);
        }

        public SampleCanvas(Context context) {
            super(context);
        }
    }
}