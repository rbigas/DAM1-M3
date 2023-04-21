package rocbigas.examenuf4;

import java.time.LocalDate;

/**
 *
 * @author rocbigas
 */
public class Cotxe extends Asseguranca implements PreuAssegurança, AssegurançaAmbPunts {

    private String matricula;
    private LocalDate dataMatricula;
    private int nPlaces = 5;

    public Cotxe(String matricula, LocalDate dataMatricula, int nPlaces, LocalDate dataInici, String dniTitular, double capital) {
        super(dataInici, dniTitular, capital);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
        this.nPlaces = nPlaces;
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public int getnPlaces() {
        return nPlaces;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setnPlaces(int nPlaces) {
        this.nPlaces = nPlaces;
    }

    @Override
    public String toString() {
        return "Cotxe{" + super.toString() + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", nPlaces=" + nPlaces + '}';
    }

    @Override
    public double getPreu() {
        return getCapital() * 0.1;
    }

    @Override
    public int puntsPremi() {
        return (int) getPreu() / 50;
    }

}
