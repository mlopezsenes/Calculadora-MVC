package ar.edu.utn.fra.lab5.calculadora;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alumno on 31/08/2017.
 */

public class Vista {
    public TextView txtSubTotal;
    public TextView txtNumero;
    public TextView txtOperador;

    public Vista(Activity activity, View.OnClickListener onClickListener){
        this.txtNumero = (TextView) activity.findViewById(R.id.txtNumero);
        this.txtSubTotal = (TextView) activity.findViewById(R.id.txtSubTotal);
        this.txtOperador = (TextView) activity.findViewById(R.id.txtOperador);
        // ConstraintLayout es un ViewGroup
        ConstraintLayout mainLayout = (ConstraintLayout) activity.findViewById(R.id.layout);
        for (int i = 0; i < mainLayout.getChildCount(); i++) {
            View view = mainLayout.getChildAt(i);
            if (view instanceof Button) {
                view.setOnClickListener(onClickListener);
            }

        }
    }

    public void actualizarDisplaySubTotalOperador(String numero,String subTotal,String operador) {
        this.txtNumero.setText(numero);
        this.txtSubTotal.setText(subTotal);
        this.txtOperador.setText(operador);
    }

    public String getDisplay() {
        return this.txtNumero.getText().toString();
    }

    public void setDisplay(String display) {
        this.txtNumero.setText(display);
    }
}
