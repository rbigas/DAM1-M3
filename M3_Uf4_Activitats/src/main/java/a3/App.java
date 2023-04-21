package a3;

/**
 *
 * @author rocbigas
 */
public class App {

    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta("muntanya");
        bici1.setEstatPlat(3);
        bici1.setEstatPinyo(9);
        bici1.setEstatVelocitat(14.52);
        System.out.println(bici1.toString());
    }
}
