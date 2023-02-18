/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExempleExepcions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rocbigas
 */
public class ExempleExepcions {

    public static int llegirEnterFinal(int min, int max) {
        Scanner in = new Scanner(System.in);
        int enter;
        try {
            System.out.format("Entra un número entre %d i %d: ", min, max);
            enter = in.nextInt();
            while (enter < min || enter > max) {
                System.out.println("Numero incorrecte:");
                System.out.format("Entra un número entre %d i %d: ", min, max);
                enter = in.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Has introduït un caràcter invàlid.");
            return llegirEnterFinal(min, max);
        }
        return enter;
    }

    public static void main(String[] args) {
//        try {
//            
//        } catch (Exception e) {
//        }
        llegirEnterFinal(5, 5);
    }
}
