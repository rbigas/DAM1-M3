package subasta;

/**
 *
 * @author rocbigas
 */
public class Disc extends Article{
    private String autor;
    private String nom;

    public Disc(int any, String estat, int preu, String autor, String nom) {
        super(any, estat, preu);
        this.autor = autor;
        this.nom = nom;
    }

    public String getAutor() {
        return autor;
    }

    public String getNom() {
        return nom;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        String info = String.format(
                "\nParàmetres del disc:\n  Any: %d\n  Estat: %s\n  Preu: %d\n  Autor: %s\n  Nom: %s",
                super.getAny(),
                super.getEstat(),
                super.getPreu(),
                autor,
                nom
        );
        return info;    }
}
