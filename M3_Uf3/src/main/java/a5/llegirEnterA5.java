package a5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class llegirEnterA5 {

    public static void llegirEnterSafeMode(int min, int max) {
        try {
            llegirEnter(min, max);
        } catch (InputMismatchException e) {
            System.out.println("Format erroni.");
            llegirEnterSafeMode(min, max);
        } catch (Exception e) {
            Scanner in = new Scanner(System.in);
            System.out.println("El mínim no pot ser major que el màxim, format d'entrada incorrecte.");
            while (min > max) {
                System.out.println("Introduiex un rang vàlid:");
                System.out.print("Mínim: ");
                min = in.nextInt();
                System.out.print("Màx: ");
                max = in.nextInt();
            }
            llegirEnterSafeMode(min, max);
        }
    }

    public static int llegirEnter(int min, int max) throws InputMismatchException, Exception {
        int enter;
        if (min > max) {
            throw new Exception("Valors erronis.");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.format("Entra un número entre %d i %d: ", min, max);
            enter = in.nextInt();
            while (enter < min || enter > max) {
                System.out.println("Numero incorrecte:");
                llegirEnter(min, max);
            }
        }
        return enter;
    }

    public static void main(String[] args) {
        int min = 15, max = 5;
        llegirEnterSafeMode(min, max);
    }
}
