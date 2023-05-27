package menu;

import entitats.Empleat;
import java.util.Scanner;
import repositori.EmpleatRepositori;

/**
 *
 * @author rocbi
 */
public class Menu {

    public void menu() {
        Empleat roc = new Empleat(9, "Roc", "Bigas", 3000f, "DIR", "Barcelona", 4);
        EmpleatRepositori er = new EmpleatRepositori();
        boolean sortir = false;
        Scanner in = new Scanner(System.in);
        while (!sortir) {
            System.out.printf("\nEsculli l'opció que vol executar:\n    0. Sortir\n    1. Mostrar un empleat per Id\n    2. Mostrar un empleat per NIF\n    3. Mostrar tots els empleats\n    4. Afegir un empleat\n    5. Modificar un empleat\n    6. Eliminar un empleat\n");
            int opcio = in.nextInt();
            switch (opcio) {
                case 0:
                    sortir = true;
                    break;
                case 1:
                    System.out.printf("Introdueixi la id de l'empleat:\n");
                    int id = in.nextInt();
                    System.out.println(er.mostrarEmpleatId(id));
                    break;
                case 2:
                    System.out.printf("Introdueixi el NIF de l'empleat:\n");
                    String nif = in.next();
                    System.out.println(er.mostrarEmpleatNif(nif));
                    break;
                case 3:
                    System.out.println(er.mostrarEmpleats());
                    break;
                case 4:
                    er.afegirEmpleat(roc);
                    break;
                case 5:
                    er.modificarEmpleat(roc);
                    break;
                case 6:
                    er.eliminarEmpleat(roc);
                    break;
                default:
                    System.out.println("Opció invàlida.");
            }
            
        }
        in.close();
    }

}
