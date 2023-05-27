package rocbigas.a8;

/**
 *
 * @author rocbigas
 */
public class App {

    public static void main(String[] args) {
        LikesUsuari joan = new LikesUsuari("Joan");
        LikesUsuari maria = new LikesUsuari("Maria");

        joan.ferLike(1000);
        joan.ferLike(2000);
        joan.ferLike(30000);

        maria.ferLike(1000);
        maria.ferLike(2000);
        maria.ferLike(30000);

        Bot b = new Bot();
        b.ferLikesRandom(maria, 20, 1, 30);

        System.out.println("Joan:");
        joan.mostrarLlista();
        System.out.println("Maria:");
        maria.mostrarLlista();
        System.out.println(joan.samePhotos(maria));
        System.out.println(maria.diffPhotos(joan));
    }
}
