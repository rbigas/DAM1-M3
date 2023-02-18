package rocbigas.m3_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class AppPrimers {

    public static File fitxerExistent() {
        Scanner in = new Scanner(System.in);
        File fitxer = null;
        String nomFitxer = "";
        boolean correcte = false;
        while (!correcte) {            
            //Entra nom per teclat
            //Comprova si és correcte (existeix)
            System.out.println("Entra el nom del fitxer de primers: ");
            nomFitxer = in.nextLine();
            fitxer = new File (nomFitxer);
            correcte = fitxer.exists() && fitxer.isFile();
        }
        return fitxer;
    }

    private static void mostraPropietatsFitxer(File fitxer) {
        System.out.println("Absolute path: " + fitxer.getAbsoluteFile());
        System.out.println("Absolute file: " + fitxer.getAbsoluteFile());
        System.out.println("Name: " + fitxer.getName());

    }
    
    private static int quantsNumerosTe(File fitxer) throws FileNotFoundException {
        int count = 0;
        Scanner contingut = new Scanner(fitxer);
        while (contingut.hasNext()) {        
            if (contingut.nextInt() != 0) {
                count++;
            }
        }
        return count;
    }
    
    private static boolean esPrimer(File llista, int num) throws FileNotFoundException {
        boolean trobat = false;
        Scanner esPrimer = new Scanner(llista);
        while (esPrimer.hasNext() && trobat == false) {            
            if (esPrimer.nextInt() == num) {
                trobat = true;
            }
        }
        return trobat;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        //TODO 1 fitxerExistent
        File fitxer = fitxerExistent();
        
        //TODO 2 propietats del fitxer
        mostraPropietatsFitxer(fitxer);

        //3. TODO 3
        //Feu un mètode que donat un fitxer de primers mostri per pantalla quants 
        //números té
        File primersLlista = new File("primers-to-100k.txt");
        System.out.println("L'arxiu \"primers-to-100k.txt\" conté " + quantsNumerosTe(primersLlista) + " nombres.");
        
        //4. TODO 4
        // Feu un mètode que donat un numero i un fitxer de primers 
        // determini, mirant el fitxer, si aquest número és primer
        // (és a dir, si es troba al fitxer).
        System.out.println(esPrimer(primersLlista, 11)? "El número és primer, ja que es troba al fitxer." : "El número NO és primer, ja que NO es troba al fitxer.");
    }

}
