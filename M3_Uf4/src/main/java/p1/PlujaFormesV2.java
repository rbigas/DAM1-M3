package p1;

import a4.Cercle;
import a4.Rectangle;
import java.awt.Point;
import processing.core.PApplet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;

/**
 *
 * @author rocbigas
 */
public class PlujaFormesV2 extends PApplet {

    private final int nCercles;
    private final int nRectangles;
    private final Cercle[] cercles;
    private final Rectangle[] rectangles;
    private final Point midaFinestra;

    public PlujaFormesV2(int nCercles, int nRectangles, Point midaFinestra) {
        this.nCercles = nCercles;
        this.nRectangles = nRectangles;
        this.cercles = new Cercle[nCercles];
        this.rectangles = new Rectangle[nRectangles];
        this.midaFinestra = midaFinestra;
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
        this.size(200, 200);
    }

    @Override
    public void setup() {
        background(0);
    }

    @Override
    public void draw() {
        frameRate(60);
        for (int i = 0; i < nCercles; i++) {
            this.cercles[i] = Cercle.randomCercle(midaFinestra, 100, 200);
        }
        for (int i = 0; i < nRectangles; i++) {
            this.rectangles[i] = Rectangle.randomRectangle(midaFinestra, 100, 300, 100, 300);
        }
        try {
            sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlujaFormesV0.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < nCercles; i++) {
            cercles[i].dibuixa(this);
        }
        try {
            sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlujaFormesV0.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < nRectangles; i++) {
            rectangles[i].dibuixa(this);
        }

    }

    public static void main(String[] args) {
        PlujaFormesV2 joc = new PlujaFormesV2(5, 5, new Point(1280, 720));
        PlujaFormesV2.runSketch(new String[]{"No sé on s'utilitza"}, joc);
    }

}
