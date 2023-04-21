package a1;

import java.awt.Color;

/**
 *
 * @author rocbigas
 */
public class ex_3 {

    public static void barrejaColors(Color inicial, Color resultat, int passos) {
        System.out.printf("Color inicial: rgb(%s,%s,%s)\n", inicial.getRed(), inicial.getGreen(), inicial.getBlue());
        double saltColorR = ((double) resultat.getRed() - inicial.getRed()) / (passos + 1);
        double saltColorG = ((double) resultat.getGreen() - inicial.getGreen()) / (passos + 1);
        double saltColorB = ((double) resultat.getBlue() - inicial.getBlue()) / (passos + 1);
        double red = inicial.getRed();
        double green = inicial.getGreen();
        double blue = inicial.getBlue();
        for (int i = 1; i <= passos; i++) {
            red = saltColorR == 0 ? red : red + saltColorR;
            green = saltColorG == 0 ? green : green + saltColorG;
            blue = saltColorB == 0 ? blue : blue + saltColorB;
            System.out.println("red: " + red);
            inicial = new Color((int) Math.round(red), (int) Math.round(green), (int) Math.round(blue));
            System.out.printf("Pas %d: rgb(%s,%s,%s)\n", i,  inicial.getRed(), inicial.getGreen(), inicial.getBlue());
        }
        System.out.printf("Color final: rgb(%s,%s,%s)\n", resultat.getRed(), resultat.getGreen(), resultat.getBlue());

    }

    public static void main(String[] args) {
        Color vermell = new Color(0, 51, 153);
        Color verd = new Color(255, 51, 102);
        barrejaColors(vermell, verd, 7);

    }
}
