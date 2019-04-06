package com.example.random;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
 EditText edittext;
 int i,num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext=(EditText) findViewById(R.id.num1);

        Random r= new Random();
         i=r.nextInt(20-0)+0;

    }
    public void buttonclicked(View v)
    {
         num=Integer.parseInt(edittext.getText().toString());
         if(i>num)
         {
             Toast.makeText(
                     getApplicationContext(),
                     "LOWER",
                     Toast.LENGTH_SHORT
             ).show();

         }
         else if(i==num)
         {

             Toast.makeText(
                     getApplicationContext(),
                     "Equal!! Try again",
                     Toast.LENGTH_SHORT
             ).show();
             Random r= new Random();
             i=r.nextInt(20-0)+0;
         }
         else
         {
             Toast.makeText(
                     getApplicationContext(),
                     "HIGHER",
                     Toast.LENGTH_SHORT
             ).show();

         }
    }
 }
