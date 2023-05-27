package rocbigas.a8;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author rocbigas
 */
public class Bot {

    public void ferLikesRandom(LikesUsuari u, int nLikes, int codiMin, int codiMax) {
        int likesReals = 0;
        while (likesReals < nLikes) {
            int idRandom = ThreadLocalRandom.current().nextInt(codiMin, codiMax + 1);
            if (!u.getLikes().contains(idRandom)) {
                u.ferLike(idRandom);
                likesReals++;
            }
        }
    }
}
