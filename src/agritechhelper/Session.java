/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
public class Session {
    
    private static String sharedData;

    public static String getSharedData() {
        return sharedData;
    }

    public static void setSharedData(String data) {
        sharedData = data;
    }
    public static void clearSession() {
        sharedData = null;  // Clear the session data
    }
}


