/**
*  M3 UF1 A16 ex2
**/

package com.mycompany.m3_uf1_a16;

/**
 *
 * @author rocbigas
 */

import java.util.Scanner;
public class ex4 {
    public static void main (String args[]){
        int sumaParells = 0;
        int nParells = 0;
        int sumaSenars = 0;
        int nSenars = 0;
        int[] nums = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            nums[i] = in.nextInt();
            if (nums[i] % 2 == 0) {
                nParells++;
                sumaParells += nums[i];
            } else {
                nSenars++;
                sumaSenars += nums[i];
            }
        }
        double mitjanaSenars = (double) sumaSenars / nSenars;
        System.out.println("Suma nombre parells: " + sumaParells + "\nQuantitat de nombres parells: " + nParells + "\nMitjana nombres senars: " + mitjanaSenars);
        
    }
    
}