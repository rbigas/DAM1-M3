package rocbigas.m3_uf2;

public class solution {

    static java.util.Scanner in;

    public static void casoDePrueba(int people, int salt) {

        //Descartem els casos límit
        if (people == 0) {
            System.out.println(0);
        } else if (salt == 0) {
            System.out.println(people);
        } else { //Iniciem el codi principal

            //Definim les variables necessàries
            int eliminats = 0; //Recompte d'eliminats
            int posicio = 0; //Posició inicial
            int posMax = people - 1; //Posició màxima del array
            int nSalts = 0; //Número de salts realitzats

            //Definim valors del array
            int[] nPeople = new int[people];
            for (int i = 1; i <= people; i++) {
                nPeople[i - 1] = i;
            }

            //Modifiquem l'array per tal de que només quedi un número != 0
            while (eliminats < posMax) {
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
                } else {
                    while (nPeople[posicio] == 0) {
                        if (posicio + 1 > posMax) {
                            posicio = 0;
                        } else {
                            posicio++;
                        }
                    }
                    if (posicio == posMax) {
                        nSalts++;
                        posicio = 0;
                    } else {
                        nSalts++;
                        posicio++;
                    }
                }
            }

            //Llegim l'array modificat i obtenim el número corresponent
            int i = 0;
            while (nPeople[i] == 0) {
                i++;
            }
            System.out.println(nPeople[i]);
        }
    }

    public static void main(String args[]) {
        in = new java.util.Scanner(System.in);
        int people;
        int salt;
        boolean fin = true;
        while (fin) {
            people = in.nextInt();
            salt = in.nextInt();
            if(!(people == 0 && salt == 0)){
                casoDePrueba(people,salt);
            } else {
                fin = false;
            }
        }
    }
}
