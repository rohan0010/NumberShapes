package com.example.rohan.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity
{
class Number
{
    int Number;
    public boolean isSquare()
{
    double squareRoot = Math.sqrt(Number);
    if (squareRoot == Math.floor(squareRoot))
    {
        return true;
    }
    else
    {
        return false;
    }
}
    public boolean isTriangular()
    {
        int x=1;
        int TriangularNumber=1;
        while (TriangularNumber<Number)
        {
            x++;
            TriangularNumber = TriangularNumber+x;

        }
        if(TriangularNumber==Number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    public void clickFunction(View view)

    {     String message= "";
        EditText myTextField=(EditText) findViewById(R.id.myTextField);
        if(myTextField.getText().toString().isEmpty())
        {
            message="Please enter a number";
        }
        else {
            Number myNumber = new Number();
            myNumber.Number = Integer.parseInt(myTextField.getText().toString());
            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {
                    message = myNumber.Number + "is both triangular and square!";
                } else {
                    message = myNumber.Number + "is square but not triangular!";
                }
            } else {
                if (myNumber.isTriangular()) {
                    message = myNumber.Number + "is triangular but not square!";
                } else {
                    message = myNumber.Number + "is neither square nor triangular!";
                }
            }
        }

        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
