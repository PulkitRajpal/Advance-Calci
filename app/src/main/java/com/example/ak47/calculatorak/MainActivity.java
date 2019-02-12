package com.example.ak47.calculatorak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void addition (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        if (e1.getText().toString()=="" )
        { Toast amit = (Toast.makeText(getApplicationContext(),"INPUT1 IS EMPTY",Toast.LENGTH_LONG));
            amit.show();
        }

        if (e2.getText().toString()=="" )
        { Toast amit = (Toast.makeText(getApplicationContext(),"INPUT2 IS EMPTY",Toast.LENGTH_LONG));
            amit.show();
        }
        else {
            Double sum = num1 + num2;
            e3.setText(Double.toString(sum));
        }

    }

    public void subtraction (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = num1 - num2 ;
        e3.setText(Double.toString(sum));
    }
    public void multiply (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = num1 * num2 ;
        e3.setText(Double.toString(sum));
    }
    public void division (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = num1 / num2 ;
        e3.setText(Double.toString(sum));
    }
     public void reuse (View view){
         EditText e1 = (EditText) findViewById(R.id.input1);
         EditText e2 = (EditText) findViewById(R.id.input2);
         EditText e3 = (EditText) findViewById(R.id.output);
         double num1= Double.parseDouble(e1.getText().toString());
         double num2= Double.parseDouble(e2.getText().toString());
         double num3= Double.parseDouble(e3.getText().toString());

         e1.setText(Double.toString(num3));
     }
      public void cos (View view){
          EditText e1 = (EditText) findViewById(R.id.input1);
          EditText e2 = (EditText) findViewById(R.id.input2);
          EditText e3 = (EditText) findViewById(R.id.output);
          double num1= Double.parseDouble(e1.getText().toString());
          double num2= Double.parseDouble(e2.getText().toString());
          Double sum = Math.sqrt(num1);
          e3.setText(Double.toString(sum));
      }
       public void pow (View view){
           EditText e1 = (EditText) findViewById(R.id.input1);
           EditText e2 = (EditText) findViewById(R.id.input2);
           EditText e3 = (EditText) findViewById(R.id.output);
           double num1= Double.parseDouble(e1.getText().toString());
           double num2= Double.parseDouble(e2.getText().toString());
           Double sum = Math.pow(num1,num2);
           e3.setText(Double.toString(sum));
       }
        public void log (View view){
            EditText e1 = (EditText) findViewById(R.id.input1);
            EditText e2 = (EditText) findViewById(R.id.input2);
            EditText e3 = (EditText) findViewById(R.id.output);
            double num1= Double.parseDouble(e1.getText().toString());
            double num2= Double.parseDouble(e2.getText().toString());
            Double sum = Math.log(num1);
            e3.setText(Double.toString(sum));
        }
    public void ak47 (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);

        e1.setText(Integer.toString(0));
        e2.setText(Integer.toString(0));
        e3.setText("");
        Toast amit = (Toast.makeText(getApplicationContext(),"RESET COMPLETED",Toast.LENGTH_LONG));
        amit.show();

    }
    public void quadratic (View view) {
        Intent amit = new Intent(".equation");
        startActivity(amit);
    }
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
