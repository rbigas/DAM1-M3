/**
*  M3 UF1 A16 ex2
**/

package com.mycompany.m3_uf1_a16;

/**
 *
 * @author rocbigas
 */
public class ex3 {
    public static void main(String args[]){
        System.out.println(ex3_calculs_while(100));
        System.out.println(ex3_calculs_for(100));
        System.out.println(ex3_calculs_dowhile(100));
    }
    
    public static String ex3_calculs_while (int num) {
        int i = 1;
        int suma = 0;
        double mult = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                suma += i;
                mult *= i;
            }
            
            i++;
        }
        int mitjana = suma / 100;
        
        return ("Mètode while\nSuma: " + suma + "\nMultiplicació: " + mult + "\nMitjana: " + mitjana);
    }
    
    public static String ex3_calculs_for (int num) {
        int suma = 0;
        double mult = 1;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
                mult *= i;
            }
           
        }
        int mitjana = suma / 100;
        
        return ("\nMètode for\nSuma: "+ suma + "\nMultiplicació: " + mult + "\nMitjana: " + mitjana);
    }
    
    public static String ex3_calculs_dowhile (int num) {
        int i = 1;
        int suma = 0;
        double mult = 1;
        do {            
            if (i % 2 == 0) {
                suma += i;
                mult *= i;
            }
            
            i++;
        } while (i <= 100 );
        int mitjana = suma / 100;
        
        return ("\nMètode do/while\nSuma:"+ suma + "\nMultiplicació: " + mult + "\nMitjana: " + mitjana);
    }
    
}

