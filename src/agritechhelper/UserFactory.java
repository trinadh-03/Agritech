/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
class UserFactory {
 public static User createUser(String userType, String name, String email) {
 if (userType.equalsIgnoreCase("Farmer")) {
 return new Farmers(name, email);
 } else if (userType.equalsIgnoreCase("TractorOwner")) {
 return new TractorOwners(name, email);
 }
 return null;
 }
}
