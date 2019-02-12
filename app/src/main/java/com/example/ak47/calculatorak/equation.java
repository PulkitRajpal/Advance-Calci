package com.example.ak47.calculatorak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class equation extends AppCompatActivity {

    public void sin (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = Math.sin(Math.toRadians(num1));
        e3.setText(Double.toString(sum));
    }
    public void cos (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = Math.cos(Math.toRadians(num1));
        e3.setText(Double.toString(sum));
    }
    public void tan (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = Math.tan(Math.toRadians(num1));
        e3.setText(Double.toString(sum));
    }
    public void asin (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = Math.toDegrees(Math.asin(num1));
        e3.setText(Double.toString(sum));
    }
    public void acos (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = Math.toDegrees(Math.acos(num1));
        e3.setText(Double.toString(sum));
    }
    public void atan (View view){
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1= Double.parseDouble(e1.getText().toString());
        double num2= Double.parseDouble(e2.getText().toString());
        Double sum = Math.toDegrees(Math.atan(num1));
        e3.setText(Double.toString(sum));
    }
    public void ak47 (View view) {
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);

        e1.setText(Integer.toString(0));
        e2.setText(Integer.toString(0));
        e3.setText("");
        Toast amit = (Toast.makeText(getApplicationContext(), "RESET COMPLETED", Toast.LENGTH_LONG));
        amit.show();
    }

    public void root (View view) {
        EditText e1 = (EditText) findViewById(R.id.input1);
        EditText e2 = (EditText) findViewById(R.id.input2);
        EditText e3 = (EditText) findViewById(R.id.output);
        double num1 = Double.parseDouble(e2.getText().toString());
        double num3 = Double.parseDouble(e3.getText().toString());
        String num2 = e1.getText().toString();
        double length = num2.length();

        if (length == 8) {
            double a = (num2.charAt(0));
            double b = (num2.charAt(4));
            double c = (num2.charAt(7));
            double d = (num2.charAt(3));
            double e = (num2.charAt(6));
            a = a - 48;
            b = b - 48;
            c = c - 48;
            if (((b * b) - (4 * a * c))>0)
            { double sum = -((b) + (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            double num = -((b) - (Math.sqrt((b * b) - (4 * a * c)))) / (2 * a);
            e3.setText(Double.toString(sum) + " , " + Double.toString(num));
            }
            else {
                Toast amit = (Toast.makeText(getApplicationContext(), "IMAGINARY ROOTS", Toast.LENGTH_LONG));
                amit.show();
            }
        }

            else if (length == 12) {
            double a = (num2.charAt(0));
            double b = (num2.charAt(4));
            double c = (num2.charAt(8));
            double d = (num2.charAt(11));
            double e = (num2.charAt(3));
            double f = (num2.charAt(7));
            double j = (num2.charAt(10));
            a = a - 48;
            b = b - 48;
            c = c - 48;
            d = d - 48;
            double sum = 0;

                if (e == 43 && f == 43 && j == 43)
                    sum = a * num1 * num1 * num1 + b * num1 * num1 + c * num1 + d;
                else if (e == 43 && f == 43 && j == 45)
                    sum = a * num1 * num1 * num1 + b * num1 * num1 + c * num1 - d;
                else if (e == 43 && f == 45 && j == 43)
                    sum = a * num1 * num1 * num1 + b * num1 * num1 - c * num1 + d;
                else if (e == 43 && f == 45 && j == 45)
                    sum = a * num1 * num1 * num1 + b * num1 * num1 + c * num1 + d;
                else if (e == 45 && f == 43 && j == 43)
                    sum = a * num1 * num1 * num1 - b * num1 * num1 + c * num1 + d;
                else if (e == 45 && f == 43 && j == 45)
                    sum = a * num1 * num1 * num1 - b * num1 * num1 + c * num1 - d;
                else if (e == 45 && f == 45 && j == 43)
                    sum = a * num1 * num1 * num1 - b * num1 * num1 - c * num1 + d;
                else if (e == 45 && f == 45 && j == 45)
                    sum = a * num1 * num1 * num1 - b * num1 * num1 + c * num1 + d;


            double num = 0;

                if (e == 43 && f == 43 && j == 43)
                    num = a * num3 * num3 * num3 + b * num3 * num3 + c * num3 + d;
                else if (e == 43 && f == 43 && j == 45)
                    num = a * num3 * num3 * num3 + b * num3 * num3 + c * num3 - d;
                else if (e == 43 && f == 45 && j == 43)
                    num = a * num3 * num3 * num3 + b * num3 * num3 - c * num3 + d;
                else if (e == 43 && f == 45 && j == 45)
                    num = a * num3 * num3 * num3 + b * num3 * num3 + c * num3 + d;
                else if (e == 45 && f == 43 && j == 43)
                    num = a * num3 * num3 * num3 - b * num3 * num3 + c * num3 + d;
                else if (e == 45 && f == 43 && j == 45)
                    num = a * num3 * num3 * num3 - b * num3 * num3 + c * num3 - d;
                else if (e == 45 && f == 45 && j == 43)
                    num = a * num3 * num3 * num3 - b * num3 * num3 - c * num3 + d;
                else if (e == 45 && f == 45 && j == 45)
                    num = a * num3 * num3 * num3 - b * num3 * num3 + c * num3 + d;

            double mid = -1;
            double dum = 0;


            for (int i = 0; ; i++) {
                mid = (num1 + num3) / 2;


                { if (e == 43 && f == 43 && j == 43)
                        dum = a * mid * mid * mid + b * mid * mid + c * mid + d;
                    else if (e == 43 && f == 43 && j == 45)
                        dum = a * mid * mid * mid + b * mid * mid + c * mid - d;
                    else if (e == 43 && f == 45 && j == 43)
                        dum = a * mid * mid * mid + b * mid * mid - c * mid + d;
                    else if (e == 43 && f == 45 && j == 45)
                        dum = a * mid * mid * mid + b * mid * mid - c * mid - d;
                    else if (e == 45 && f == 43 && j == 43)
                        dum = a * mid * mid * mid - b * mid * mid + c * mid + d;
                    else if (e == 45 && f == 43 && j == 45)
                        dum = a * mid * mid * mid - b * mid * mid + c * mid - d;
                    else if (e == 45 && f == 45 && j == 43)
                        dum = a * mid * mid * mid - b * mid * mid - c * mid + d;
                    else if (e == 45 && f == 45 && j == 45)
                        dum = a * mid * mid * mid - b * mid * mid - c * mid - d;}

                if (dum >= 0.0002) {
                    num1 = mid;
                }
                else if (dum < -0.0002) {
                    num3 = mid;
                }
                else if (dum<0.0202 && dum>-0.0202)  {
                    break;

                }

            } e3.setText(Double.toString(mid));


        }
        else {
            Toast amit = (Toast.makeText(getApplicationContext(), "INPUT IS IN INVALID FORM", Toast.LENGTH_LONG));
            amit.show();
              }
    }




       public void cubic (View view) {
           EditText e1 = (EditText) findViewById(R.id.input1);
           EditText e2 = (EditText) findViewById(R.id.input2);
           EditText e3 = (EditText) findViewById(R.id.output);
           double num1 = Double.parseDouble(e2.getText().toString());
           String num2 = e1.getText().toString();
           double length = num2.length();


           if (length == 8) {
               double a = (num2.charAt(0));
               double b = (num2.charAt(4));
               double c = (num2.charAt(7));
               double d = (num2.charAt(3));
               double e = (num2.charAt(6));
               a = a - 48;
               b = b - 48;
               c = c - 48;
               double sum = 0;
                   if (d == 45 && e == 45)
                       sum = a * num1 * num1 - b * num1 - c;
                   else if (d == 45 && e == 43)
                       sum = a * num1 * num1 - b * num1 + c;
                   else if (d == 43 && e == 45)
                       sum = a * num1 * num1 + b * num1 - c;
                   else if (d == 43 && e == 43)
                       sum = a * num1 * num1 + b * num1 + c;
                   e3.setText(Double.toString(sum));
                   }
           else if (length == 12) {
               double a = (num2.charAt(0));
               double b = (num2.charAt(4));
               double c = (num2.charAt(8));
               double d = (num2.charAt(11));
               double e = (num2.charAt(3));
               double f = (num2.charAt(7));
               double j = (num2.charAt(10));
               a = a - 48;
               b = b - 48;
               c = c - 48;
               d = d - 48;
               double sum = 0;
               if (e == 43 && f == 43 && j == 43)
                   sum = a * num1 * num1 * num1 + b * num1 * num1 + c * num1 + d;
               else if (e == 43 && f == 43 && j == 45)
                   sum = a * num1 * num1 * num1 + b * num1 * num1 + c * num1 - d;
               else if (e == 43 && f == 45 && j == 43)
                   sum = a * num1 * num1 * num1 + b * num1 * num1 - c * num1 + d;
               else if (e == 43 && f == 45 && j == 45)
                   sum = a * num1 * num1 * num1 + b * num1 * num1 + c * num1 + d;
               else if (e == 45 && f == 43 && j == 43)
                   sum = a * num1 * num1 * num1 - b * num1 * num1 + c * num1 + d;
               else if (e == 45 && f == 43 && j == 45)
                   sum = a * num1 * num1 * num1 - b * num1 * num1 + c * num1 - d;
               else if (e == 45 && f == 45 && j == 43)
                   sum = a * num1 * num1 * num1 - b * num1 * num1 - c * num1 + d;
               else if (e == 45 && f == 45 && j == 45)
                   sum = a * num1 * num1 * num1 - b * num1 * num1 + c * num1 + d;
               e3.setText(Double.toString(sum));
           }
           else {
               Toast amits = (Toast.makeText(getApplicationContext(), "INPUT IS IN INVALID FORM", Toast.LENGTH_LONG));
               amits.show();
           }

    }
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation);
    }
}
