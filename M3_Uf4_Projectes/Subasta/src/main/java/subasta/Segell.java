package subasta;

/**
 *
 * @author rocbigas
 */
public class Segell extends Article {

    private String descripcio;

    public Segell(int any, String estat, int preu, String descripcio) {
        super(any, estat, preu);
        this.descripcio = descripcio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        String info = String.format(
                "\nParàmetres del segell:\n  Any: %d\n  Estat: %s\n  Preu: %d\n  Descripció: %s",
                super.getAny(),
                super.getEstat(),
                super.getPreu(),
                descripcio
        );
        return info;
    }

}
