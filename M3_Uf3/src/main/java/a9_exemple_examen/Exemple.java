package a9_exemple_examen;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.exit;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PROF
 */
public class Exemple {
    
    public final static int MAX_NUMBER = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length!=2){
            ajuda();
            System.out.println("Args length: " + args.length);
            exit(0);
        }
        int nNombres = 0;
        
        try { 
           nNombres = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
            ajuda();
            exit(0);
        }
        String nomFitxer = args[1];
        
        try {
            generarRandom(nNombres, nomFitxer);
        } catch (FileNotFoundException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            ajuda();
            exit(0);
        } 
        
    }

    private static void ajuda() {
        System.out.println("NomPrograma nombreNumeros nomFitxer");
        System.out.println("OrdenaAtzar 3 sortida1.txt");
    }

    public static void generarRandom(int nNombres, String nomFitxer) throws FileNotFoundException {
        if (nNombres<1){
            throw new IllegalArgumentException("Nombre de numeros incorrecte");
        }
        PrintWriter ps = new PrintWriter(nomFitxer);
        int[] nums = new int[nNombres];
        
        for(int i=0; i< nNombres; i++){
            nums[i] = (int) (Math.random() * MAX_NUMBER + 1);
        }
        
        Arrays.sort(nums);
        for(int i=0; i<nNombres; i++){
            ps.format("%d\n", nums[i]);
        }
        ps.close();
        
    }


    
}


