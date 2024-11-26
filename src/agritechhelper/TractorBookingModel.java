/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mekal
 */
class TractorBookingModel {
 private List<Tractor> availableTractors = new ArrayList<>();
 public List<Tractor> getAvailableTractors() {
 // Fetch from database
 return availableTractors;
 }
 public void bookTractor(String tractorId) {
 // Booking logic
 }
}

