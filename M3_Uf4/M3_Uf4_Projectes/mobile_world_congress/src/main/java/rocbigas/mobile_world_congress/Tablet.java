package rocbigas.mobile_world_congress;

/**
 *
 * @author rocbigas
 */
public class Tablet extends Dispositiu implements GammaAlta{

    private int inches;

    public Tablet(int inches, String marca, String model, double preuBase) {
        super(marca, model, preuBase);
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    @Override
    public String toString() {
        return String.format(
                "Tablet:%n"
                + super.toString()
                + "    Inches: %d",
                inches
        );
    }

    @Override
    public boolean isGammaAlta() {
        return getPreuFinal() > 900;
    }

}
