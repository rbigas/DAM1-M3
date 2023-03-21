package a4;

import a4.plujaformes.PlujaFormes;
import a4.plujaformes.PlujaFormesV2;
import java.awt.Color;
import java.awt.Point;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author rocbigas
 */
public class Cercle extends Figura {

    public static final Color[] COLORS = {
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
    
    public void dibuixa(PlujaFormes joc) {
        joc.fill(getColor().getRGB());
        float diametre = (float) radi * 2;
        joc.ellipse(getPosicio().x, getPosicio().y, diametre, diametre);
    }
    
    public void dibuixa(PlujaFormesV2 joc) {
        joc.fill(getColor().getRGB());
        float diametre = (float) radi * 2;
        joc.ellipse(getPosicio().x, getPosicio().y, diametre, diametre);
    }

    public static Cercle randomCercle() {
        Cercle cercle = new Cercle(COLORS[current().nextInt(0, 17)], new Point(current().nextInt(0, 1280), current().nextInt(0, 720)), current().nextDouble(50, 250));
        return cercle;
    }

    @Override
    public String toString() {
        return "Cercle {" + "Color: " + getColor() + ", Posició: " + getPosicio() + ", Radi: " + radi + '}';
    }
}
