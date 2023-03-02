package Examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class Exercici2 {

    public static void help() {
        System.out.println("El format dels arguments a introduir és el següent:\n\"nom_fitxer_entrada\" \"nom_fitxer_sortida\"\nS'han d'introduir aquests dos únics arguments.");
    }

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
        if (args.length != 2) {
            System.out.println("Nombre d’arguments incorrecte.");
            help();
            System.exit(0);
        }
        try {
            File entrada = new File(args[0]);
            String nomFitxerSortida = args[1];
            creaMitjana(entrada, nomFitxerSortida);
        } catch (FileNotFoundException exDeFitxer) {
            System.out.println("File not found exception.");
            System.exit(0);
        } catch (InputMismatchException exDeFormat) {
            System.out.println("Format del fitxer d'entrada incorrecte.");
            System.exit(0);
        }

    }
}
