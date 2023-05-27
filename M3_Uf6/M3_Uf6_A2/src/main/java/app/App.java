package app;

import entitats.Empleat;
import repositori.EmpleatRepositori;

/**
 *
 * @author roc
 */
public class App {

    public static void main(String[] args) {
        Empleat roc = new Empleat(9, "Roc", "Bigas", 3000f, "DIR", "Barcelona", 4);
        EmpleatRepositori er = new EmpleatRepositori();
        er.afegirEmpleat(roc);
        System.out.println(er.mostrarEmpleatId(9));
        roc.setNomEmpl("Daniel");
        er.actualitzarEmpleat(roc);
        System.out.println(er.mostrarEmpleatId(9));
        System.out.println(er.mostrarEmpleatNif("21458693Z"));
        er.eliminarEmpleat(roc);
        System.out.println(er.mostrarEmpleats());
        
    }

}
