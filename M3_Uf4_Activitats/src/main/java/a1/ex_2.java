package a1;

import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class ex_2 {

    public static Point puntMigDosPunts(Point punt1, Point punt2) {
        int yResultat = (punt1.y + punt2.y) / 2;
        int xResultat = (punt1.x + punt2.x) / 2;
        return new Point(xResultat, yResultat);
    }

    public static Point puntMigTresPunts(Point punt1, Point punt2, Point punt3) {
        int yResultat = (punt1.y + punt2.y + punt3.y) / 3;
        int xResultat = (punt1.x + punt2.x + punt3.x) / 3;
        return new Point(xResultat, yResultat);
    }

    public static void main(String[] args) {
        Point punt1 = new Point​(0, 0);
        Point punt2 = new Point​(35, 40);
        Point punt3 = new Point​(100, 100);
//      System.out.printf("Punt mig entre punt1 i punt 2: %s\n", puntMigDosPunts(punt1, punt2));
//      System.out.printf("Punt mig entre punt2 i punt 3: %s\n", puntMigDosPunts(punt2, punt3));
//      System.out.printf("Punt mig entre punt1 i punt 3: %s\n", puntMigDosPunts(punt1, punt3));
//      System.out.printf("Punt mig entre punt1, punt 2 i punt 3: %s\n", puntMigTresPunts(punt1, punt2, punt3));
        System.out.printf("Distància de punt1 a punt 2: %.2f\n", punt1.distance(punt2));
        System.out.printf("Distància de punt2 a punt 3: %.2f\n", punt2.distance(punt3));
        System.out.printf("Distància de punt1 a punt 3: %.2f", punt1.distance(punt3));
    }
}