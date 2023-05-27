package entitats;

/**
 *
 * @author roc
 */
public class Empleat {

    private int codiEmpl;
    private String nomEmpl;
    private String cognomEmpl;
    private float sou;
    private String nomDpt;
    private String ciutatDpt;
    private int numProj;

    public Empleat() {
        
    }

    public Empleat(int codiEmpl, String nomEmpl, String cognomEmpl, float sou, String nomDpt, String ciutatDpt, int nomProj) {
        this.codiEmpl = codiEmpl;
        this.nomEmpl = nomEmpl;
        this.cognomEmpl = cognomEmpl;
        this.sou = sou;
        this.nomDpt = nomDpt;
        this.ciutatDpt = ciutatDpt;
        this.numProj = nomProj;
    }

    public int getCodiEmpl() {
        return codiEmpl;
    }

    public String getNomEmpl() {
        return nomEmpl;
    }

    public String getCognomEmpl() {
        return cognomEmpl;
    }

    public float getSou() {
        return sou;
    }

    public String getNomDpt() {
        return nomDpt;
    }

    public String getCiutatDpt() {
        return ciutatDpt;
    }

    public int getNumProj() {
        return numProj;
    }

    public void setCodiEmpl(int codiEmpl) {
        this.codiEmpl = codiEmpl;
    }

    public void setNomEmpl(String nomEmpl) {
        this.nomEmpl = nomEmpl;
    }

    public void setCognomEmpl(String cognomEmpl) {
        this.cognomEmpl = cognomEmpl;
    }

    public void setSou(float sou) {
        this.sou = sou;
    }

    public void setNomDpt(String nomDpt) {
        this.nomDpt = nomDpt;
    }

    public void setCiutatDpt(String ciutatDpt) {
        this.ciutatDpt = ciutatDpt;
    }

    public void setNomProj(int nomProj) {
        this.numProj = nomProj;
    }

    @Override
    public String toString() {
        return "Empleat{" + "codiEmpl=" + codiEmpl + ", nomEmpl=" + nomEmpl + ", cognomEmpl=" + cognomEmpl + ", sou=" + sou + ", nomDpt=" + nomDpt + ", ciutatDpt=" + ciutatDpt + ", numProj=" + numProj + '}';
    }

}
