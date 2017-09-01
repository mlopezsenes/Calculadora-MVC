package ar.edu.utn.fra.lab5.calculadora;

import android.view.View;

/**
 * Created by lkdml on 30/08/2017.
 */

public class MyListener implements View.OnClickListener {


    private Controlador controlador;

    public MyListener(Controlador controlador) {
        this.controlador =  controlador;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
               this.controlador.agregarNumero("0");
                break;
            case R.id.btn1:
                this.controlador.agregarNumero("1");
                break;
            case R.id.btn2:
                this.controlador.agregarNumero("2");
                break;
            case R.id.btn3:
                this.controlador.agregarNumero("3");
                break;
            case R.id.btn4:
                this.controlador.agregarNumero("4");
                break;
            case R.id.btn5:
                this.controlador.agregarNumero("5");
                break;
            case R.id.btn6:
                this.controlador.agregarNumero("6");
                break;
            case R.id.btn7:
                this.controlador.agregarNumero("7");
                break;
            case R.id.btn8:
                this.controlador.agregarNumero("8");
                break;
            case R.id.btn9:
                this.controlador.agregarNumero("9");
                break;
            case R.id.btnComa:
                //this.controlador.agregarNumero(".");
                break;
            case R.id.btnMas:
                this.controlador.agregarOperacion("+");

                break;
            case R.id.btnMenos:
                this.controlador.agregarOperacion("-");

                break;
            case R.id.btnMultiplicar:
                this.controlador.agregarOperacion("*");

                break;
            case R.id.btnIgual:
                this.controlador.procesar();
                break;
            case R.id.btnCE:
                this.controlador.limpiar();
                break;
        }
    }
}
