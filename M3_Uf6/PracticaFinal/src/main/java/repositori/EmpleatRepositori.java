package repositori;

import conexiodb.Conexio;
import entitats.Empleat;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roc
 */
public class EmpleatRepositori {

    static Connection con = Conexio.getConnection();

    public List<Empleat> mostrarEmpleats() { //Mostra tots els empleats
        List<Empleat> llista = new ArrayList();
        try {
            String query = String.format("SELECT * FROM Empleats");
            PreparedStatement ps = con.prepareStatement(query);
            System.out.println("Llegint dades...");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Empleat res = new Empleat();
                res.setCodiEmpl(rs.getInt("codi_empl"));
                res.setNomEmpl(rs.getString("nom_empl"));
                res.setCognomEmpl(rs.getString("cognom_empl"));
                res.setSou(rs.getFloat("sou"));
                res.setNomDpt(rs.getString("nom_dpt"));
                res.setCiutatDpt(rs.getString("ciutat_dpt"));
                res.setNomProj(rs.getInt("num_proj"));
                llista.add(res);
            }
            System.out.println("Fet!");
            ps.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return llista;
    }

    public Empleat mostrarEmpleatId(int id) {
        Empleat res = new Empleat();
        try {
            String query = String.format("SELECT * FROM Empleats WHERE codi_empl = ?");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            System.out.println("Llegint dades...");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                res.setCodiEmpl(rs.getInt("codi_empl"));
                res.setNomEmpl(rs.getString("nom_empl"));
                res.setCognomEmpl(rs.getString("cognom_empl"));
                res.setSou(rs.getFloat("sou"));
                res.setNomDpt(rs.getString("nom_dpt"));
                res.setCiutatDpt(rs.getString("ciutat_dpt"));
                res.setNomProj(rs.getInt("num_proj"));
            }
            System.out.println("Fet!");
            ps.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return res;
    }

    public Empleat mostrarEmpleatNif(String nif) {
        Empleat res = new Empleat();
        try {
            String query = String.format("SELECT * FROM Empleats WHERE nif_empl = ?");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, nif);
            System.out.println("Llegint dades...");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                res.setCodiEmpl(rs.getInt("codi_empl"));
                res.setNomEmpl(rs.getString("nom_empl"));
                res.setCognomEmpl(rs.getString("cognom_empl"));
                res.setSou(rs.getFloat("sou"));
                res.setNomDpt(rs.getString("nom_dpt"));
                res.setCiutatDpt(rs.getString("ciutat_dpt"));
                res.setNomProj(rs.getInt("num_proj"));
            }
            System.out.println("Fet!");
            ps.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return res;
    }

    public void afegirEmpleat(Empleat e) {
        try {
            System.out.println("Inserint dades...");
            String query = String.format("INSERT INTO Empleats VALUES(?, ?, ?, ?, ?, ?, ?)");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, e.getCodiEmpl());
            ps.setString(2, e.getNomEmpl());
            ps.setString(3, e.getCognomEmpl());
            ps.setFloat(4, e.getSou());
            ps.setString(5, e.getNomDpt());
            ps.setString(6, e.getCiutatDpt());
            ps.setInt(7, e.getNumProj());
            ps.executeUpdate();
            System.out.println("Fet!");
            ps.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public void eliminarEmpleat(Empleat e) {
        try {
            System.out.println("Eliminant registre...");
            String query = String.format("DELETE FROM Empleats WHERE codi_empl = ?");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, e.getCodiEmpl());
            ps.executeUpdate();
            System.out.println("Fet!");
            ps.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public void modificarEmpleat(Empleat e) {
        try {
            System.out.println("Modificant empleat...");
            String query = String.format("UPDATE Empleats SET nom_empl = ?, cognom_empl = ?, sou = ?, nom_dpt = ?, ciutat_dpt = ?, num_proj = ? WHERE codi_empl = ?");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, e.getNomEmpl());
            ps.setString(2, e.getCognomEmpl());
            ps.setFloat(3, e.getSou());
            ps.setString(4, e.getNomDpt());
            ps.setString(5, e.getCiutatDpt());
            ps.setInt(6, e.getNumProj());
            ps.setInt(7, e.getCodiEmpl());
            ps.executeUpdate();
            System.out.println("Fet!");
            ps.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

}
