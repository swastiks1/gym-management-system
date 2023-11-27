package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///bank_database","admin","admin");
            s =c.createStatement();
//            ResultSet m = s.executeQuery("select * from bank");
//            while (m.next()) {
//                System.out.println(m.getString(1) + m.getString(2));
//            }
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }

//    public static void main(String[] args) {
//        Conn x = new Conn();
//    }
}  
