package rocbigas.a5;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class A5_1 {

    public static void main(String[] args) {
        Figura a = new Figura(Color.yellow, new Point(1, 1));
        Cercle b = new Cercle(Color.yellow, new Point(1, 1), 0);
        Rectangle c = new Rectangle(Color.yellow, new Point(1, 1), 0, 0);
        System.out.println(Figura.getNFiguraTotal());
        System.out.println(Cercle.getNCercleTotal());
        System.out.println(Rectangle.getnRectangleTotal());
    }
}
