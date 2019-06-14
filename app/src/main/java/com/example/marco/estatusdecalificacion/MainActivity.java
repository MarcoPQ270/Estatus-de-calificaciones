package com.example.marco.estatusdecalificacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edt1;
    private  EditText edt2;
    private EditText edt3;
    private TextView  tvres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        edt3 = (EditText)findViewById(R.id.edt3);
        tvres = (TextView)findViewById(R.id.tvres);
    }
    public  void  promedio (View v){

        String cal1 = edt1.getText().toString();
        String cal2 = edt2.getText().toString();
        String cal3 = edt3.getText().toString();

        if (cal1.isEmpty()){
            Toast.makeText(this,"El campo de matematicas esta vacio", Toast.LENGTH_SHORT).show();
        }else if(cal2.isEmpty()){
            Toast.makeText(this,"El campo de Programacion esta vacio", Toast.LENGTH_SHORT).show();
        }else if(cal3.isEmpty()){
            Toast.makeText(this,"El campo de Redes esta vacio", Toast.LENGTH_SHORT).show();
        }else {
            int num1 = Integer.parseInt(cal1);
            int num2 = Integer.parseInt(cal2);
            int num3 = Integer.parseInt(cal3);
            int prom =(num1+num2+num3)/3;
            String result = String.valueOf(prom);
            if (prom>=7){
                tvres.setText("Estatus: Aprobado: Cal Final: "+result);
            }else if(prom<7){
                tvres.setText("Estatus: Reprobado: Cal Final: "+result);
            }

        }
    }

    public void limpiar(View v){
        edt1.setText("");
        edt2.setText("");
        edt3.setText("");
        tvres.setText("");
    }

}
