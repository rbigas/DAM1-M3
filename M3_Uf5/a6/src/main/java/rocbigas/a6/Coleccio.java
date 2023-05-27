package rocbigas.a6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author rocbigas
 * @param <E>
 */
public class Coleccio<E extends Comparable<E>> implements Iterable<E> {

    private ArrayList<E> llista;

    public Coleccio() {
        llista = new ArrayList<>();
    }

    public void add(E e) {
        llista.add(e);
    }

    public void mostrar() {
        for (E e : llista) {
            System.out.println(e);
        }
    }

    public void ordenar() {
        Collections.sort(llista);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < llista.size();
            }

            @Override
            public E next() {
                return llista.get(index++);
            }

        };
    }

}
