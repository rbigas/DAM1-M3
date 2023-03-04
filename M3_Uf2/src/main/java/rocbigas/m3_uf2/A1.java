
package rocbigas.m3_uf2;

/**
 *
 * @author rocbigas
 */

public class A1 {
    public static void main(String[] args) {
        System.out.println(arrodoneix(2.4));
    }
    
    static int arrodoneix(double x) {
        int resultat = (int) Math.round(x);
        return resultat;
    }
    
    public static boolean totesLesVocals(String s) {
       boolean countA = false;
       boolean countE = false;
       boolean countI = false;
       boolean countO = false;
       boolean countU = false;
       int llargada = s.length();
       for (int i = 0; i < llargada; i++) {
           char lletra = s.charAt(i);
           if (lletra == 'a' || lletra == 'A') {
               countA = true;
           }
           if (lletra == 'e' || lletra == 'E') {
               countE = true;
           }
           if (lletra == 'i' || lletra == 'I') {
               countI = true;
           }
           if (lletra == 'o' || lletra == 'O') {
               countO = true;
           }
           if (lletra == 'u' || lletra == 'U') {
               countU = true;
           }
       }
       return (countA && countE && countI && countO && countU);
    }
    
    static int quantesVocals(String s) {
        int count = 0;
        int llargada = s.length();
        for (int i = 0; i < llargada; i++) {
            char lletra = s.charAt(i);
            if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u' || lletra == 'A' || lletra == 'E' || lletra == 'I' || lletra == 'O' || lletra == 'U') {
                count++;
            }
        }
        return count;
     }
    
    public static int quantesLletres(String s, char c) {
        int count = 0;
        int llargada = s.length();
        for (int i = 0; i < llargada; i++) {
            char lletra = s.charAt(i);
            if (lletra == c) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean contéLletra(String s, char c) {
        int i = 0;
        int fin = s.length();
        boolean trobat = false;
        while (!trobat && i < fin) {
            char lletra = s.charAt(i);
            trobat = lletra == c;
            if (!trobat) {
                i++;
            }
        }
        return trobat;
    }
    
    public static int quantesAs(String s) {
        int count = 0;
        int llargada = s.length();
        for (int i = 0; i < llargada; i++) {
            char lletra = s.charAt(i);
            if (lletra == 'a' || lletra == 'A') {
                count++;
            }
        }
        return count;
    }
    
    public static boolean conteA(String s) { //Fet amb esquema de cerca amb amor per al Pere :)
        int i = 0;
        int fin = s.length() - 1;
        char lletra = s.charAt(i);
        boolean trobat = false;
        while (!trobat && i <= fin) {
            trobat = lletra == 'a' || lletra == 'A';
            if (!trobat) {
                i++;
                lletra = s.charAt(i);
            }
        }
        return trobat;
    }
}