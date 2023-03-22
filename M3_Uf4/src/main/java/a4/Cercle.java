package a4;

import a4.plujaformes.PlujaFormes;
import a4.plujaformes.PlujaFormesV2;
import java.awt.Color;
import java.awt.Point;
import static java.util.concurrent.ThreadLocalRandom.current;
import processing.core.PApplet;

/**
 *
 * @author rocbigas
 */
public class Cercle extends Figura {

    private double radi;

    public Cercle(Color color, Point posi, double radi) {
        super(color, posi);
        this.radi = radi;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public void dibuixa(PApplet joc) {
        joc.fill(getColor().getRGB());
        float diametre = (float) radi * 2;
        joc.ellipse(getPosicio().x, getPosicio().y, diametre, diametre);
    }

    public static Cercle randomCercle() {
        Cercle cercle = new Cercle(
                PlujaFormesV2.COLORS[current().nextInt(0, 17)],
                new Point(current().nextInt(0, 1280), current().nextInt(0, 720)),
                current().nextDouble(100, 200));
        return cercle;
    }

    @Override
    public String toString() {
        return "Cercle {" + "Color: " + getColor() + ", Posició: " + getPosicio() + ", Radi: " + radi + '}';
    }
}
