package a4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class mostrarNotaMitjana { //Llegeix les línies del fitxer fins que troba la que conté el que busquem.

    public static void main(String[] args) throws FileNotFoundException {
        File notesAlumnes = new File("notesAlumnes.txt");
        Scanner notes = new Scanner(notesAlumnes);
        while (notes.hasNext()) {
            String linia = notes.nextLine();
            if (linia.contains("Nota mitjana")) {
                System.out.println(linia);
                break;
            }
        }
    }
}
