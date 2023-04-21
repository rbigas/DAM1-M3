package rocbigas.a0;

import java.util.Date;

/**
 *
 * @author rocbigas
 */
public class App {

    public static void main(String[] args) {

        Carta carta1 = new Carta(300, "Charizard", new Date());
        Carta carta2 = new Carta(300, "Charizard", new Date());

        Album pokemon = new Album();
        pokemon.addCarta(carta1);
        pokemon.addCarta(carta1);
        pokemon.addCarta(new Carta(150, "Mewtwo", new Date()));
        pokemon.addCarta(new Carta(250, "Typhlosion", new Date()));
        pokemon.addCarta(new Carta(100, "Pikachu", new Date()));
        pokemon.addCarta(new Carta(200, "Blastoise", new Date()));

        System.out.println(pokemon);
        System.out.println(carta1.equals(carta2));
        carta1.setDesc("Charmander");
        System.out.println(carta1.equals(carta2));
        System.out.println(pokemon);
        
        pokemon.sort();
        System.out.println(pokemon);

    }
}
