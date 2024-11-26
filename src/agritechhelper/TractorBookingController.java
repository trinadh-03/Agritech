/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

import java.util.List;

/**
 *
 * @author mekal
 */
class TractorBookingController {
 private TractorBookingModel model;
 private TractorBookingView view;
 public TractorBookingController(TractorBookingModel model, TractorBookingView view) {
 this.model = model;
 this.view = view;
 }
 public void displayAvailableTractors() {
 List<Tractor> tractors = model.getAvailableTractors();
 view.showTractors(tractors);
 }
 public void bookTractor(String tractorId) {
 model.bookTractor(tractorId);
 view.showBookingConfirmation();
 }
}
