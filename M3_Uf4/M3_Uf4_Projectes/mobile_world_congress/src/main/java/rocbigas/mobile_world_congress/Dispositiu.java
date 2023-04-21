package rocbigas.mobile_world_congress;

/**
 *
 * @author rocbigas
 */
public class Dispositiu {

    private String marca;
    private String model;
    private double preuBase;

    public Dispositiu(String marca, String model, double preuBase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    @Override
    public String toString() {
        return String.format(
                "    Marca: %s%n"
                + "    Model: %s%n"
                + "    Preu base: %s%n",
                marca, model, preuBase
        );
    }
    
    public double getPreuFinal() {
        return preuBase * 2;
    }
}
