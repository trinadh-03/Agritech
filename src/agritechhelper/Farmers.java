/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
class Farmers extends User {
 public Farmers(String name, String email) {
 this.name = name;
 this.email = email;
 }
 @Override
 public void performRole() {
 System.out.println("Farmer can book tractors.");
 }
}