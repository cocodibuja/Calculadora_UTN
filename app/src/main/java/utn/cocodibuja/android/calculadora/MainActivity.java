package utn.cocodibuja.android.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView_Texto;
    String cadenaActual;
    int valorActual;
    int valorGuardado;
    String operacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_Texto = (TextView) findViewById(R.id.TextView_pantallaGrande);
        cadenaActual = "0";
        operacion="ninguna";

    }
    public void borrarTodo(View v){
        valorActual=0;
        textView_Texto.setText(String.valueOf(valorActual));

    }

    public void presionoTeclaNumerica(View v){


        int numero;
        switch (v.getId()) {
            case R.id.button_teclaSumar:
                operacion = "sumar";
               // Toast.makeText(getApplicationContext(),"últimoAlmacenado"+ operacion, Toast.LENGTH_SHORT).show();

                break;
            case R.id.button_teclaRestar:
                operacion = "restar";
                break;
            case R.id.button_teclaMultiplicar:
                operacion = "multiplicar";
                break;
            case R.id.button_teclaDividir:
                operacion = "dividir";
                break;
            case R.id.button_teclaNumero0:
                numero = 0;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero1:
                numero = 1;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero2:
                 numero = 2;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero3:
                 numero = 3;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero4:
                numero = 4;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero5:
                numero = 5;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero6:
                numero = 6;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero7:
                numero = 7;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero8:
                numero = 8;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;
            case R.id.button_teclaNumero9:
                numero = 9;
                definirOperacion(operacion,numero);
                operacion="ninguna";
                break;

            default:
                break;

        }



    }

    public void definirOperacion(String operacion,int numero)
    {
        switch (operacion) {
            case "sumar":
                valorActual+=numero;
                cadenaActual = String.valueOf(valorActual);
                textView_Texto.setText(cadenaActual);
                break;
            case "restar":
                valorActual-=numero;
                cadenaActual = String.valueOf(valorActual);
                textView_Texto.setText(cadenaActual);

                break;
            case "multiplicar":

                if(valorActual==0 && numero==0){
                    textView_Texto.setText("No se puede 0 por 0");
                }else{
                valorActual*=numero;
                cadenaActual = String.valueOf(valorActual);
                textView_Texto.setText(cadenaActual);
                }

                break;
            case "dividir":

                if(numero == 0) {
                    textView_Texto.setText("No se puede dividir por 0");
                }else{
                    valorActual /= numero;
                    cadenaActual = String.valueOf(valorActual);
                    textView_Texto.setText(cadenaActual);
                }

                break;
            case "ninguna":
                valorActual=numero;
                cadenaActual = String.valueOf(valorActual);
                textView_Texto.setText(cadenaActual);

                break;
            default:
                valorActual=numero;
                cadenaActual = String.valueOf(valorActual);
                textView_Texto.setText(cadenaActual);
                break;
        }
    }





       /* Button botonPresionado = (Button) v;
        boolean Negativo = false;
        //ultimo valor de la cadena
        int longitudCadena = cadenaActual.length();
        String ultimoCaracter = cadenaActual.substring((longitudCadena-1),longitudCadena);
       // Toast.makeText(getApplicationContext(),"últimoAlmacenado"+ ultimoCaracter, Toast.LENGTH_SHORT).show();


        //veo el primer elemento de la cadena. por si es negativo (-)
        String primerCaracter = cadenaActual.substring(0,1);
        if(primerCaracter.compareTo("-")==0){
            Negativo = true;
        }

//---Empezamos---
        else if(ultimoCaracter.compareTo("+")==0)
        {
            cadenaActual = cadenaActual.substring(1,(longitudCadena-1));
            textView_Texto.setText(cadenaActual);
            valorActual = Integer.parseInt(cadenaActual);
            valorActual += Integer.parseInt(botonPresionado.getText().toString());
            cadenaActual = String.valueOf(valorActual);
           // textView_Texto.setText(cadenaActual);
        }
        else if(ultimoCaracter.compareTo("-")==0)
        {
            String sinSignoOperacion = cadenaActual.substring(1,(longitudCadena-1));
            valorGuardado = valorActual;
            valorActual = Integer.parseInt(sinSignoOperacion);
            valorActual -= Integer.parseInt(botonPresionado.getText().toString());
            cadenaActual = String.valueOf(valorActual);
            textView_Texto.setText(cadenaActual);
        }
        else if(ultimoCaracter.compareTo("X")==0)
        {
            String sinSignoOperacion = cadenaActual.substring(1,(longitudCadena-1));
            valorGuardado = valorActual;
            valorActual = Integer.parseInt(sinSignoOperacion);
            valorActual *= Integer.parseInt(botonPresionado.getText().toString());
            cadenaActual = String.valueOf(valorActual);
            textView_Texto.setText(cadenaActual);
        }
        else{
            cadenaActual += botonPresionado.getText().toString();
            textView_Texto.setText(cadenaActual);
        }




*/



}
