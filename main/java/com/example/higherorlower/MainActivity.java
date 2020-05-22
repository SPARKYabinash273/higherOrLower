package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void generateRAndNumber(){
        Random rand=new Random();
        randomNumber=rand.nextInt(20)+1;

    }
     public void guess(View view){
         EditText editText=(EditText) findViewById(R.id.editText);
         int guessValue=Integer.parseInt(editText.getText().toString());
         String message;
         if(guessValue>randomNumber){
             message="Enter a Lower Number!!!!";
         }
         else if (guessValue<randomNumber){
             message="Enter a Higher Number!!!!";
         }
         else{
             message="You got it!!!";
             generateRAndNumber();
         }
         Toast.makeText(this,message,Toast.LENGTH_LONG).show();
         Log.i("Entered Value",editText.getText().toString());
         Log.i("Info",Integer.toString( randomNumber));
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
generateRAndNumber();
    }
}
