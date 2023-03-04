package com.mycompany.m3_uf1_a16;

import java.util.Scanner;

public class a18 {
    private static final int FINAL = -1;
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String args[]) {
        //esquema de recorregut
        //iniciarSequencia
        int codi = iniciarSequencia();
        
        //iniciar tractament
        int tempsEstudiar=0;
        int tempsXarxesOVideojocs = 0;
        while(esFinal(codi)){
            //tractar element
            int temps = entrada.nextInt();
            if (codi==1){
                tempsEstudiar = tempsEstudiar + temps;
            } else {
                if (codi == 2 || codi == 3){
                    tempsXarxesOVideojocs += temps;
                }
            }
            //avançar
            codi = entrada.nextInt();
        }
        //tractament final
        if (tempsEstudiar >= tempsXarxesOVideojocs){
            System.out.println("Enhorabona! Aquesta vegada pots sortir");
        } else {
             System.out.println("No pots sortir: has d'estudiar més i jugar menys!");
        }
   }
    public static int iniciarSequencia() {
        return entrada.nextInt();
    }
    public static boolean esFinal(int codi) {
        return !(codi == FINAL);
    }
}

