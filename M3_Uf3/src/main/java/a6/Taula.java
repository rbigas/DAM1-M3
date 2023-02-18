package a6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author rocbigas
 */
public class Taula {

    public static void creaTaules() throws FileNotFoundException {
        File taula = new File("TaulaMultiplicar.txt");
        PrintStream printFitxer = new PrintStream(taula);

        int multiplicant = 1;
        int multiplicador = 1;

        printFitxer.format("%51s", "TAULA DE MULTIPLICAR\n");
        for (int x = 0; x < 20; x++) {
            for (int i = 0; i < 5; i++) {
                int res = multiplicant * multiplicador;
                printFitxer.format("%2d x %2d = %3d    ", multiplicant, multiplicador, res);
                multiplicant++;
            }
            if (x == 9) {
                printFitxer.append("\n");
                multiplicant = 6;
                multiplicador = 0;
            }
            if (x >= 9) {
                multiplicant = 6;
                multiplicador++;
                printFitxer.append("\n");
            } else {
                multiplicant = 1;
                multiplicador++;
                printFitxer.append("\n");
            }

        }
        printFitxer.append("\n");
    }

    public static void main(String[] args) throws IOException {
        creaTaules();
    }
}
