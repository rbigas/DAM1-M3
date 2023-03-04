/**
*  M3 UF1 A16 ex1
**/

package com.mycompany.m3_uf1_a16;

/**
 *
 * @author rocbigas
 */
public class ex1 {
    
    public static void main(String[] args) {
        ex1_canvi(4.0,5.7);
        
    }
    
    public static void ex1_canvi(double importProd, double importClient){
        double total = 0;
        double totalCanvi = 0;
        int monedes2 = 0;
        int monedes1 = 0;
        int monedes50 = 0;
        int monedes20 = 0;
        int monedes10 = 0;
        int monedes5 = 0;
        System.out.println("L'import del producte és de: " + importProd + "€");
        System.out.println("L'import introduït és de: " + importClient + "€");
        if (importClient < importProd) {
            System.out.println("Vostè no ha introduït suficients diners.");
        } else {
            total = importClient - importProd;
            totalCanvi = total;
            if (total >= 2) {
                while (total>=2) {
                    total-=2;
                    monedes2++;
                }
            }
            if (total >= 1) {
                total--;
                monedes1++;
            }
            if (total >= 0.5) {
                total-=0.5;
                monedes50++;
            }
            if (total >= 0.2) {
                while (total>=0.2) {
                    total-=0.2;
                    monedes20++;
                }
            }
            if (total >= 0.1) {
                while (total>=0.1) {
                    total-=0.1;
                    monedes10++;
                }
            }
            if (total >= 0.05) {
                while (total>=0.05) {
                    total-=0.05;
                    monedes5++;
                }
            }         
        }
        System.out.printf("%s %.1f%s", "El canvi és de", totalCanvi, "€\n");
        System.out.println("S'han de tornar les següents monedes:\n" + String.valueOf(monedes2) + " monedes de 2€\n" + String.valueOf(monedes1) + " monedes de 1€\n" + String.valueOf(monedes50) + " monedes de 0.50€\n" + String.valueOf(monedes20) + " monedes de 0.20€\n" + String.valueOf(monedes10) + " monedes de 0.10€\n" + String.valueOf(monedes5) + " monedes de 0.05€");
    }
}
