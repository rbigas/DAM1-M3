package com.mycompany.m3_uf6_a1;



/**
 *
 * @author roc
 */
public class App {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://root:uf2m2@127.0.0.1:3306/bduoc";
    static final String USER = "root";
    static final String PASS = "uf2m2";

    public static void main(String[] args) {

        Empleat roc = new Empleat(104, "Roc", "Bigas", 3150, "DIR", "Barcelona", 4);

        Crud.afegirDada(roc, "Empleats");
        Crud.llegirDada("Empleats");
        Crud.modificarDada("nom_empl", "\'Daniel\'", "nom_empl", "\'Roc\'", "Empleats");
        Crud.esborrarDada(roc, "Empleats");
    }
}
