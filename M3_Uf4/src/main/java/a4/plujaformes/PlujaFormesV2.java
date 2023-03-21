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
public class PlujaFormesV2 extends PApplet {

    private final Cercle[] cercles;
    private final int nCercles;

    public PlujaFormesV2(int nCercles, int nTriangles) {
        this.nCercles = nCercles;
        this.cercles = new Cercle[nCercles];
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
        for (int i = 0; i < nCercles; i++) {
            this.cercles[i] = Cercle.randomCercle();
        }
    }

    @Override
    public void draw() {
        frameRate(60);
        background(0);
        for (int i = 0; i < nCercles; i++) {

            int rand = current().nextInt(0, 1);

            cercles[i].dibuixa(this);
            cercles[i].setPosi(new Point(cercles[i].getPosicio().x + current().nextInt(-30, 30), cercles[i].getPosicio().y + current().nextInt(-30, 30)));
        }
//new Point(cercles[i].getPosicio().x + 1, cercles[i].getPosicio().y + 1)
//        try {
//            sleep(15);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(PlujaFormes.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public static void main(String[] args) {
        PlujaFormesV2 joc = new PlujaFormesV2(30, 3);
        PlujaFormes.runSketch(new String[]{"No sé on s'utilitza"}, joc);
    }

}
