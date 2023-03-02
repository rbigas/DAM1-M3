package a1;

import java.awt.Color;

/**
 *
 * @author rocbigas
 */
public class ex_3 {

    public static void creaColors() {
        Color vermell = new Color(255, 0, 0);
        Color verd = new Color(0.0f, 1.0f, 0.0f);
        Color blau = new Color(0, 0, 255);
        System.out.println("Valors del color vermell: " + vermell);
        System.out.println("Valors del color verd: " + verd);
        System.out.println("Valors del color blau: " + blau);

    }

    public static void main(String[] args) {
        creaColors();
    }
}
