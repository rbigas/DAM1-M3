package rocbigas.a6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author rocbigas
 */
public class Album implements Iterable<Carta> {

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

    public void sortDesc() {
        Collections.sort(llista, (Carta o1, Carta o2) -> o1.getDesc().compareTo(o2.getDesc()));
    }

    public void sortId() {
        Collections.sort(llista, (Carta o1, Carta o2) -> o2.getId().compareTo(o1.getId()));
    }

    public void sortDescOrDate() {
        Collections.sort(llista, new Comparator<Carta>() {
            @Override
            public int compare(Carta o1, Carta o2) {
                int res = o1.getDesc().compareTo(o2.getDesc());
                if (res != 0) {
                    return res;
                } else {
                    return o1.getDataCarta().compareTo(o2.getDataCarta());
                }
            }
        });
    }

    @Override
    public String toString() {
        return llista.toString();
    }

    @Override
    public Iterator<Carta> iterator() {
        return new Iterator<Carta>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < llista.size();
            }

            @Override
            public Carta next() {
                return llista.get(index++);
            }

        };
    }

}
