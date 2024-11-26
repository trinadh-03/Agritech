/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
public class Tractor {

    private int ownerId;
    private String tractorName;
    private String equipmentList;
    private String location;

 

    // Getters
    public int getOwnerId() {
        return ownerId;
    }

    public String getTractorName() {
        return tractorName;
    }

    public String getEquipmentList() {
        return equipmentList;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setTractorName(String tractorName) {
        this.tractorName = tractorName;
    }

    public void setEquipmentList(String equipmentList) {
        this.equipmentList = equipmentList;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // toString method
    @Override
    public String toString() {
        return "Tractor{" +
                "ownerId=" + ownerId +
                ", tractorName='" + tractorName + '\'' +
                ", equipmentList='" + equipmentList + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
