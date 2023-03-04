
package rocbigas.m3_uf2;

/**
 *
 * @author rocbigas
 */
public class A2 {
    public static void main(String[] args) {
        System.out.println(sumaDigits2a2(81344321));
    }
    public static int sumaDigits2a2(int num){
        int suma = 0;
        int mult = 1;
        while (num > 0) {            
            int cache = 0;
            for (int i = 0; i < 2; i++) {
                int r = num % 10;
                cache += r;
                num /= 10;
            }
            if (cache > 9) {
                return 0;
            } else {
                cache *= mult;
                suma += cache;
                mult *= 10;
            }
        }
        return suma;
    }
}