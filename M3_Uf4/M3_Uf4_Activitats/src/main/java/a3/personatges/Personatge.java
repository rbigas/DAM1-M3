package a3.personatges;

import java.awt.Point;

/**
 *
 * @author rocbigas
 */
public class Personatge {

    //Constants
    public final int AMUNT = 1;
    public final int DRETA = 2;
    public final int AVALL = 3;
    public final int ESQUERRA = 4;
    

    //Estats
    private String nom;
    private Point posi;
    private double pressupost;
    private String motxilla = "Buida";

    //Comportament
    /*
    Moure
    getNom()
    getMotxilla()
    agafarMotxilla()
    deixaDiners()
    aceptaDiners()
    
     */
    //Constructors
    public Personatge(String nom, Point punt, double pressupost) {
        this.nom = nom;
        this.posi = punt;
        this.pressupost = pressupost;

    }

    public Personatge(String nom, Point point, double pressupost, String motxilla) {
        this.nom = nom;
        this.posi = point;
        this.pressupost = pressupost;
        this.motxilla = motxilla;
    }

    //Mètodes
    /*
    Mou el personantge una posició
     */
    public void mourePersonatge(int direccio) {
        switch (direccio) {
            case AMUNT -> {
                posi.y++;
            }
            case AVALL -> {
                posi.y--;
            }
            case ESQUERRA -> {
                posi.x--;
            }
            case DRETA -> {
                posi.x++;
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public Point getPosi() {
        return posi;
    }

    public double getPressupost() {
        return pressupost;
    }

    public String getMotxilla() {
        return motxilla;
    }

    public void setMotxilla(String motxilla) {
        this.motxilla = motxilla;
    }

    public void agafarItem(String item) {
        System.out.println("El jugador " + this.nom + " ha agafat \"" + item + "\" de la motxilla.");
        setMotxilla(item);
    }

    public void buidaMotxilla() {
        System.out.println("El jugador " + this.nom + " ha tret \"" + getMotxilla() + "\" de la motxilla.");
        setMotxilla("Buida");
    }

    public void deixarDiners(double diners, Personatge receptor) {
        this.pressupost -= diners;
        System.out.println("El jugador " + nom + " ha deixat " + diners + "€ " + "al jugador " + receptor.getNom() + ".");
        System.out.println("El jugador " + nom + " ara té " + getPressupost() + "€.");
        receptor.rebreDiners(diners);
    }

    public void rebreDiners(double diners) {
        pressupost += diners;
        System.out.println("El jugador " + nom + " ha rebut " + diners + "€.");
    }

    @Override
    public String toString() {
        return "Dades del personatge " + nom + ":\nPosició: " + posi + "\nPressupost: " + pressupost + "\nContingut motxilla: " + motxilla;
    }

}
