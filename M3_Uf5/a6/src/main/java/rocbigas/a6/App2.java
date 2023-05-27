package rocbigas.a6;

import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author rocbigas
 */
public class App2 {

    public static void main(String[] args) {

        Coleccio<Carta> pokemon = new Coleccio();
        pokemon.add(new Carta(150, "Mewtwo", new Date(123, 2, 1, 12, 32)));
        pokemon.add(new Carta(150, "Mewtwo", new Date(123, 1, 2, 12, 32)));
        pokemon.add(new Carta(250, "Typhlosion", new Date(123, 2, 1, 12, 32)));
        pokemon.add(new Carta(100, "Pikachu", new Date(123, 3, 1, 12, 32)));
        pokemon.add(new Carta(200, "Blastoise", new Date()));
        pokemon.add(new Carta(200, "Blastoise", new Date(123, 4, 25, 12, 32)));

        pokemon.mostrar();
        System.out.print("\n");

        pokemon.ordenar();
        pokemon.mostrar();
        System.out.print("\n");

        Iterator it = pokemon.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
