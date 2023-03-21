package a3.personatges;

import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class AppPersonatge {

    public static void main(String[] args) {
        Personatge p1 = new Personatge("Indiana", new Point(0, 0), 50, "Brúixola");
        Personatge p2 = new Personatge("Pepito", new Point(1, 3), 30);
        System.out.println("Movem al jugador " + p2.getNom() + ".\n");
        p2.mourePersonatge(4);
        for (int i = 0; i < 3; i++) {
            p2.mourePersonatge(3);

        }
        System.out.println(p1.toString() + "\n");
        System.out.println(p2.toString() + "\n");
        System.out.println("Movem al jugador " + p1.getNom() + ".\n");
        for (int i = 0; i < 5; i++) {
            p1.mourePersonatge(1);
        }
        for (int i = 0; i < 5; i++) {
            p1.mourePersonatge(2);
        }
        p1.buidaMotxilla();
        p1.agafarItem("Mapa");
        System.out.println("\n" + p1.toString() + "\n");
        p1.deixarDiners(20, p2);
    }
}
