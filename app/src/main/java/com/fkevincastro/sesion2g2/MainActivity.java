package com.fkevincastro.sesion2g2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eNombre, eCorreo;
    Button bGuardar;
    String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNombre=findViewById(R.id.enombre);
        eCorreo=findViewById(R.id.ecorreo);
       // bGuardar=findViewById(R.id.bGuardar);

      /*  bGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre=eNombre.getText().toString();
                eCorreo.setText(nombre);
            }
        });*/
    }

    public void OnButtonCLicked(View view) {

        nombre=eNombre.getText().toString();
        eCorreo.setText(nombre);
    }
//hola
    public void onRadioButtonClicked(View view) {
        int id=view.getId();
        if(id==R.id.rMaculino){
            eCorreo.setText("Masculino");

        }
        else {
            eCorreo.setText("Femenino");
        }
    }

    public void onCheckBoxClicked(View view) {
        int id=view.getId();

        switch(id){
            case R.id.cNadar:
                eCorreo.setText("NADAR");
                break;
            case R.id.cCorrer:
                eCorreo.setText("CORRER");
                break;
            case R.id.cCine:
                eCorreo.setText("CINE");
                break;

        }
    }
}
