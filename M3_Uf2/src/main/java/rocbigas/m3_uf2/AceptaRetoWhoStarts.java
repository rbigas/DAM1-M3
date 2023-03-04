package rocbigas.m3_uf2;

import java.util.Arrays;

public class AceptaRetoWhoStarts {

    public static int[] createArray(int people, int salt) {
        int[] nPeople = new int[people];
        for (int i = 1; i <= people; i++) { //Definim valors del Array
            nPeople[i - 1] = i;
        }
        return nPeople;
    }

    public static int[] modifyArray(int[] nPeople, int people, int salt) {
        int eliminats = 0; //Recompte d'eliminats
        int posicio = 0; //Posició inicial
        int posMax = people - 1; //Posició màxima del array
        int nSalts = 0;
        while (eliminats < posMax) {
            System.out.println("posi ini = " + posicio);
            if (nSalts == salt) {
                while (nPeople[posicio] == 0) {
                    if (posicio + 1 > posMax) {
                        posicio = 0;
                    } else {
                        posicio++;
                    }
                }
                nPeople[posicio] = 0;
                eliminats++;
                nSalts = 0;
                System.out.println("Borración");
            } else {
                while (nPeople[posicio] == 0) {
                    if (posicio + 1 > posMax) {
                        posicio = 0;
                    } else {
                        posicio++;
                    }
                }
                System.out.println("posi while= " + posicio);
                if (posicio == posMax) {
                    nSalts++;
                    posicio = 0;
                } else {
                    nSalts++;
                    posicio++;
                }
            }
            System.out.println("saltos = " + nSalts);
            System.out.println("posi final = " + posicio);
            System.out.println("Array = " + Arrays.toString(nPeople));
        }
        return nPeople;
    }

    public static int getResult(int[] nPeople) {
        int i = 0;
        while (nPeople[i] == 0) {
            i++;
        }
        return nPeople[i];
    }

    public static int whoStarts(int people, int salt) {
        
        if (people == 0) {
            return 0;
        } else if (salt == 0) {
            int[] nPeople = createArray(people, salt);
            return getResult(nPeople);
        } else {
            int[] nPeople = createArray(people, salt);
            nPeople = modifyArray(nPeople, people, salt);
            return getResult(nPeople);
        } 
    }

    public static void main(String[] args) {
        System.out.println("Resposta: " + whoStarts(8, 3));
    }
}
