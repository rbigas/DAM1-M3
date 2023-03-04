
package rocbigas.m3_uf2;

/**
 *
 * @author rocbigas
 */

public class A0 {

    public static void main(String args[]){
        System.out.println(PalindormDescendent(0));
    }
    
    public static boolean esPalindrom(int num) {
        int reverse = 0;
        int compare = num;
        while (num > 0) {            
            int r = num % 10;
            reverse = reverse * 10 + r;
            num /= 10;
            }
        return reverse == compare;
    }
    
    public static boolean PalindormDescendent (int num) {
        if (esPalindrom(num) == true) { 
            return true;
        } else {
            boolean resultat = false;
            int desTotal = num;
            while (desTotal > 0) {
                int desCalcul = 0;
                while (num > 0) {
                    int cache = 0;
                    for (int i = 0; i < 2; i++) {
                        int r = num % 10;
                        cache += r;
                        num /= 10;
                    }
                    desCalcul = desCalcul * 10 + cache;
                }              
               resultat = esPalindrom(desCalcul);
                if (resultat) {
                    return resultat;
                } else {
                    if (desCalcul < 100) {
                        break;
                    }
                    desTotal = desCalcul;
                    num = desCalcul;
                }
            }
            return resultat;
        }
    }
}