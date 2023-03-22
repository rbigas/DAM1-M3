package a4;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class Figura {

    private Color color;
    private Point posicio;

    public Figura(Color color, Point posicio) {
        this.color = color;
        this.posicio = posicio;
    }

    public Color getColor() {
        return color;
    }

    public Point getPosicio() {
        return posicio;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPosicio(Point posicio) {
        this.posicio = posicio;
    }
}
