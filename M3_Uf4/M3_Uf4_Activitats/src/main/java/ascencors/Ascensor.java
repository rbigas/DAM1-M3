package ascencors;

/**
 *
 * @author rocbigas
 */
public class Ascensor {

    //Constant Ascensor 
    final int EN_ESPERA = 0;
    final int EN_MOVIMENT = 1;

    //Constant Portes
    final int OBERTES = 1;
    final int TANCADES = 0;

    int planta = 0;
    int estatAscensor = EN_ESPERA;
    int estatPortes = TANCADES;

    void obrirPortes() {
        if (estatAscensor != EN_MOVIMENT) {
            System.out.printf("Obrim les portes a la planta: %d\n", planta);
            estatPortes = OBERTES;
        }
    }

    void tancarPortes() {
        if (estatAscensor != EN_MOVIMENT) {
            System.out.printf("Tanquem les portes a la planta: %d\n", planta);
            estatPortes = TANCADES;
        }
    }
    
    void movimentPersones() {
        System.out.println("Moviment de persones");
    }
    
    void ascensorEnMoviment() {
        estatAscensor = EN_MOVIMENT;
        System.out.println("Ascensor en moviment...");
    }
    
    void ascensorEnEspera() {
        estatAscensor = EN_ESPERA;
        System.out.println("Ascensor en espera...");
    }
    
    void vesAPlanta(int destinacio) {
        if (destinacio == planta) {
            obrirPortes();
            movimentPersones();
            tancarPortes();
        } else {
            System.out.printf("Anem a la planta %d des de la planta %d\n", destinacio, planta);
            ascensorEnMoviment();
            planta = destinacio;
            estatAscensor();
            ascensorEnEspera();
            obrirPortes();
            movimentPersones();
            tancarPortes();
            estatAscensor();
        }
    }

    void crida(int destinacio) {
        //destinacio igual a planta 
        //obrir portes
        //entran de gent
        //tancar portes

        //destinacio no igual planta
        //anem planta
        //obrim portes
        //moviment de persones
        //tanca portes
    }

    public void estatAscensor() {
        System.out.println("\nEstat de l'ascensor:");
        System.out.format("Planta: %d\n", planta);
        if (estatPortes == OBERTES) {
            System.out.println("Portes: Obertes");
        } else {
            System.out.println("Portes: Tancades");
        }
        if (estatAscensor == EN_MOVIMENT) {
            System.out.println("Ascensor: En moviment\n\n");
        } else {
            System.out.println("Ascensor: En espera\n\n");
        }

    }

    public static void main(String[] args) {
        Ascensor InsBalmes = new Ascensor();
        Ascensor InsTic = new Ascensor();
        InsBalmes.planta = 4;
    }
}
