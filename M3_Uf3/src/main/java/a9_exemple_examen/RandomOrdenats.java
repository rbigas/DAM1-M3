package a9_exemple_examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import static java.lang.System.exit;
import java.util.Arrays;

/**
 *
 * @author rocbi
 */
public class RandomOrdenats {

    public static File crearFitxer(int nNums, String nomFitxer) throws FileNotFoundException {
        if (nNums < 1){
            throw new IllegalArgumentException("Nombre de numeros incorrecte.");
        }
        File randomNumsFile = new File(nomFitxer);
        int[] randomNums = new int[nNums];
        for (int i = 0; i < nNums; i++) {
            randomNums[i] = (int) (Math.floor(Math.random() * 1000) + 1);
        }
        Arrays.sort(randomNums);
        PrintStream ps = new PrintStream(randomNumsFile);
        for (int i = 0; i < nNums; i++) {
            ps.format("%d\n", randomNums[i]);
        }
        ps.close();

        return randomNumsFile;
    }

    private static void help() {
        System.out.println("NomPrograma nombreNumeros nomFitxer");
        System.out.println("OrdenaAtzar 3 Números_Random_Ordenats.txt");
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Nombre d'arguments incorrecte.");
            help();
            exit(0);
        }
        
        int nNums = 0;
        try {
           nNums = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Format numèric incorrecte.");
            System.out.println(e.getMessage());
            help();
            exit(0);
        }

        String nomFitxer = args[1];
        try {
            crearFitxer(nNums, nomFitxer);
        } catch (FileNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            help();
            exit(0);
        }

    }
}
