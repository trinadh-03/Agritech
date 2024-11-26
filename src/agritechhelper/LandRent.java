/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
public class LandRent {
    private int farmerId;
    private String farmerName;
    private String location;
    private String waterAvailability;
    private int landArea;
    private int rentPeriod;
    private int rentPrice;

    // Getters and Setters
    public void setFarmerId(int id)
    {
        this.farmerId=id;
    }
    public int getFarmerId()
    {
        return farmerId;
    }
    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWaterAvailability() {
        return waterAvailability;
    }

    public void setWaterAvailability(String waterAvailability) {
        this.waterAvailability = waterAvailability;
    }

    public int getLandArea() {
        return landArea;
    }

    public void setLandArea(int landArea) {
        this.landArea = landArea;
    }

    public int getRentPeriod() {
        return rentPeriod;
    }

    public void setRentPeriod(int rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    @Override
    public String toString() {
        return "LandRent{" +
                "farmerName='" + farmerName + '\'' +
                ", location='" + location + '\'' +
                ", waterAvailability='" + waterAvailability + '\'' +
                ", landArea='" + landArea + '\'' +
                ", rentPeriod='" + rentPeriod + '\'' +
                ", rentPrice='" + rentPrice + '\'' +
                '}';
    }
}

    