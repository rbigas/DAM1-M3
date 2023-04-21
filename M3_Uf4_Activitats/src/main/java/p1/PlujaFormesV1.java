package p1;

import a4.Cercle;
import a4.Figura;
import a4.Rectangle;
import java.awt.Point;
import processing.core.PApplet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Thread.sleep;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author rocbigas
 */
public class PlujaFormesV1 extends PApplet {

    private final int nCercles;
    private final int nRectangles;
    private final Cercle[] cercles;
    private final Rectangle[] rectangles;
    private final Point midaFinestra;

    public PlujaFormesV1(int nCercles, int nRectangles, Point midaFinestra) {
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
        this.size(1280, 720);
    }

    @Override
    public void setup() {
        background(0);
        for (int i = 0; i < nCercles; i++) {
            this.cercles[i] = Cercle.randomCercle(midaFinestra, 100, 200);
        }
        for (int i = 0; i < nRectangles; i++) {
            this.rectangles[i] = Rectangle.randomRectangle(midaFinestra, 100, 300, 100, 300);
        }
    }

    @Override
    public void draw() {
        frameRate(60);
        background(0);
        
        for (int i = 0; i < nCercles; i++) {
            cercles[i].dibuixa(this);
            cercles[i].setPosicio(cercles[i].randomPoint(cercles[i].getPosicio(), midaFinestra, 100));
            cercles[i].setColor(Figura.COLORS[current().nextInt(0, 17)]);
        }
        
        for (int i = 0; i < nRectangles; i++) {
            rectangles[i].dibuixa(this);
            rectangles[i].setPosicio(rectangles[i].randomPoint(rectangles[i].getPosicio(), midaFinestra, 75));
            rectangles[i].setColor(Figura.COLORS[current().nextInt(0, 17)]);
        }
        
        try {
            sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlujaFormesV0.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        PlujaFormesV1 joc = new PlujaFormesV1(10, 10, new Point(1280, 720));
        PlujaFormesV1.runSketch(new String[]{"No sé on s'utilitza"}, joc);
    }

}
