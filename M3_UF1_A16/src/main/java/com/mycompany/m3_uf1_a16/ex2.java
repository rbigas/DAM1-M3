/**
*  M3 UF1 A16 ex2
**/

package com.mycompany.m3_uf1_a16;

/**
 *
 * @author rocbigas
 */
public class ex2 {
    public static void main(String args[]){
        ex2_hora("22:35:30", "23:45:40");
    }
    
    public static void ex2_hora (String hora1, String hora2) {
        
        int hora1Decimes = Character.getNumericValue(hora1.charAt(0));
        int hora1Unitats = Character.getNumericValue(hora1.charAt(1));
        int hora1Int = hora1Decimes * 10 + hora1Unitats;
        
        int minuts1Decimes = Character.getNumericValue(hora1.charAt(3));
        int minuts1Unitats = Character.getNumericValue(hora1.charAt(4));
        int minuts1Int = minuts1Decimes * 10 + minuts1Unitats;
        
        int segons1Decimes = Character.getNumericValue(hora1.charAt(6));
        int segons1Unitats = Character.getNumericValue(hora1.charAt(7));
        int segons1Int = segons1Decimes * 10 + segons1Unitats;
        
        System.out.println("Hora1 = " + hora1Int + ":" + minuts1Int + ":" + segons1Int);
        
        int hora2Decimes = Character.getNumericValue(hora2.charAt(0));
        int hora2Unitats = Character.getNumericValue(hora2.charAt(1));
        int hora2Int = hora2Decimes * 10 + hora2Unitats;
        
        int minuts2Decimes = Character.getNumericValue(hora2.charAt(3));
        int minuts2Unitats = Character.getNumericValue(hora2.charAt(4));
        int minuts2Int = minuts2Decimes * 10 + minuts2Unitats;
        
        int segons2Decimes = Character.getNumericValue(hora2.charAt(6));
        int segons2Unitats = Character.getNumericValue(hora2.charAt(7));
        int segons2Int = segons2Decimes * 10 + segons2Unitats;
        
        System.out.println("Hora2 = " + hora2Int + ":" + minuts2Int + ":" + segons2Int);
        
        int horaTotal = hora2Int - hora1Int;
        int minutsTotal = minuts2Int - minuts1Int;
        int segonsTotal = segons2Int - segons1Int;
        
        System.out.println("Temps transcorregut = " + horaTotal + ":" + minutsTotal + ":" + segonsTotal);  
    }
}
