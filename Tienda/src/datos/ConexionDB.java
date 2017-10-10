package datos;

import java.sql.*;

public class ConexionDB {

    Connection con = null;
    String driverClassName = "com.mysql.jdbc.Driver";
    String driverUrl = "jdbc:mysql://localhost:3306/tienda";
    String user = "root";
    String password = "1111";

    public ConexionDB() {
        try {
           Class.forName(driverClassName);
           con = DriverManager.getConnection(driverUrl, user, password);
           
        } catch (ClassNotFoundException e) {
            System.out.println("No se encuentra el driver");
        } catch (SQLException E) {
            System.out.println("Excepcion SQL: " + E.getMessage());
            System.out.println("Estado SQL: " + E.getSQLState());
            System.out.println("Código del Error: " + E.getErrorCode());
        } catch (Exception E) {
            System.out.println("Otro problema: " + E);
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void desconectar() {
        try {
            con.close();
            con = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
