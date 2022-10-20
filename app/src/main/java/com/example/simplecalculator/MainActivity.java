package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etn1;
    EditText etn2;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn1 = (EditText) findViewById(R.id.etn1);
        etn2 = (EditText) findViewById(R.id.etn2);

        tv = (TextView) findViewById(R.id.tv);

    }
    public void Add(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int sum = n1 + n2;
        tv.setText(String.valueOf(sum));

    }

    public void Mul(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int Mul = n1 * n2;
        tv.setText(String.valueOf(Mul));
    }

    public void Sub(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int Sub = n1 - n2;
        tv.setText(String.valueOf(Sub));
    }

    public void Div(View view)
    {
        int n1 = Integer.parseInt(etn1.getText().toString());
        int n2 = Integer.parseInt(etn2.getText().toString());
        int Div = n1 / n2;
        tv.setText(String.valueOf(Div));
    }

}