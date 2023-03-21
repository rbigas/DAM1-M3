package rocbigas.m3_uf4;

import java.awt.Color;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author rocbigas
 */
public class M3_Uf4 {

    public static void main(String[] args) {
        Color[] colors = {
            new Color(255, 0, 102), // Rojo
            new Color(255, 102, 0), // Naranja
            new Color(255, 204, 0), // Amarillo
            new Color(51, 255, 0), // Verde
            new Color(0, 153, 255), // Azul
            new Color(153, 0, 255) // Morado
        };
        for (int i = 0; i < 10; i++) {
            System.out.println(colors[i]);
        }
    }
}
