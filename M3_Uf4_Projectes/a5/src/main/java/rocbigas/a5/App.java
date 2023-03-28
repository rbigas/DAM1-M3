package rocbigas.a5;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class App {

    public static void main(String[] args) {
        Figura f1 = new Figura(Figura.COLORS[2], new Point(1, 1));
        Figura f2 = new Cercle(Color.yellow, new Point(1, 1), 22);
        Cercle c1 = new Cercle(Color.yellow, new Point(551, 51), 23);
        Cercle c2 = new Cercle(Color.red, new Point(551, 51), 30);
        Rectangle r1 = new Rectangle(Color.yellow, new Point(1, 1), 0, 0);
        Rectangle r2 = new Rectangle(Color.yellow, new Point(1, 1), 0, 0);
        Figura.printNFiguresTotal();
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println("\nID de c1: " + c1.getId());
    }
}
