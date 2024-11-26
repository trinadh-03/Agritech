/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
class TractorOwnerObserver implements BookingObserver {
 private String ownerName;
 public TractorOwnerObserver(String name) {
 this.ownerName = name;
 }
 @Override
 public void update(String message) {
 System.out.println("Notification to " + ownerName + ": " + message);
 }
}