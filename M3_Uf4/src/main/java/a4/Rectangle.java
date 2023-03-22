package a4;

import a4.plujaformes.PlujaFormesV2;
import java.awt.Color;
import java.awt.Point;
import static java.util.concurrent.ThreadLocalRandom.current;
import processing.core.PApplet;

/**
 *
 * @author rocbigas
 */
public class Rectangle extends Figura {

    private double base;
    private double alçada;

    public Rectangle(Color color, Point posicio, double base, double alçada) {
        super(color, posicio);
        this.base = base;
        this.alçada = alçada;
    }

    public double getBase() {
        return base;
    }

    public double getAlçada() {
        return alçada;
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

    public static Rectangle randomRectangle() {
        Rectangle rectangle = new Rectangle (
                PlujaFormesV2.COLORS[current().nextInt(0, 17)],
                new Point(current().nextInt(0, 1280), current().nextInt(0, 720)),
                current().nextDouble(100, 300),
                current().nextDouble(100, 300));
        return rectangle;
    }

    @Override
    public String toString() {
        return "Rectangle {" + "Color: " + getColor() + ", Posició: " + getPosicio() + ", Base: " + getBase() + ", Alçada: " + getAlçada() + '}';
    }

}
