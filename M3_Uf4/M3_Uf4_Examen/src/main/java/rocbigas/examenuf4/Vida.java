package rocbigas.examenuf4;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author rocbigas
 */
public class Vida extends Asseguranca implements PreuAssegurança, AssegurançaAmbPunts {
    
    private LocalDate dataNaix;
    private String nom;

    public Vida(LocalDate dataNaix, String nom, LocalDate dataInici, String dniTitular, double capital) {
        super(dataInici, dniTitular, capital);
        this.dataNaix = dataNaix;
        this.nom = nom;
    }

    public LocalDate getDataNaix() {
        return dataNaix;
    }

    public String getNom() {
        return nom;
    }

    public void setDataNaix(LocalDate dataNaix) {
        this.dataNaix = dataNaix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Vida{" + super.toString() + "dataNaix=" + dataNaix + ", nom=" + nom + '}';
    }

    @Override
    public double getPreu() {
        double base = getCapital() * 0.1;
        double preuFinal;
        int edat = Period.between(getDataNaix(), LocalDate.now()).getYears();
        double descompte = ((double) (90 - edat) / 100);
        if (edat >= 90) {
            return base;
        } else {
            return base - (base * descompte);
        }
    }

    @Override
    public int puntsPremi() {
        if (getPreu() > 600) {
            return ((int) getPreu() - 600) / 10;
        } else {
            return 0;
        }
    }
    
    

}
