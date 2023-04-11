package rocbigas.mobile_world_congress;

/**
 *
 * @author rocbigas
 */
public class Smartphone extends Dispositiu implements GammaAlta{

    private String so;
    private boolean accelerometre;
    private boolean gps;

    public Smartphone(String so, boolean accelerometre, boolean gps, String marca, String model, double preuBase) {
        super(marca, model, preuBase);
        this.so = so;
        this.accelerometre = accelerometre;
        this.gps = gps;
    }

    public String getSo() {
        return so;
    }

    public boolean isAccelerometre() {
        return accelerometre;
    }

    public boolean isGps() {
        return gps;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public void setAccelerometre(boolean accelerometre) {
        this.accelerometre = accelerometre;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return String.format(
                "Smartphone:%n"
                + super.toString()
                + "    SO: %s%n"
                + "    Accelerometre: %b%n"
                + "    GPS: %b",
                so, accelerometre, gps
        );
    }
    
    @Override
    public double getPreuFinal() {
        double mult = 2.0;
        if (accelerometre) mult += 0.1;
        if (gps) mult += 0.05;
        return getPreuBase() * mult;
    }

    @Override
    public boolean isGammaAlta() {
        return getPreuFinal() > 700;
    }
    
}
