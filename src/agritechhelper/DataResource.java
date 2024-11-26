/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to cha nge this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agritechhelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DataResource {
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/AgriTech";
    String uname="root";
    String password="";
    public boolean verifyFarmer(String email,String pass)
    {
        String query="select * from farmers where email=? and password=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, email);
            st.setString(2,pass);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return true;
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        
        return false;
    }
    //Creatin new farmer user account
    public boolean createFarmer(Farmer f)
    {
        
        String query="insert into farmers(name,email,password,location,phone_number) values(?,?,?,?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, f.getName());
            st.setString(2,f.getEmail());
            st.setString(3,f.getPassword());
            st.setString(4,f.getLocation());
            st.setString(5, f.getPhoneNumber());
            st.executeUpdate();
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }      
    }
    public String getName(String email)
    {
        String query="select name from farmers where email=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, email);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getString(1);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        return null;
    }
    public List<Tractor> getTractorDetails(String location) {
        List<Tractor> tractorList = new ArrayList<>();
        String query = "select tractor_name,owner_id,equipment_list from tractors where location=?";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, location);
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
                Tractor t=new Tractor();
                t.setTractorName(rs.getString("tractor_name"));
                t.setOwnerId(rs.getInt("owner_id"));
                t.setEquipmentList(rs.getString("equipment_list"));
                tractorList.add(t);
            }
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        return tractorList;
    }

    public boolean listLand(LandRent lr) {
       String query="insert into LandRent(farmer_name,location,water_availability,land_area,rent_period,rent_price,farmer_id) values(?,?,?,?,?,?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, lr.getFarmerName());
            st.setString(2,lr.getLocation());
            st.setString(3,lr.getWaterAvailability());
            st.setInt(4,lr.getLandArea());
            st.setInt(5,lr.getRentPeriod());
            st.setInt(6,lr.getRentPrice());
            st.setInt(7, lr.getFarmerId());
            st.executeUpdate();
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return false;
    }

    String getLocation(String name) {
       String query="select location from farmers where name=?";
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, name);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getString(1);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return "not found";
    }
    public boolean createTractorOwner(TractorOwner f)
    {
        
        String query="insert into TractorOwner(name,email,password,location,phone_number) values(?,?,?,?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, f.getName());
            st.setString(2,f.getEmail());
            st.setString(3,f.getPassword());
            st.setString(4,f.getLocation());
            st.setString(5, f.getPhone());
            st.executeUpdate();
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }      
    }
    public boolean verifyTractorOwner(String email,String pass)
    {
        String query="select * from TractorOwner where email=? and password=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, email);
            st.setString(2,pass);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return true;
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        
        return false;
    }

    public String getOwnerName(String email) {
        String query="select name from TractorOwner where email=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, email);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getString(1);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        return null;
    }

    public Tractor getTractorOwner(int id) {
        String query="select tractor_name,equipment_list from tractors where owner_id=?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                Tractor tr=new Tractor();
                tr.setTractorName(rs.getString("tractor_name"));
                tr.setEquipmentList(rs.getString("equipment_list"));
                return tr;
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
        return null;
    }

    public Slots getSlots(int id, java.sql.Date date) {
        String query="select slot1,slot2,slot3,slot3,slot4,slot5,slot6,slot7,slot8,slot9 from slots where tractor_id=? and date=?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, id);
            st.setDate(2, date);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                Slots s=new Slots();
                s.setSlot1(rs.getBoolean("slot1"));
                s.setSlot2(rs.getBoolean("slot2"));
                s.setSlot3(rs.getBoolean("slot3"));
                s.setSlot4(rs.getBoolean("slot4"));
                s.setSlot5(rs.getBoolean("slot5"));
                s.setSlot6(rs.getBoolean("slot6"));
                s.setSlot7(rs.getBoolean("slot7"));
                s.setSlot8(rs.getBoolean("slot8"));
                s.setSlot9(rs.getBoolean("slot9"));
                return s;
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
        return null;
    }

    int getTractorId(String tractorName) {
        String query="select tractor_id from tractors where tractor_name=?";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, tractorName);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getInt("tractor_id");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return -1;
        }
        return -1;
       
    }

    public boolean BookSlots(String slots,int id,Date date) {
        String[] slot=slots.split(",");
        StringBuilder sqlQuery = new StringBuilder("UPDATE slots SET ");
        
        // Add each slot to the query and set its value to true
        for (int i = 0; i < slot.length; i++) {
            sqlQuery.append(slot[i]).append(" = true");
            if (i < slot.length - 1) {
                sqlQuery.append(", ");  // Add a comma between columns
            }
        }
        sqlQuery.append(" WHERE tractor_id = ? AND date = ?");
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(sqlQuery.toString());
            st.setInt(1, id);
            st.setDate(2, date);
            int results=st.executeUpdate();
            return results>0;
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return false;
        }

    }

    public int getFarmerId(String name) {
        String query="select farmer_id from farmers where name=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, name);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getInt(1);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        return -1;
    }

    public boolean booking(String slots, int Tid, int FId, Date date) {
        String query="insert into farmer_booking(farmer_id,tractor_owner_id,slots,booking_date) values(?,?,?,?)";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, FId);
            st.setInt(2, Tid);
            st.setString(3, slots);
            st.setDate(4, date);
            int result=st.executeUpdate();
            return result>0;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return false;
        }
    }

    public int getTractorOwnerId(String name) {
        String query="select owner_id from tractorowner where name=?";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, name);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getInt("owner_id");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return -1;
        }
        return -1;
    }

    public List<FarmerBooking> getBookings(int id,Date date) {
        String query="select fb.booking_id,f.name,f.location,fb.slots from farmer_booking fb,farmers f where fb.farmer_id=f.farmer_id and fb.tractor_owner_id=? and fb.booking_date=?";
        List<FarmerBooking> bookings = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, id);
            st.setDate(2, date);
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
                FarmerBooking fb=new FarmerBooking();
                fb.setBooking_id(rs.getInt("booking_id"));
                fb.setFarmer_name(rs.getString("name"));
                fb.setLocation(rs.getString("location"));
                fb.setSlots(rs.getString("slots"));
                bookings.add(fb);
            }
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        return bookings;
    }
    String getOwnerLocation(String name) {
       String query="select location from tractorowner where name=?";
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, name);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getString(1);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        return "not found";
    }

    public int getOwnerId(String name) {
        String query="select owner_id from tractorowner where name=?";
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, name);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getInt(1);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            return -1;
        }
        return -1;
    }

    public boolean createTractor(Tractor tractor) {
        String query="insert into tractors(owner_id,tractor_name,equipment_list,location) values(?,?,?,?)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, tractor.getOwnerId());
            st.setString(2,tractor.getTractorName());
            st.setString(3,tractor.getEquipmentList());
            st.setString(4,tractor.getLocation());
            st.executeUpdate();
            return true;
            
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }

    }

    public boolean checkTractor(int id) {
        String query="select * from tractors where owner_id=?";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            return rs.next();
            
        }
        catch(Exception e)
        {
            return false;
        }
    }
    public List<LandRent> getBookings() {
        String query="select lr.id,lr.farmer_name,lr.water_availability,lr.land_area,lr.rent_period,lr.rent_price from landrent lr ,landstatus ls where lr.farmer_id=ls.farmer_id and availability='Yes';";
        List<LandRent> rentlands = new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            ResultSet rs=st.executeQuery();
            while (rs.next()) {
                LandRent lr=new LandRent();
                lr.setFarmerName(rs.getString("farmer_name"));
                lr.setWaterAvailability(rs.getString("water_availability"));
                lr.setLandArea(rs.getInt("land_area"));
                lr.setRentPeriod(rs.getInt("rent_period"));
                lr.setRentPrice(rs.getInt("rent_price"));
                rentlands.add(lr);
            }
        } catch (ClassNotFoundException | SQLException e) {
            return null;
        }
        return rentlands;
    }

    public String getFarmerPhone(String name) {
        String query="select phone_number from farmers where name=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,uname,password);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1, name);
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                return rs.getString("phone_number");
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            return "sqlException";
        }
        return null;
    }
}
