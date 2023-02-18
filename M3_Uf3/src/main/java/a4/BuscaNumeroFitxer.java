package a4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class BuscaNumeroFitxer {
    
    public static File crearFitxer(File llistaPrimers, String nomSortida, int numAcaba) throws FileNotFoundException, IOException {
        File sortidaFitxer = new File(nomSortida);
        FileWriter writer = new FileWriter(sortidaFitxer, true);
        Scanner in = new Scanner(llistaPrimers);
        while (in.hasNext()) {   
            int numFitxer = Integer.parseInt(in.nextLine());
            if (numFitxer == numAcaba || numFitxer % 10 == numAcaba) {
                writer.write(Integer.toString(numFitxer) + "\n");
            }
        }
        return sortidaFitxer;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File llistaPrimers = new File("primers.txt");
        crearFitxer(llistaPrimers, "sortida.txt", 7);
    }
}
