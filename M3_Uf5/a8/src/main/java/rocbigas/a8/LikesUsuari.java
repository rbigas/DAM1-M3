package rocbigas.a8;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author rocbigas
 */
public class LikesUsuari {

    private String nom;
    private Set<Integer> likes = new TreeSet<>();

    public LikesUsuari(String nom) {
        this.nom = nom;
    }

    public void ferLike(int idFoto) {
        if (likes.contains(idFoto)) {
            likes.remove(idFoto);
        } else {
            likes.add(idFoto);
        }
    }

    public void mostrarLlista() {
        System.out.println(likes);
    }

    public String getNom() {
        return nom;
    }

    public Set<Integer> getLikes() {
        return likes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLikes(Set<Integer> likes) {
        this.likes = likes;
    }

    public Set<Integer> samePhotos(LikesUsuari u) {
        Set<Integer> interseccio = new TreeSet<>();
        interseccio.addAll(likes);
        interseccio.retainAll(u.getLikes());
        return interseccio;
    }

    public Set<Integer> diffPhotos(LikesUsuari u) {
        Set<Integer> diferencia = new TreeSet<>();
        diferencia.addAll(likes);
        diferencia.removeAll(u.getLikes());
        return diferencia;
    }
}
