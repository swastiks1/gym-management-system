/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirebaseTestJavaSwing;

/**
 *
 * @author shahi
 */
public class Ambulance {

    private int id;
    private String name;
    private String phone;
    private int added_user_id;
    private String created_at;

    public Ambulance() {

    }

    public Ambulance(int id, String name, String phone, int addedUserId, String createdAt) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.added_user_id = addedUserId;
        this.created_at = createdAt;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAddedUserId() {
        return this.added_user_id;
    }

    public void setAddedUserId(int addedUserId) {
        this.added_user_id = addedUserId;
    }

    public String getCreatedAt() {
        return this.created_at;
    }

    public void setCreatedAt(String createdAt) {
        this.created_at = createdAt;
    }

    @Override
    public String toString() {
        return name + " - " + phone;
    }
}
