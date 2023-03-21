package a3;

/**
 *
 * @author rocbigas
 */
public class Bicicleta {

    private int maxPlats = 3;
    private int maxPinyons = 7;
    private String tipus = "default";
    private int plat = 1;
    private int pinyo = 1;
    private double velocitat = 0;

    Bicicleta() {

    }

    Bicicleta(int plat, int pinyo, int velocitat) {
        this.plat = plat;
        this.pinyo = pinyo;
        this.velocitat = velocitat;
    }

    Bicicleta(String tipus) {
        switch (tipus.toLowerCase()) {
            case "bmx" -> {
                this.maxPlats = 1;
                this.maxPinyons = 1;
                this.tipus = tipus;
            }
            case "infantil" -> {
                this.maxPlats = 1;
                this.maxPinyons = 3;
                this.tipus = tipus;
            }
            case "carretera" -> {
                this.maxPlats = 3;
                this.maxPinyons = 7;
                this.tipus = tipus;
            }
            case "muntanya" -> {
                this.maxPlats = 3;
                this.maxPinyons = 9;
                this.tipus = tipus;
            }
        }
    }

    public int getEstatPlat() {
        return plat;
    }

    public int getEstatPinyo() {
        return pinyo;
    }

    public double getEstatVelocitat() {
        return velocitat;
    }

    public String getTipus() {
        return tipus;
    }

    public void setEstatPlat(int plat) {
        if (plat < 1) {
            System.out.printf("Nº de plat erroni. El número de plats no pot ser 0 o inferior.\n");
        } else if (plat <= this.maxPlats) {
            this.plat = plat;
            System.out.printf("Plat canviat a %s.\n", plat);
        } else {
            System.out.printf("Nº de plat erroni. Aquesta bicicleta només té %d plat/s.\n", maxPlats);
        }
    }

    public void setEstatPinyo(int pinyo) {
        if (pinyo < 1) {
            System.out.printf("Nº de pinyo erroni. El número de pinyons no pot ser 0 o inferior.\n");
        } else if (pinyo <= this.maxPinyons) {
            this.pinyo = pinyo;
            System.out.printf("Pinyo canviat a %s.\n", pinyo);
        } else {
            System.out.printf("Nº de pinyo erroni. Aquesta bicicleta només té %d pinyons.\n", maxPinyons);
        }
    }

    public void setEstatVelocitat(double velocitat) {
        this.velocitat = velocitat;
        System.out.println("Velocitat canviada a " + velocitat + "km/h.");
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Bicicleta{" + "Tipus: " + tipus + ", Nº de plats: " + maxPlats + ", Nº de pinyons: " + maxPinyons + ", Velocitat: " + velocitat + "kh/h"  + ", Plat actual: " + plat + ", Pinyo actual: " + pinyo + '}';
    }

}
