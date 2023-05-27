package rocbigas.examenuf5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author peregc
 */
public class Persones implements Iterable<Persona> {

    private ArrayList<Persona> llista;

    public Persones() {
        llista = new ArrayList<>();
    }

    public void add(Persona persona) {
        llista.add(persona);
    }

    public void primeres5() {
        for (int i = 0; i < 5; i++) {
            System.out.println(llista.get(i));
        }
    }

    public void nPersones() {
        int i = 0;
        for (Persona p : llista) {
            i++;
        }
        System.out.println("Tenim " + i + " persones.");
    }

    @Override
    public Iterator<Persona> iterator() {
        return llista.iterator();
    }

    public void sort() {
        Collections.sort(llista);
    }

    public void sortByDate() {
        Collections.sort(llista, (Persona p1, Persona o2) -> p1.getBirthDate().compareTo(o2.getBirthDate()));
    }

    public void eliminaDuplicats() {
        Set<Persona> setP = new TreeSet<>();
        for (Persona p : llista) {
            setP.add(p);
        }
        llista.clear();
        for (Persona p : setP) {
            llista.add(p);
        }
    }

    public void personesPerEmpresa() {
        Map<String, Integer> empreses = new HashMap<>();
        for (Persona p : llista) {
            if (!empreses.containsKey(p.getCompany())) {
                empreses.put(p.getCompany(), 1);
            } else {
                empreses.put(p.getCompany(), empreses.get(p.getCompany()) + 1);
            }
        }
        System.out.println(empreses);
    }

}
