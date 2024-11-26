/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;

/**
 *
 * @author mekal
 */
public class availableTractors {
    DataResource dr=new DataResource();
    public void displayTractors(JTable table,String location)
    {
        List<Tractor> tractors;
        tractors=dr.getTractorDetails(location);
        for(Tractor tractor:tractors)
        {
            
            String tname=tractor.getTractorName();
            String owner=""+tractor.getOwnerId();
            String equipment=tractor.getEquipmentList();
            String[] tableDate={tname,owner,equipment};
            DefaultTableModel tbmodel=(DefaultTableModel)table.getModel();
            tbmodel.addRow(tableDate);
            
            
        }
        
    }
    public void displayOrders(JTable table,int id,Date date)
    {
        List<FarmerBooking> bookings;
        bookings=dr.getBookings(id,date);
        for(FarmerBooking books:bookings)
        {
            String bookId=""+books.getBooking_id();
            String fname=books.getFarmer_name();
            String location=books.getLocation();
            String slot=books.getSlots();
            String[] tableData={bookId,fname,location,slot};
            DefaultTableModel tbmodel=(DefaultTableModel)table.getModel();
            tbmodel.addRow(tableData);
            
        }
        
    }
    public void displayLands(JTable table)
    {
        List<LandRent> rents;
        rents=dr.getBookings();
        for(LandRent lrs:rents)
        {
            String fname=lrs.getFarmerName();
            String water=lrs.getWaterAvailability();
            String area=""+lrs.getLandArea();
            String period=""+lrs.getRentPeriod();
            String price=""+lrs.getRentPrice();
            String location=dr.getLocation(fname);
            String[] tableData={fname,location,water,area,period,price};
            DefaultTableModel tbmodel=(DefaultTableModel)table.getModel();
            tbmodel.addRow(tableData);
                    
        }
        
    }
}
