package a5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class mostrarNotaMitjanaA5 {

    public static File nomFitxer() throws FileNotFoundException, Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Quin es el nom del fitxer? ");
        String nom = in.next();
        File notesAlumnes = new File(nom);
        if (!notesAlumnes.getName().endsWith(".txt")) {
            throw new Exception("El fitxer no és de text.");
        }
        return notesAlumnes;
    }

    public static void mostraNota() throws Exception {
        Scanner notes = new Scanner(nomFitxer());
        while (notes.hasNext()) { //Llegeix les línies del fitxer fins que troba la que conté el que busquem.
            String linia = notes.nextLine();
            if (linia.contains("Nota mitjana")) {
                System.out.println(linia);
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            mostraNota();
        } catch (FileNotFoundException e) {
            System.out.println("El fitxer no s'ha trobat.");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
