package ar.edu.utn.fra.lab5.calculadora;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Modelo modelo = new Modelo();
        Controlador c = new Controlador(modelo);
        Vista vista = new Vista(this,c.listener);
        c.setVista(vista);







    }









}
