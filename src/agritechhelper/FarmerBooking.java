/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
public class FarmerBooking {
    private int booking_id;
    private String farmer_name;
    private String location;
    private String slots;

    // Getters
    public int getBooking_id() {
        return booking_id;
    }

    public String getFarmer_name() {
        return farmer_name;
    }

    public String getLocation() {
        return location;
    }

    public String getSlots() {
        return slots;
    }

    // Setters
    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public void setFarmer_name(String farmer_name) {
        this.farmer_name = farmer_name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSlots(String slots) {
        this.slots = slots;
    }
}
