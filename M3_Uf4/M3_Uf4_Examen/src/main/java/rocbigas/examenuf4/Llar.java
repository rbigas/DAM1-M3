package rocbigas.examenuf4;

import java.time.LocalDate;

/**
 *
 * @author rocbigas
 */
public class Llar extends Asseguranca implements PreuAssegurança,AssegurançaAmbPunts {

    private String direccioCasa;

    public Llar(String direccioCasa, LocalDate dataInici, String dniTitular, double capital) {
        super(dataInici, dniTitular, capital);
        this.direccioCasa = direccioCasa;
    }

    public String getDireccioCasa() {
        return direccioCasa;
    }

    public void setDireccioCasa(String direccioCasa) {
        this.direccioCasa = direccioCasa;
    }

    @Override
    public String toString() {
        return "Llar{" + super.toString() + "direccioCasa=" + direccioCasa + '}';
    }

    @Override
    public double getPreu() {
        return getCapital() * 0.01;
    }

    @Override
    public int puntsPremi() {
        return 100;
    }
}
