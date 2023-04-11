package rocbigas.mobile_world_congress;

/**
 *
 * @author rocbigas
 */
public class Main {

    public static void main(String[] args) {
        Dispositiu[] dispositius = {
            new Altre("Un rellotge molt bo.", "Samsung", "Galaxy Watch", 129),
            new Smartphone("Android", false, false, "Samsung", "Galaxy S21", 300),
            new Smartphone("iOS", true, true, "Apple", "iPhone 13", 500),
            new Tablet(10, "Lenovo", "Yoga Tab", 400),
            new Altre("Aspiradora intel·ligent.", "Roomba", "G5 Max", 299)
        };

        for (int i = 0; i < 5; i++) {
            System.out.println(dispositius[i]);
            System.out.printf("    Preu base: %.2f%n", dispositius[i].getPreuBase());
            System.out.printf("    Preu final: %.2f%n", dispositius[i].getPreuFinal());
            if (dispositius[i] instanceof GammaAlta) {
                String r = ((GammaAlta) dispositius[i]).isGammaAlta() ? "És gamma alta." : "No és gamma alta.";
                System.out.println("    Gamma: " + r);
            }
        }

    }
}
