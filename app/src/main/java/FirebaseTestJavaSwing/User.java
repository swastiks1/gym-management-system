/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirebaseTestJavaSwing;

/**
 *
 * @author shahi
 */
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String user_type;
    
    public User(){
        
    }
    
    public User(int id, String name, String email, String password, String user_type){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.user_type = user_type;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getUserType(){
        return this.user_type;
    }
    
    public void setUserType(String userType){
        this.user_type = userType;
    }
}
