package a9_exemple_examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rocbi
 */
public class FusionarFitxers {

    public static void main(String[] args) {
        File fitxer1 = new File(args[0]);
        File fitxer2 = new File(args[1]);
        try {
            fusionarFitxers(fitxer1, fitxer2, args[2]);
        } catch (FileNotFoundException e) {
            System.out.println("No s'ha trobat el fitxer.");
            System.exit(0);
        }

    }

    public static File fusionarFitxers(File fitxer1, File fitxer2, String nomFitxerResultat) throws FileNotFoundException {
        File resultat = new File(nomFitxerResultat);
        PrintStream ps = new PrintStream(resultat);
        int[] numsF1 = new int[10];
        int[] numsF2 = new int[10];
        Scanner scanner1 = new Scanner(fitxer1);
        Scanner scanner2 = new Scanner(fitxer2);
        for (int i = 0; i < numsF1.length; i++) {
            numsF1[i] = Integer.parseInt(scanner1.nextLine());
        }
        scanner1.close();
        for (int i = 0; i < numsF2.length; i++) {
            numsF2[i] = Integer.parseInt(scanner2.nextLine());
        }
        scanner2.close();
        
        int[] numsTotal = new int[numsF1.length + numsF2.length];
        System.arraycopy(numsF1, 0, numsTotal, 0, numsF1.length);
        System.arraycopy(numsF2, 0, numsTotal, numsF1.length, numsF2.length);
        Arrays.sort(numsTotal);
        for (int i = 0; i < numsTotal.length; i++) {
            ps.append(numsTotal[i] + "\n");
        }
        return resultat;
    }
}
