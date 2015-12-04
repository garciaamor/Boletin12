package boletin12;

import javax.swing.JOptionPane;

public class Tarifa {
    
String mat;
    float tiempo;
    float pre;
    float cartosRecibidos;
    float cartosDevoltos;

    public String pedirmatricula() {
        Clase12 obx = new Clase12();
        mat = obx.matricula();
        return mat;
    }

    public float tiempo() {
        return tiempo = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el tiempo que el coche permanecera en el garaje"));
    }

    public float precio() {
        float tiem = tiempo();
        if (tiem <= 3) {
            pre = 1.5f;
        } else {
            float tiem2 = (tiem - 3);
            pre = (float) (+1.5 + (0.2 * tiem2));
        }
        return pre;
    }

    public float dinrecibido() {
        return cartosRecibidos = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidad de dinero que introdujo en la maquina"));
    }

    public float dindevolto() {
        float dinero = dinrecibido();
        cartosDevoltos = dinero - pre;
        return cartosDevoltos;
    }

    @Override
    public String toString() {
        return "Factura:" + "\nMatricula=" + mat + "\nTiempo=" + tiempo + "horas" + "\nPrecio=" + pre + "€" + "\nCartos recibidos=" + cartosRecibidos + "€" + "\nCartos devoltos=" + cartosDevoltos + "€";
    }

}