package a4.plujaformes;

import a4.Cercle;
import java.awt.Color;
import java.awt.Point;
import static java.util.concurrent.ThreadLocalRandom.current;
import processing.core.PApplet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;

/**
 *
 * @author rocbigas
 */
public class PlujaFormesV3 extends PApplet {

    private final Cercle[] cercles;
    private final int nCercles;
    private Point midaFinestra;
    private int cerclePointer;

    public PlujaFormesV3(int nCercles, int nTriangles, Point midaFinestra) {
        this.nCercles = nCercles;
        this.cercles = new Cercle[nCercles];
        this.midaFinestra = midaFinestra;
    }

    public Point randomPoint(Point posi) {
        Point prov = new Point(posi.x + current().nextInt(-30, 30), posi.y + current().nextInt(-30, 30));
        if (prov.x > midaFinestra.x || prov.x < 0 || prov.y > midaFinestra.y || prov.y < 0) {
            // If the generated point is outside the bounds, recursively call randomPoint with the same initial position
            return randomPoint(posi);
        } else {
            // If the generated point is within the bounds, return it
            return prov;
        }
    }

    @Override
    public void mousePressed() {
        if (looping) {
            noLoop();
        } else {
            loop();
        }
    }

    @Override
    public void keyPressed() {
        System.out.format("%c", key);
        if (key == 'X' || key == 'x') {
            exit();
        }
    }

    @Override
    public void settings() {
        this.size(1280, 720);
    }

    @Override
    public void setup() {
        background(0);

    }

    @Override
    public void draw() {
        frameRate(60);
        background(0);
        for (int i = 0; i < nCercles; i++) {
            for (int j = 0; j < nCercles; j++) {
                this.cercles[i] = Cercle.randomCercle();
            }
            cercles[i].dibuixa(this);
//            cercles[i].setPosicio(randomPoint(cercles[i].getPosicio()));
        }
//        try {
//            sleep(500);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(PlujaFormes.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public static void main(String[] args) {
        PlujaFormesV3 joc = new PlujaFormesV3(5, 3, new Point(1280, 720));
        PlujaFormes.runSketch(new String[]{"No sé on s'utilitza"}, joc);
    }

}
