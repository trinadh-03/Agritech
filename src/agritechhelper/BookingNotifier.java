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
class BookingNotifier {
 private List<BookingObserver> observers = new ArrayList<>();
 public void addObserver(BookingObserver observer) {
 observers.add(observer);
 }
 public void notifyObservers(String message) {
 for (BookingObserver observer : observers) {
 observer.update(message);
 }
 }
}   
