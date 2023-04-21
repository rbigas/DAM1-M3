package a2;

/**
 *
 * @author rocbigas
 */
public class App {

    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta(1, 1, 6);
        System.out.println("Estat plat: " + bici1.getEstatPlat());
        System.out.println("Estat pinyó: " + bici1.getEstatPinyo());
        System.out.println("Estat velocitat: " + bici1.getEstatVelocitat() + "km/h");
        bici1.setEstatPlat(3);
        bici1.setEstatPinyo(5);
        bici1.setEstatVelocitat(34);
        System.out.println("Estat plat: " + bici1.getEstatPlat());
        System.out.println("Estat pinyó: " + bici1.getEstatPinyo());
        System.out.println("Estat velocitat: " + bici1.getEstatVelocitat() + "km/h");
    }
}
