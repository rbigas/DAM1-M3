package com.mycompany.m3_uf6_a1;

import static com.mycompany.m3_uf6_a1.App.DB_URL;
import static com.mycompany.m3_uf6_a1.App.PASS;
import static com.mycompany.m3_uf6_a1.App.USER;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author roc
 */
public class Crud {

    public static void afegirDada(Empleat e, String taula) {
        Connection conn = null;
        Statement stmt = null;
        try {
            System.out.println("Connectant...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Insertant dades...");
            stmt = conn.createStatement();
            String dades = String.format("INSERT INTO %s values('%s', '%s', '%s', '%s', '%s', '%s', '%s')", taula, e.getCodiEmpl(), e.getNomEmpl(), e.getCognomEmpl(), e.getSou(), e.getNomDpt(), e.getCiutatDpt(), e.getNumProj());
            stmt.executeUpdate(dades);
            System.out.println("Fet!");

            stmt.close();
            conn.close();
            System.out.println("Tot correcte!");
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void llegirDada(String taula) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;
        try {
            System.out.println("Connectant...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Llegint dades...");
            String dades = String.format("SELECT * FROM %s", taula);
            stmt = conn.prepareStatement(dades);
            res = stmt.executeQuery();
            while (res.next()) {
                int codi_empl = res.getInt("codi_empl");
                String nom_empl = res.getString("nom_empl");
                String cognom_empl = res.getString("cognom_empl");
                float sou = res.getFloat("sou");
                String nom_dpt = res.getString("nom_dpt");
                String ciutat_dpt = res.getString("ciutat_dpt");
                int num_proj = res.getInt("num_proj");
                System.out.println(String.format("Codi: %s, Nom: %s, Cognom: %s, Sou %s, Nom dpt: %s, Ciutat dpt: %s, Num dpt: %s", codi_empl, nom_empl, cognom_empl, sou, nom_dpt, ciutat_dpt, num_proj));
            }
            System.out.println("Fet!");

            stmt.close();
            conn.close();
            System.out.println("Tot correcte!");
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void modificarDada(String nomParametre, String valorParametre, String parametreCondicio, String valorCondicio, String taula) {
        Connection conn = null;
        Statement stmt = null;
        try {
            System.out.println("Connectant...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Modificant dades...");
            stmt = conn.createStatement();
            String dades = String.format("UPDATE %s SET %s = %s WHERE %s = %s", taula, nomParametre, valorParametre, parametreCondicio, valorCondicio);
            stmt.executeUpdate(dades);
            System.out.println("Fet!");
            System.out.println("Mostrant taula modificada:");
            llegirDada(taula);
            stmt.close();
            conn.close();
            System.out.println("Tot correcte!");
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void esborrarDada(Empleat e, String taula) {
        Connection conn = null;
        Statement stmt = null;
        try {
            System.out.println("Connectant...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Esborrant dades...");
            String dades = String.format("DELETE FROM %s WHERE codi_empl = %s", taula, e.getCodiEmpl());
            stmt = conn.createStatement();
            stmt.executeUpdate(dades);
            llegirDada(taula);
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
