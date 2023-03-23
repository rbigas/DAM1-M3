package subasta;

/**
 *
 * @author rocbigas
 */
public class Cromo extends Article {

    private String nomAlbum;
    private int num = 0;

    public Cromo(int any, String estat, int preu, String nomAlbum, int num) {
        super(any, estat, preu);
        this.nomAlbum = nomAlbum;
        this.num = num;
    }

    public String getNomAlbum() {
        return nomAlbum;
    }

    public int getNum() {
        return num;
    }

    public void setNomAlbum(String nomAlbum) {
        this.nomAlbum = nomAlbum;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        String info = String.format(
                "\nParàmetres del cromo:\n  Any: %d\n  Estat: %s\n  Preu: %d\n  Nom de l'àlbum: %s\n  Nº de cromo: %d",
                super.getAny(),
                super.getEstat(),
                super.getPreu(),
                nomAlbum,
                num
        );
        return info;
    }

}
