/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
public class TractorBookingSystem {
 private static TractorBookingSystem instance;
 // Private constructor to prevent instantiation
 private TractorBookingSystem() {
 // Method to get the only instance of the system
 }
 public static TractorBookingSystem getInstance() {
 if (instance == null) {
 instance = new TractorBookingSystem();
 }
 return instance;
 }
 // System methods for booking, showing tractors, etc.
}
