package com.cs407.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFunction(View view){
        Log.i("INFO", "Add Button Pressed");

        EditText myTextField1 = (EditText) findViewById(R.id.editTextText3);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText4);
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int intValue1 = Integer.valueOf(value1);
        int intValue2 = Integer.valueOf(value2);



        goToActivity((double)intValue1 + (double)intValue2);
    }
    public void subtractFunction(View view){
        Log.i("INFO", "Button Pressed");
        EditText myTextField1 = (EditText) findViewById(R.id.editTextText3);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText4);
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int intValue1 = Integer.valueOf(value1);
        int intValue2 = Integer.valueOf(value2);



        goToActivity((double)intValue1 - (double)intValue2);

    }
    public void divideFunction(View view){
        Log.i("INFO", "Button Pressed");
        EditText myTextField1 = (EditText) findViewById(R.id.editTextText3);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText4);
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int intValue1 = Integer.valueOf(value1);
        int intValue2 = Integer.valueOf(value2);

        if (intValue2 == 0){
            Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_LONG)
                    .show();
        }
        else {


            goToActivity((double) intValue1 / (double) intValue2);
        }

    }
    public void multiplyFunction(View view){
        Log.i("INFO", "Button Pressed");
        EditText myTextField1 = (EditText) findViewById(R.id.editTextText3);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText4);
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int intValue1 = Integer.valueOf(value1);
        int intValue2 = Integer.valueOf(value2);



        goToActivity((double)intValue1 * (double)intValue2);
    }


    public void goToActivity(Double d){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("message", d);
        startActivity(intent);
    }


}