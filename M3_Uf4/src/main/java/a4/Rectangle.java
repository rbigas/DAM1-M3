package a4;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class Rectangle extends Figura{

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

    @Override
    public String toString() {
        return "Rectangle {" + "Color: " + getColor() + ", Posició: " + getPosicio() + ", Base: " + getBase() + ", Alçada: " + getAlçada() + '}';
    }

}
