package a4;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class AppFigures {

    public static void main(String[] args) {
        Color[] colors = {
            new Color(255, 0, 102), // Rojo
            new Color(255, 102, 0), // Naranja
            new Color(255, 204, 0), // Amarillo
            new Color(51, 255, 0), // Verde
            new Color(0, 153, 255), // Azul
            new Color(153, 0, 255) // Morado
        };
        Rectangle r1 = new Rectangle(Color.yellow, new Point(0, 0), 10, 20);
        Cercle c1 = new Cercle(Color.green, new Point(640, 360), 180);
        Rectangle r2 = new Rectangle(Color.magenta, new Point(300, 250), 270, 315);
        Cercle c2 = new Cercle(Color.blue, new Point(10, 30), 10);
        Cercle c3 = new Cercle(colors[1], new Point(0, 0), 0);
        System.out.printf("Cercle c1: \n   Àrea: %.2f \n   Perímetre: %.2f \n   Dades del cercle: %s\n", c1.getRadi() * c1.getRadi() * Math.PI, Math.PI * c1.getRadi(), c1.toString());
        System.out.printf("Cercle c2: \n   Àrea: %.2f \n   Perímetre: %.2f \n   Dades del cercle: %s\n", c2.getRadi() * c2.getRadi() * Math.PI, Math.PI * c2.getRadi(), c2.toString());
        System.out.printf("Rectangle r1:\n   Àrea: %.2f\n   Perímetre: %.2f\n   Dades del rectangle: %s\n", r1.getBase() * r1.getAlçada(), r1.getBase() * 2 + r1.getAlçada() * 2, r1.toString());
        System.out.printf("Rectangle r2:\n   Àrea: %.2f\n   Perímetre: %.2f\n   Dades del rectangle: %s", r2.getBase() * r2.getAlçada(), r2.getBase() * 2 + r2.getAlçada() * 2, r2.toString());
    }
}
