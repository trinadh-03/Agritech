/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
class Bookings {
 private PricingStrategy pricingStrategy;
 private double basePrice;
 public Bookings(PricingStrategy pricingStrategy, double basePrice) {
 this.pricingStrategy = pricingStrategy;
 this.basePrice = basePrice;
 }
 public double calculateTotalPrice() {
 return pricingStrategy.calculatePrice(basePrice);
 }
}
