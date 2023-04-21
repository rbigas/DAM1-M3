package rocbigas.mobile_world_congress;

/**
 *
 * @author rocbigas
 */
public class Altre extends Dispositiu {

    private String decription;

    public Altre(String decription, String marca, String model, double preuBase) {
        super(marca, model, preuBase);
        this.decription = decription;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    @Override
    public String toString() {
        return String.format(
                "Altre:%n"
                + super.toString()
                + "    Descripció: %s",
                decription
        );
    }

}
