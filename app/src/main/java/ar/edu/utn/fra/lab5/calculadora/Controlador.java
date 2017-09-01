package ar.edu.utn.fra.lab5.calculadora;

/**
 * Created by alumno on 31/08/2017.
 */

public class Controlador {
    private Modelo modelo;
    private Vista vista;
    public MyListener listener;

    public Controlador(Modelo modelo){
        this.modelo = modelo;

        listener = new MyListener(this);

    }

    public void limpiar(){
        modelo.operacion="";
        modelo.subTotal = 0;
        modelo.esSubTotal=true;
        vista.actualizarDisplaySubTotalOperador("0","","");

    }
    //Funciones matematicas
    private String sumar(Double a, Double b){
        return String.valueOf(a+b);
    }
    private String restar(Double a, Double b){
        return String.valueOf(a-b);
    }
    private String dividir(Double a, Double b){
        if (b>0){
            return String.valueOf(a/b);
        } else {
            return "Error";
        }
    }
    private String multiplicar(Double a, Double b){
        return String.valueOf(a*b);
    }

    public void agregarNumero(String texto){
        if (!modelo.esSubTotal) {
            String textoprevio = vista.getDisplay();
            if (textoprevio == "0") {
                vista.setDisplay(texto);
            } else {
                vista.setDisplay(textoprevio + texto);
            }
        } else {
            vista.setDisplay(texto);
            modelo.esSubTotal=false;
        }
    }

    public void setVista(Vista vista) {
        this.vista = vista;
        this.limpiar();
    }

    public void agregarOperacion(String texto){
        modelo.operacion=texto;
        vista.txtOperador.setText(modelo.operacion.toString());
        vista.txtSubTotal.setText(vista.getDisplay());
        modelo.esSubTotal=true;
    }


    public String calcular(Double ValorA, Double ValorB, String operacion){
        String resultado = "0";
        switch (modelo.operacion){
            case "+":
                resultado = this.sumar(ValorA,ValorB);
                break;
            case "-":
                resultado = this.restar(ValorA,ValorB);
                break;
            case "*":
                resultado = this.multiplicar(ValorA,ValorB);
                break;
            case "/":
                resultado = this.dividir(ValorA,ValorB);
                break;
        }
        return resultado;
    }

    public void procesar(){
        vista.txtNumero.setText(calcular(Double.valueOf(vista.txtSubTotal.getText().toString()),Double.valueOf(vista.txtNumero.getText().toString()),vista.txtOperador.getText().toString()));
        vista.txtSubTotal.setText("");
        vista.txtOperador.setText("");
        modelo.esSubTotal=true;
    }
}
