package conexiodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author roc
 */
public class Conexio {

    private static Connection conn = null;

    static {
        String url = "jdbc:mysql://root:uf2m2@localhost:3306/bduoc";
        String user = "root";
        String pass = "uf2m2";

        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
