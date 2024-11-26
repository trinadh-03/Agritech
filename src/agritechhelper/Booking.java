/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
public class Booking {
    private static int id;
    
    public static void setId(int ids)
    {
        id=ids;
    }
    public static int getId()
    {
        return id;
    }
    public static void closeBooking()
    {
        id=-1;
    }
}
