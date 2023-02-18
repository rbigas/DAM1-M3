package a7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class NomsMarvel {

    public static void SeparaHerois(File noms) throws FileNotFoundException {
        File herois = new File("superherois.txt");
        File dolents = new File("dolents.txt");
        String errorHerois = herois.exists() ? "L'arxiu \"superherois.txt\" ja existeix, siusplau elimineu-lo." : "";
        String errorDolents = dolents.exists() ? "L'arxiu \"dolents.txt\" ja existeix, siusplau elimineu-lo." : "";
        String missatgeError = (!errorHerois.isEmpty() && !errorDolents.isEmpty()) ? "Els arxius \"superherois.txt\" i \"dolents.txt\" ja existeixen, siusplau elimineu-los." : errorHerois + errorDolents;
        if (!missatgeError.isEmpty()) {
            System.out.println(missatgeError);
        } else {
            PrintStream psH = new PrintStream(herois);
            PrintStream psD = new PrintStream(dolents);
            Scanner llistaNoms = new Scanner(noms);
            while (llistaNoms.hasNext()) {
                String nom = llistaNoms.nextLine();
                if (nom.matches(".*[sS].*")) {
                    psH.print(nom + "\n");
                } else {
                    psD.print(nom + "\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            File noms = new File("NomsMarvel.txt");
            SeparaHerois(noms);
        } catch (FileNotFoundException e) {
            System.out.println("Nom d'arxiu incorrecte.");
        }

    }
}
