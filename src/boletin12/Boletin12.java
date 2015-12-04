package boletin12;
import static boletin12.Clase12.COCHES;
import javax.swing.JOptionPane;

public class Boletin12 {

    public static void main(String[] args) {
        Clase12 obx = new Clase12();

        Tarifa tar = new Tarifa();
        int res;
        do {
            res = Integer.parseInt(JOptionPane.showInputDialog("¿Sale o entra en el garaje?\nMarque 1 si quiere entrar\nMarque 2 si quiere salir.\nSi quiere cerrar el programa marque 3."));

            if (res == 1) {

                obx.plazas();
            } else if (res == 2) {
                tar.pedirmatricula();
                JOptionPane.showMessageDialog(null, "El precio es de: " + tar.precio());
                tar.dindevolto();
                JOptionPane.showMessageDialog(null, "" + tar.toString());
                COCHES--;
            }
        } while (res != 3);

    }
}