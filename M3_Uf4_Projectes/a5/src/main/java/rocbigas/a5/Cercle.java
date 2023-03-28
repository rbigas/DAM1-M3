package rocbigas.a5;

import java.awt.Color;
import java.awt.Point;
import processing.core.PApplet;

/**
 *
 * @author rocbigas
 */
public class Cercle extends Figura {

    private static int nCercleTotal = 0;
    private double radi;

    public Cercle(Color color, Point posi, double radi) {
        super(color, posi);
        this.radi = radi;
        nCercleTotal++;
    }

    public static int getNCercleTotal() {
        return nCercleTotal;
    }

    public double getRadi() {
        return radi;
    }

    public static void setNCercleTotal(int nCercleTotal) {
        Cercle.nCercleTotal = nCercleTotal;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public void dibuixa(PApplet joc) {
        joc.fill(getColor().getRGB());
        float diametre = (float) radi * 2;
        joc.ellipse(getPosicio().x, getPosicio().y, diametre, diametre);
    }

    @Override
    public String toString() {
        return String.format(
                "Cercle:%n"
                + super.toString()
                + "    Radi: %s%n"
                + "    Cercles creats: %s",
                radi, nCercleTotal
        );
    }
}
