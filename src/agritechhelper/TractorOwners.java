package agritechhelper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mekal
 */
class TractorOwners extends User {
 public TractorOwners(String name, String email) {
 this.name = name;
 this.email = email;
 }
 @Override
 public void performRole() {
 System.out.println("TractorOwner can list tractors.");
 }
}