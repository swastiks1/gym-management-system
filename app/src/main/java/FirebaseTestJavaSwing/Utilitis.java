/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FirebaseTestJavaSwing;

import java.util.prefs.Preferences;

/**
 *
 * @author shahi
 */
public class Utilitis {

    public static void setLogin(boolean value) {
        Preferences prefs = Preferences.userRoot().node("JavaSwingProjects");
        prefs.putBoolean("isLogin", value);
    }

    public static boolean getLogin() {
        Preferences prefs = Preferences.userRoot().node("JavaSwingProjects");
        return prefs.getBoolean("isLogin", true);
    }

    public static void setUserInfo() {
        Preferences prefs = Preferences.userRoot().node("JavaSwingProjects");
    }

    public static String getUserType() {
        Preferences prefs = Preferences.userRoot().node("JavaSwingProjects");
        return prefs.get("userType", "user");
    }

    public static void setUserType(String userType) {
        Preferences prefs = Preferences.userRoot().node("JavaSwingProjects");
        prefs.put("userType", userType);
    }

    public static void setLoginUserId(int userId) {
        Preferences prefs = Preferences.userRoot().node("JavaSwingProjects");
        prefs.putInt("userId", userId);
    }

    public static int getLoginUserId() {
        Preferences prefs = Preferences.userRoot().node("JavaSwingProjects");
        return prefs.getInt("userId", 0);
    }
}
