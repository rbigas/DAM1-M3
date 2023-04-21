package a2;

/**
 *
 * @author rocbigas
 */
public class Bicicleta {

    private int estatPlat = 1;
    private int estatPinyo = 1;
    private double estatVelocitat = 1;

    Bicicleta(int plat, int pinyo, int velocitat) {
        estatPlat = plat;
        estatPinyo = pinyo;
        estatVelocitat = velocitat;
    }

    public int getEstatPlat() {
        return estatPlat;
    }

    public int getEstatPinyo() {
        return estatPinyo;
    }

    public double getEstatVelocitat() {
        return estatVelocitat;
    }

    public void setEstatPlat(int plat) {
        this.estatPlat = plat;
        System.out.println("Plat canviat a " + plat + ".");
    }

    public void setEstatPinyo(int pinyo) {
        this.estatPinyo = pinyo;
        System.out.println("Pinyó canviat a " + pinyo + ".");

    }

    public void setEstatVelocitat(double velocitat) {
        this.estatVelocitat = velocitat;
        System.out.println("Velocitat canviada a " + velocitat + "km/h.");
    }

}
