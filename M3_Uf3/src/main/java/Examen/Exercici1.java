package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class Exercici1 {

    public static File creaMitjana(File entrada, String nomFitxerSortida) throws FileNotFoundException {
        Scanner inputFitxer = new Scanner(entrada);
        File sortida = new File(nomFitxerSortida);
        PrintStream ps = new PrintStream(sortida);
        int nUsers = inputFitxer.nextInt();
        ps.format(nUsers + "\n");
        while (inputFitxer.hasNext()) {
            String nomUser = inputFitxer.next();
            double puntsTotal = 0;
            int valCount = 0;
            for (int i = 1; i < 6; i++) {
                int nValoracions = inputFitxer.nextInt();
                valCount += nValoracions;
                int puntuacio = nValoracions * i;
                puntsTotal += puntuacio;
            }
            double mitjana = valCount == 0 ? 3 : puntsTotal / valCount;
            ps.format("%s %.1f %d\n", nomUser, mitjana, valCount);
        }
        inputFitxer.close();
        ps.close();
        return sortida;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File entrada = new File(args[0]);
        String nomFitxerSortida = args[1];
        creaMitjana(entrada, nomFitxerSortida);
    }
}
