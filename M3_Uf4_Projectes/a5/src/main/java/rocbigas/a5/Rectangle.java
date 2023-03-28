package rocbigas.a5;

import java.awt.Color;
import java.awt.Point;
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

    @Override
    public String toString() {
        return String.format(
                "%nRectangle:%n"
                + super.toString()
                + "    Base: %s%n"
                + "    Alçada: %s%n"
                + "    Rectangles creats: %s",
                base, alçada, nRectangleTotal
        );
    }

}
