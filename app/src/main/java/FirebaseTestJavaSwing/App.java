/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirebaseTestJavaSwing;

import java.util.prefs.Preferences;

public class App {

    public static void main(String[] args) {
        if (Utilitis.getLogin()) {
            if (Utilitis.getUserType().equals("admin")) {
                new AdminFrame().show();
            } else {
                new HomeFrame().show();
            }
        } else {
            new LoginFrame().show();
        }
    }

}
