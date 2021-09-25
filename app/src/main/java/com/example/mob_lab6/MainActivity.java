package com.example.mob_lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cntr = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        outState.putInt("counter", cntr);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        cntr = savedInstanceState.getInt("counter");
    }


    public void btn_click(View view)
    {
        TextView txt = (TextView)findViewById(R.id.textView);
        txt.setText("Вы нажали на кнопку " + ++cntr + " раз");
    }
}