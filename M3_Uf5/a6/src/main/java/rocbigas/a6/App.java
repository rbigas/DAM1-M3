package rocbigas.a6;

import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author rocbigas
 */
public class App {

    public static void main(String[] args) {

        Carta carta1 = new Carta(300, "Charizard", new Date());
//        Carta carta2 = new Carta(300, "Charizard", new Date());
        Album pokemon = new Album();
        pokemon.addCarta(new Carta(150, "Mewtwo", new Date(123, 2, 1, 12, 32)));
        pokemon.addCarta(new Carta(150, "Mewtwo", new Date(123, 1, 2, 12, 32)));
        pokemon.addCarta(new Carta(250, "Typhlosion", new Date(123, 2, 1, 12, 32)));
        pokemon.addCarta(new Carta(100, "Pikachu", new Date(123, 3, 1, 12, 32)));
        pokemon.addCarta(new Carta(200, "Blastoise", new Date()));
        pokemon.addCarta(new Carta(200, "Blastoise", new Date(123, 4, 25, 12, 32)));

//        pokemon.sortDescOrDate();
//        System.out.println(pokemon);

//        for (Carta llista : pokemon) {
//            System.out.println(llista);
//        }
        Iterator it = pokemon.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
//        System.out.println(pokemon);
//        System.out.println(carta1.equals(carta2));
//        carta1.setDesc("Charmander");
//        System.out.println(carta1.equals(carta2));
//        System.out.println(pokemon);
}
