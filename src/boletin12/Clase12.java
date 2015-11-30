package boletin12;

import javax.swing.JOptionPane;

public class Clase12 {
    int numcoch=0;
    String matric;
    float tiempo;
    float precio;
    float extra=3-tiempo;
    public int numeroCoches(){
        if (numcoch>5||numcoch<0)        
           JOptionPane.showMessageDialog(null, "Error en el numero de coches");
        else 
        return JOptionPane.showMessageDialog(null, "Numero de coches = " + numcoch);
    }
    public String matricula(){
        return matric=JOptionPane.showInputDialog("Introduce la matricula del coche");
    }
    public float tiempo(){
        return tiempo=Float.parseFloat(JOptionPane.showInputDialog("Introduce el tiempo que permanecera el coche en el garaje"));
    }
    public float tarifa(){
        
        if (tiempo<=3)
            precio=1.5f;
        else 
            precio=1.5f+(0.2f*extra);
        return precio;
    }
    public void precio(){
        JOptionPane.showMessageDialog(null, "El precio total a pagar es de " + tarifa());
    }
    public void disponible(){
        if (numcoch<5&&numcoch>=0)
            JOptionPane.showMessageDialog(null, "PLAZAS DISPONIBLES");
        else if (numcoch>=5)
            JOptionPane.showMessageDialog(null, "COMPLETO");
        else JOptionPane.showMessageDialog(null, "Error en el programa, numero de coches incorrecto");
    }
    
}
