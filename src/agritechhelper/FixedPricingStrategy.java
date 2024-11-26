/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

/**
 *
 * @author mekal
 */
class FixedPricingStrategy implements PricingStrategy {
 @Override
 public double calculatePrice(double basePrice) {
 return basePrice + 50;
 }
}
