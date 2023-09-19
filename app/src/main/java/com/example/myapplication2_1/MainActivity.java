 package com.example.myapplication2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
     private EditText n1;
     private EditText n2;
     public TextView resultado;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         //relacion
         this.n1 = findViewById(R.id.Num1);
         this.n1 = findViewById(R.id.Num2);
         this.resultado = findViewById(R.id.Resul);


     }

     public void onClick(View view) {
         if (view.getId() == R.id.Suma) {
             resultado.setText(" "+Sumar());

         }else if(view.getId()== R.id.Resta){
             resultado.setText(""+Restar());
         }else if(view.getId()== R.id.Multiplicacion){
             resultado.setText(""+Multiplicar());
         }else if(view.getId()== R.id.Division){
             resultado.setText(""+Dividir());
         }


     }

     public double Sumar() {
         double resultado = 0;
         resultado = 0;
         resultado = Double.parseDouble(this.n1.getText().toString().trim()) + Double.parseDouble(this.n2.getText().toString().trim());
         return resultado;

     }

     public double Restar() {
         double resultado = 0;
         resultado = 0;
         resultado = Double.parseDouble(this.n1.getText().toString().trim()) - Double.parseDouble(this.n2.getText().toString().trim());
         return resultado;

     }

     public double Multiplicar() {
         double resultado = 0;
         resultado = 0;
         resultado = Double.parseDouble(this.n1.getText().toString().trim()) * Double.parseDouble(this.n2.getText().toString().trim());
         return resultado;

     }

     public Double Dividir() {
         double resultado = 0;
         double numero1 = 0;
         double numero2 = 0;
         numero1 = Double.parseDouble(this.n1.getText().toString().trim());
         numero2 = Double.parseDouble(this.n2.getText().toString().trim());
         if(numero2 == 0){
             System.out.println("0");
         }else{
             resultado= numero1 / numero2;
         }
         return resultado;

     }
 }

