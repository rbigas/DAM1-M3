package a4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class crearFitxerNotes {

    public static File calcularYMostrarNotes(File fitxerNotes) throws FileNotFoundException, IOException {
        int notaCount = 0;
        double notaTotal = 0;
        int aprovatCount = 0;
        Scanner notes = new Scanner(fitxerNotes);
        File notesAlumnes = new File("notesAlumnes.txt");
        PrintStream printFitxer = new PrintStream(notesAlumnes);
        while (notes.hasNext()) {
            String linia = notes.nextLine();
            Scanner contLinia = new Scanner(linia);
            String nom = contLinia.next();
            double notaAct = Double.parseDouble(contLinia.next());
            double notaPE = Double.parseDouble(contLinia.next());
            double notaPP = Double.parseDouble(contLinia.next());
            double notaAlumne = (notaAct * 0.2 + notaPE * 0.5 + notaPP * 0.3);
            if (notaAlumne >= 5) aprovatCount++;
            notaCount++;
            notaTotal += notaAlumne;
            printFitxer.format("%s %.2f%n", nom, notaAlumne);
        }
        double notaMitjana = notaTotal / notaCount;
        printFitxer.format("Nota mitjana: %.2f%nNº d'aprovats: %d",notaMitjana, aprovatCount);
        return notesAlumnes;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File notes = new File("notes.txt");
        calcularYMostrarNotes(notes);
    }
}
