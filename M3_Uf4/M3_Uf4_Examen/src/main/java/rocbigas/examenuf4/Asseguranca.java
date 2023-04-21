package rocbigas.examenuf4;

import java.time.LocalDate;

/**
 *
 * @author rocbigas
 */
public class Asseguranca {

    private static int contadorAssegurança = 0;
    private int codi;
    private LocalDate dataInici;
    private String dniTitular;
    private double capital;

    public Asseguranca(LocalDate dataInici, String dniTitular, double capital) {
        this.dataInici = dataInici;
        this.dniTitular = dniTitular;
        this.capital = capital;
        this.codi = ++contadorAssegurança;
    }

    public LocalDate getDataInici() {
        return dataInici;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public double getCapital() {
        return capital;
    }

    public void setDataInici(LocalDate dataInici) {
        this.dataInici = dataInici;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "codi=" + codi + ", dataInici=" + dataInici + ", dniTitular=" + dniTitular + ", capital=" + capital + ", ";
    }

}
