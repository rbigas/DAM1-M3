package subasta;

/**
 *
 * @author rocbigas
 */
public class Article {

    private int any;
    private String estat;
    private int preu;

    public Article(int any, String estat, int preu) {
        this.any = any;
        switch (estat.toLowerCase()) {
            case "perfecte":
                this.estat = estat;
                break;
            case "normal":
                this.estat = estat;
                break;
            case "regular":
                this.estat = estat;
                break;
            default:
                System.out.println("Estat no vàlid.");
        }
        this.preu = preu;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    @Override
    public String toString() {
        String info = String.format("Paràmetres de l'article:\n  Any: %d\n  Estat: %s\n  Preu: %d", any, estat, preu);
        return info;
    }

}
