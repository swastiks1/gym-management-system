/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirebaseTestJavaSwing;

/**
 *
 * @author shahi
 */
public class Booking {

    private int id;
    private int ambulanceId;
    private String name;
    private String phone;
    private String location;
    private int price;

    public Booking() {

    }

    public Booking(int id, int ambulanceId, String name, String phone) {
        this.id = id;
        this.ambulanceId = ambulanceId;
        this.name = name;
        this.phone = phone;
    }
    
    public Booking(int id, int ambulanceId, String name, String phone, String location, int price) {
        this.id = id;
        this.ambulanceId = ambulanceId;
        this.name = name;
        this.phone = phone;
        this.location = location;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setAmbulanceId(int ambulanceId) {
        this.ambulanceId = ambulanceId;
    }

    public int getAmbulanceId() {
        return this.ambulanceId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }
    
    private void setLocation(String location){
        this.location = location;
    }
    
    private String getLocation(){
        return this.location;
    }
    
    private void setPrice(int price){
        this.price = price;
    }
    
    private int getPrice(){
        return this.price;
    }
    
    @Override
    public String toString() {
        return name + " - " + phone;
    }
}
