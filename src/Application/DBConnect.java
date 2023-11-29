package Application;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnect {
    public static Connection connect() {
        Properties prop = new Properties();
        String fileName = "app.config";
        try {
            prop.load(new FileInputStream(fileName));
            String database_name = prop.getProperty("app.database_name");
            String user = prop.getProperty("app.user");
            String password = prop.getProperty("app.password");
            System.out.println("Database Name: " + database_name + "\n" + "User: " + user + "\n" + "Password: " + password);
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database_name, user, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}