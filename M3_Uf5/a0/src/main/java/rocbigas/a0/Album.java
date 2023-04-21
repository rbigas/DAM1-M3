package rocbigas.a0;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author rocbigas
 */
public class Album {

    private ArrayList<Carta> llista;

    public Album() {
        this.llista = new ArrayList<>();
    }

    public void setLlista(ArrayList<Carta> llista) {
        this.llista = llista;
    }

    public ArrayList<Carta> getLlista() {
        return llista;
    }

    public void addCarta(Carta carta) {
        llista.add(carta);
    }

    public void sort() {
        Collections.sort(llista);
    }

    @Override
    public String toString() {
        return llista.toString();
    }

}
