package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnect {
    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system", "admin", "admin");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}

//    Properties prop = new Properties();
//    String fileName = "app.config";
//            try {
//                    prop.load(new FileInputStream(fileName));
//                    } catch (Exception e) {
//                    e.printStackTrace();
//                    }
//                    System.out.println(prop.getProperty("app.user"));
//                    System.out.println(prop.getProperty("app.password"));
//                    DBConnect con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system","admin","admin");
//                    System.out.println(con);
//                    System.out.println("All ok");