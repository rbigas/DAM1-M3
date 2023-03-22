package a4.plujaformes;

import a4.Cercle;
import a4.Rectangle;
import java.awt.Color;
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
public class PlujaFormesV2 extends PApplet {

    public static final Color[] COLORS = {new Color(255, 0, 102), new Color(255, 102, 0), new Color(255, 204, 0), new Color(51, 255, 0), new Color(0, 153, 255), new Color(153, 0, 255), new Color(255, 0, 204), new Color(102, 255, 255), new Color(204, 255, 0), new Color(204, 102, 255), new Color(255, 153, 0), new Color(0, 255, 204), new Color(255, 0, 255), new Color(204, 255, 0), new Color(0, 255, 204), new Color(102, 0, 204), new Color(204, 0, 0), new Color(204, 102, 0)};
    private final Cercle[] cercles;
    private final Rectangle[] rectangles;
    private final int nCercles;
    private final int nRectangles;
    private Point midaFinestra;
    private int cerclePointer;

    public PlujaFormesV2(int nCercles, int nRectangles, Point midaFinestra) {
        this.nCercles = nCercles;
        this.nRectangles = nRectangles;
        this.cercles = new Cercle[nCercles];
        this.rectangles = new Rectangle[nRectangles];
        this.midaFinestra = midaFinestra;
    }

    public Point randomPoint(Point posi, int salt) {
        Point prov = new Point(posi.x + current().nextInt(-salt, salt), posi.y + current().nextInt(-salt, salt));
        if (prov.x > midaFinestra.x || prov.x < 0 || prov.y > midaFinestra.y || prov.y < 0) {
            return randomPoint(posi, salt);
        } else {
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
        for (int i = 0; i < nCercles; i++) {
            this.cercles[i] = Cercle.randomCercle();
        }
        for (int i = 0; i < nRectangles; i++) {
            this.rectangles[i] = Rectangle.randomRectangle();
        }
    }

    @Override
    public void draw() {
        frameRate(60);
        background(0);
        for (int i = 0; i < nCercles; i++) {
            cercles[i].dibuixa(this);
            cercles[i].setPosicio(randomPoint(cercles[i].getPosicio(), 50));
            rectangles[i].dibuixa(this);
            rectangles[i].setPosicio(randomPoint(rectangles[i].getPosicio(), 50));
        }
        try {
            sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlujaFormes.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < nCercles; i++) {
            cercles[i].setColor(COLORS[current().nextInt(0, 17)]);
            rectangles[i].setColor(COLORS[current().nextInt(0, 17)]);
        }
    }

    public static void main(String[] args) {
        PlujaFormesV2 joc = new PlujaFormesV2(10, 10, new Point(1280, 720));
        PlujaFormes.runSketch(new String[]{"No sé on s'utilitza"}, joc);
    }

}
