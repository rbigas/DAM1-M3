package rocbigas.m3_uf3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class CalcularNotes {

    public static void calcularYMostrarNotes(File fitxer) throws FileNotFoundException {
        int notaCount = 0;
        double notaTotal = 0;
        int aprovatCount = 0;
        Scanner notes = new Scanner(fitxer);
        while (notes.hasNext()) {
            String linia = notes.nextLine();
            Scanner contLinia = new Scanner(linia);
            String nom = contLinia.next();
            double notaAct = Double.parseDouble(contLinia.next());
            double notaPE = Double.parseDouble(contLinia.next());
            double notaPP = Double.parseDouble(contLinia.next());
            double notaFinal = (notaAct * 0.2 + notaPE * 0.5 + notaPP * 0.3);
            if (notaFinal >= 5) aprovatCount++;
            notaCount++;
            notaTotal += notaFinal;
            System.out.printf("%s %.2f%n", nom, notaFinal);
        }
        double notaMitjana = notaTotal / notaCount;
        System.out.printf("Nota mitjana: %.2f%nNº d'aprovats: %d",notaMitjana, aprovatCount);
        
    }

    public static void main(String[] args) throws FileNotFoundException {
        File notes = new File("notes.txt");
        calcularYMostrarNotes(notes);
    }
}
