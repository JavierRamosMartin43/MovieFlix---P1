package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
	
    Connection connection = null;
    String driverClassName = "com.mysql.oj.jdbc.Driver";
    String driverUrl = "jdbc:mysql://localhost/movieflix?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    String user = "root";
    String password = "root";

    
    public void ConexionDB() {
        try {         
            connection = DriverManager.getConnection(driverUrl, user, password);
            
        }  catch (SQLException E) {
            System.out.println("Excepcion SQL: " + E.getMessage());
            System.out.println("Estado SQL: " + E.getSQLState());
            System.out.println("Codigo del Error: " + E.getErrorCode());
        } catch (Exception E) {
            System.out.println("Otro problema: " + E);
        } 
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
            connection = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
