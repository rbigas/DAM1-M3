package rocbigas.m3_uf2;

/**
 *
 * @author pereg
 */
public class XifremClasse {

    /**
     * @Author Pere Guitart
     * Donada una lletra i una cadena, determina la posició
     * de la lletra a la cadena. Si la lletra no hi es retorna -1.
     * @param lletra
     * @param alfabet
     * @return la posició que ocupa la lletra a l'alfabet, -1 si no hi és.
     */
    public static int indexLletra(char lletra, char[] alfabet) {
        int index = 0;
        boolean trobat = false;
        int longitud = alfabet.length;
        while (index < longitud && !trobat) {
            trobat = alfabet[index] == lletra;
            if (!trobat) {
                index++;
            }
        }
        if (trobat) {
            return index;
        }
        return -1;
    }

    /**
     * Xifra el caràcter pel mètode Cesar si es troba a l'alfabet. Cesar: agafa
     * el caràcter que ocupa codi posicions més enllà de l'alfabet (després de
     * la darrera lletra ve la primera). Exemple: Cesar "abcdefgh...z" amb codi
     * 5 encripta 'a' per 'f', 'b' per 'g' ... 'z' per 'e' Cas contrari, retorna
     * el caràcter sense xifrar.
     *
     * @param caracter
     * @param alfabet
     * @param codi
     * @return
     */
    public static char encripta(char caracter, char[] alfabet, int codi) {
        if (indexLletra(caracter, alfabet) == -1) {
            return caracter;
        } else {
            int index = (indexLletra(caracter, alfabet) + codi);
            if (index > alfabet.length - 1) {
                index %= alfabet.length - 1;
                index -= 1;
            }
            if (index < 0) {
                index += alfabet.length;
            }
            return alfabet[index];
        }
    }

    /**
     * Desxifra el caràcter codificat per mètode Cesar. Desxifrar equival a
     * xifrar canviant el signe del codi. DON'T REPEAT YOURSELF: per desxifrar
     * crideu xifrar
     *
     * @param caracter
     * @param alfabet
     * @param codi
     * @return
     */
    public static char desencripta(char caracter, char[] alfabet, int codi) {
        return encripta(caracter, alfabet, codi * -1);
    }

    /**
     *
     * Encripta la cadena amb el mètode Cesar, fent servir l'alfabet i el codi.
     *
     * @param cadena
     * @param alfabet
     * @param codi
     * @return la paraula encriptada
     */
    public static String encriptaParaula(String cadena, char[] alfabet, int codi) {
        String result = "";
        for (int i = 0; i < cadena.length(); i++) {
            result += encripta(cadena.charAt(i), alfabet, codi);
        }
        return result;
    }

    /**
     *
     * @param paraula
     * @param alfabet
     * @param codi
     * @return
     */
    public static String desencriptaParaula(String paraula, char[] alfabet, int codi) {
        return encriptaParaula(paraula, alfabet, codi * -1);
    }

    /**
     * Obté un valor aleatori entre min i max (inclosos)
     *
     * @param min
     * @param max
     * @return valor a l'atzar entre min i max
     */
    //TODO 1. Capçalera del mètode random (retorna un int)
    public static int nRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {

        char[] alfabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        //TODO 1. Capçalera del mètode random  
        //Crides al mètode random (aquí)
        System.out.println("Número random: " + nRandom(1, 10));

        //TODO 2. Comproveu que el mètode indexLletra funciona (feu dues crides)
        System.out.println("Índex lletra c: " + indexLletra('c', alfabet));
        System.out.println("Índex lletra z: " + indexLletra('z', alfabet));

        //TODO 3. Implementeu el mètode encripta 
        System.out.println("Lletra z encriptada amb codi 1: " + encripta('z', alfabet, 1));
        System.out.println("Lletra z encriptada amb codi 3: " + encripta('z', alfabet, 3));
        System.out.println("Lletra y encriptada amb codi 5: " + encripta('y', alfabet, 5));

        //TODO 4. Implementeu el mètode desencripta 
        System.out.println("Lletra a desncriptada amb codi 1: " + desencripta('a', alfabet, 1));
        System.out.println("Lletra c encriptada amb codi 3: " + desencripta('c', alfabet, 3));
        System.out.println("Lletra d encriptada amb codi 5: " + desencripta('d', alfabet, 5));

        //TODO 5. Implementeu el mètode encriptaParaula
        System.out.println("Paraula pere encriptada: " + encriptaParaula("pere", alfabet, 5));

        //TODO 6. Aquí Encripteu i mostreu la paraula "bon examen
        String paraulaEncriptada = encriptaParaula("bon examen", alfabet, 5);
        System.out.println("Paraula bon examen encriptada: " + paraulaEncriptada);
        
        //TODO 7. Aquí. Desencripteu la paraula encriptada "bon examen" a veure si
        //dona bon examen
        System.out.println("Paraula gts jcfrjs desencriptada: " + desencriptaParaula(paraulaEncriptada, alfabet, 5));

    }

}
