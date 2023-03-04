package rocbigas.m3_uf2;

public class Paraulogic {

    //1. TODO MÈTODE 1
    //Feu un mètode que donada una paraula (String) 
    //retorni cert si te longitud menor que 3, 
    //fals cas contrari
    public static boolean esMajorA3Caracters(String paraula) {
        return paraula.length() > 3;
    }

    //2. TODO MÈTODE 2
    // Feu un mètode que donat un codi escriu per pantalla
    // "Massa curta": si el codi és 1
    // "Falta la lletra del mig": si el codi és 2
    // Incorrecta: si el codi és 3
    // Té lletres no valides: si el codi es 4
    // "Molt bé!": cas contrari
    public static void esCorrecte(int codi) {
        switch (codi) {
            case 1 ->
                System.out.println("Massa curta");
            case 2 ->
                System.out.println("Falta la lletra del mig");
            case 3 ->
                System.out.println("Incorrecta");
            case 4 ->
                System.out.println("Té lletres no valides");
            default ->
                System.out.println("Molt bé!");
        }
    }

    //3. TODO MÈTODE 3
    // Feu un mètode que donat una paraula i un vector de paraules
    // retorni cert si el vector conté la paraula, fals si no la conté.
    public static boolean conteParaula(String paraula, String[] paraules) {
        boolean trobat = false;
        int i = 0;
        while (!trobat && i < paraules.length) {
            if (paraules[i].equals(paraula)) {
                trobat = true;
            } else {
                i++;
            }
        }
        return trobat;
    }

    public static void main(String[] args) {
        String[] diccionari = {"meu", "mus", "mut", "mutis", "resum", "riure", "rus", "surt", "turisme"};

        //TODO
        // crideu el MÈTODE 1 per a una paraula massa curta (mida menor a 3)
        // crideu el MÈTODE 1 per a una paraula correcta 
        System.out.println("Paraula curta: " + esMajorA3Caracters("aa"));
        System.out.println("Paraula correcta: " + esMajorA3Caracters("hola"));

        //TODO
        // crideu el METODE 2 per al missatge "Massa Curta"
        // crideu el METODE 2 per al missatge "Molt bé"
        esCorrecte(1);
        esCorrecte(5446);

        //TODO
        // crideu el METODE 3 i mostreu el resultat per a una paraula 
        // del diccionari
        // crideu el METODE 3 i mostreu el resultat per a una paraula
        // que no formi part del diccionari
        System.out.println("Paraula 'mut': " + conteParaula("mut", diccionari));
        System.out.println("Paraula 'pollastre': " + conteParaula("pollastre", diccionari));

    }
}
