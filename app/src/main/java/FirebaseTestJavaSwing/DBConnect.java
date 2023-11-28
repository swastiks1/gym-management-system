/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirebaseTestJavaSwing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author shahi
 */
public class DBConnect {

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_swing_db", "admin", "admin");
            System.out.println("Connection done");
            return conn;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
