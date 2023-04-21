package subasta;

/**
 *
 * @author rocbigas
 */
public class App {

    public static void main(String[] args) {
        Article[] coleccio = new Article[5];
        coleccio[0] = new Segell(1890, "normal", 3650, "Un segell molt bonic.");
        coleccio[1] = new Cromo(1980, "perfecte", 1500, "El meu primer àlbum", 25);
        coleccio[2] = new Cromo(1990, "regular", 1000, "MLB 1990 League", 50);
        coleccio[3] = new Disc(1980, "perfecte", 1500, "Queen", "A Night at the Opera");
        coleccio[4] = new Disc(2021, "normal", 350, "Joji", "Nectar");
        Segell s = new Segell(1890, "normal", 3650, "Un segell molt bonic.");
        for (int i = 0; i < 5; i++) {
            System.out.println(coleccio[i].toString());
        }
    }
}
