package rocbigas.a5;

import java.awt.Color;
import java.awt.Point;
import static java.util.concurrent.ThreadLocalRandom.current;
import processing.core.PApplet;

/**
 *
 * @author rocbigas
 */
public class Rectangle extends Figura {

    private static int nRectangleTotal = 0;
    private double base;
    private double alçada;

    public Rectangle(Color color, Point posicio, double base, double alçada) {
        super(color, posicio);
        this.base = base;
        this.alçada = alçada;
        nRectangleTotal++;
    }

    public static int getnRectangleTotal() {
        return nRectangleTotal;
    }

    public double getBase() {
        return base;
    }

    public double getAlçada() {
        return alçada;
    }

    public static void setnRectangleTotal(int nRectangleTotal) {
        Rectangle.nRectangleTotal = nRectangleTotal;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAlçada(double alçada) {
        this.alçada = alçada;
    }

    public void dibuixa(PApplet joc) {
        joc.fill(getColor().getRGB());
        joc.rect(getPosicio().x, getPosicio().y, (float) base, (float) alçada);
    }

    public static Rectangle randomRectangle(Point limit, float minHeight, float maxHeight, float minWidth, float maxWidth) {
        Rectangle rectangle = new Rectangle(
                COLORS[current().nextInt(0, 17)],
                new Point(current().nextInt(0, limit.x), current().nextInt(0, limit.y)),
                current().nextDouble(minWidth, maxWidth),
                current().nextDouble(minHeight, maxHeight));
        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "Color: " + getColor() + ", Posició: " + getPosicio() + ", Base: " + getBase() + ", Alçada: " + getAlçada() + '}';
    }

}
