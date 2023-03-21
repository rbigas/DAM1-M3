package a4.plujaformes;

import a4.Cercle;
import java.awt.Color;
import java.awt.Point;
import static java.lang.Thread.sleep;
import static java.util.concurrent.ThreadLocalRandom.current;
import processing.core.PApplet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rocbigas
 */
public class PlujaFormes extends PApplet {

    //private Cercle cercle;
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
    public void settings() { //abans de crear la finestra
        //mida finestra
        this.size(1280, 720);
        //this.fullScreen();
    }

    @Override
    public void setup() { //un unic cop a l'inici
        background(0);
    }

    @Override
    public void draw() {
        Color[] colors = {
            new Color(255, 0, 102),
            new Color(255, 102, 0),
            new Color(255, 204, 0),
            new Color(51, 255, 0),
            new Color(0, 153, 255),
            new Color(153, 0, 255),
            new Color(255, 0, 204),
            new Color(102, 255, 255),
            new Color(204, 255, 0),
            new Color(204, 102, 255),
            new Color(255, 153, 0),
            new Color(0, 255, 204),
            new Color(255, 0, 255),
            new Color(204, 255, 0),
            new Color(0, 255, 204),
            new Color(102, 0, 204),
            new Color(204, 0, 0),
            new Color(204, 102, 0)
        };
        frameRate(60);
        Cercle c1 = new Cercle(colors[current().nextInt(0, 17)], new Point(current().nextInt(0, 1280), current().nextInt(0, 720)), current().nextDouble(50, 300));
        Cercle c2 = new Cercle(colors[current().nextInt(0, 17)], new Point(current().nextInt(0, 1280), current().nextInt(0, 720)), current().nextDouble(50, 300));
        c1.dibuixa(this);
        c2.dibuixa(this);
        try {
            sleep(15);
        } catch (InterruptedException ex) {
            Logger.getLogger(PlujaFormes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        PlujaFormes joc = new PlujaFormes();
        PlujaFormes.runSketch(new String[]{"No sé on s'utilitza"}, joc);
    }

}
