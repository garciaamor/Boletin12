package boletin12;


import javax.swing.JOptionPane;

public class Clase12 {
   public static int COCHES = 0;
    String matricula;

    public static int getCOCHES() {
        return COCHES;
    }

    public void plazas() {

        if (COCHES < 5) {
            JOptionPane.showMessageDialog(null, "Hay plazas disponibles en el garaje");
            JOptionPane.showMessageDialog(null, "Ahora mismo hay " + COCHES + "coches en el garaje");
            matricula();
            COCHES++;
        } else {
            JOptionPane.showMessageDialog(null, "Garaje completo");
        }
    }

    public String matricula() {
        return matricula = JOptionPane.showInputDialog("indique la matricula del coche");
    }

}
    
    
    
    
    
    
