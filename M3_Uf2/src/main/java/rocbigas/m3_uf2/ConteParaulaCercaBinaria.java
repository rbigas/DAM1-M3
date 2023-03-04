package rocbigas.m3_uf2;

import java.util.Arrays; //Fem servir el mètode copyOfRange

public class ConteParaulaCercaBinaria {

    public static boolean conteParaula(String[] diccionari, String paraula) { //És indispensable fer servir un vector ordenat
        int nParaules = diccionari.length; //Definim variables
        int meitat = nParaules / 2;
        if (diccionari[meitat].equals(paraula)) {//Si la a la meitat del vector es troba la paraula que busquem no cal fer res més
            return true;
        } else if (nParaules == 1) {//Si només queda una paraula al vector i no és la que busquem la paraula no es troba al vector
            return false;
        } else if (diccionari[meitat].compareTo(paraula) > 0) {
            return conteParaula(Arrays.copyOfRange(diccionari, 0, meitat), paraula); //Tornem a cridar la funció amb la primera meitat del vector
        } else {
            return conteParaula(Arrays.copyOfRange(diccionari, meitat + 1, nParaules), paraula); //Tornem a cridar la funció amb la segona meitat del vector
        }

    }

    public static void main(String[] args) {
        String[] diccionari = {"meu", "mus", "mut", "mutis", "resum", "riure", "rus", "surt", "turisme"}; //Vector ordenat
        String paraula = "pollastre"; //Paraula que volem trobar
        String resultat = conteParaula(diccionari, paraula) ? "La paraula es troba al diccionari." : "La paraula NO es troba al diccionari.";
        System.out.println(resultat); //Mostrem el resultat
    }

}
