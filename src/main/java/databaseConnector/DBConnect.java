package databaseConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    private static Connection connection;

    public static Connection getConnection() {
        String  connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=otobusTerminali;user=SA;password=reallyStrongPwd123;encrypt=true;trustServerCertificate=true";
        try {
            connection = DriverManager.getConnection(connectionURL);
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException e) {
            System.out.println("Başarısız.");
            e.printStackTrace();
        }
        return connection;
    }
}
