package a4;

import java.awt.Color;
import java.awt.Point;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author rocbigas
 */
public class Figura {

    public static final Color[] COLORS = {new Color(255, 0, 102), new Color(255, 102, 0), new Color(255, 204, 0), new Color(51, 255, 0), new Color(0, 153, 255), new Color(153, 0, 255), new Color(255, 0, 204), new Color(102, 255, 255), new Color(204, 255, 0), new Color(204, 102, 255), new Color(255, 153, 0), new Color(0, 255, 204), new Color(255, 0, 255), new Color(204, 255, 0), new Color(0, 255, 204), new Color(102, 0, 204), new Color(204, 0, 0), new Color(204, 102, 0)};
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

    public Point randomPoint(Point posi, Point limit, int salt) {
        Point nouPunt = new Point(posi.x + current().nextInt(-salt, salt), posi.y + current().nextInt(-salt, salt));
        if (nouPunt.x > limit.x || nouPunt.x < 0 || nouPunt.y > limit.y || nouPunt.y < 0) {
            return randomPoint(posi, limit, salt);
        } else {
            return nouPunt;
        }
    }
}
