package app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Nathy
 */
public class conexion {
    
    public static Connection getConexion(){
        String url = "jdbc:sqlserver://localhost:1433;" 
                + "database=escuela;" 
                + "user=sa;"
                + "password:12345678;";
        
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }    
}
