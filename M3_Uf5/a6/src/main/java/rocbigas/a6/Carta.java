package rocbigas.a6;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author rocbigas
 */
public class Carta implements Comparable<Carta> {

    private static int num = 0;
    private int id;
    private double valor;
    private String desc;
    private Date dataCarta;

    public Carta(double valor, String desc, Date dataCarta) {
        this.id = num + 1;
        this.valor = valor;
        this.desc = desc;
        this.dataCarta = dataCarta;
        num++;
    }

    public Integer getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public String getDesc() {
        return desc;
    }

    public Date getDataCarta() {
        return dataCarta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDataCarta(Date dataCarta) {
        this.dataCarta = dataCarta;
    }

    @Override
    public String toString() {
        return "id = " + id + "; valor = " + valor + "; desc = " + desc + "; dataCarta = " + dataCarta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.id == other.id) {
            return true;
        }
        if (Double.doubleToLongBits(this.valor) != Double.doubleToLongBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.desc, other.desc)) {
            return false;
        }
        return Objects.equals(this.dataCarta, other.dataCarta);
    }

    @Override
    public int compareTo(Carta o) {
        int res = this.getDesc().compareTo(o.getDesc());
        if ( res != 0) {
            return res;
        } else {
            return this.getDataCarta().compareTo(o.getDataCarta());
        }
    }

}
