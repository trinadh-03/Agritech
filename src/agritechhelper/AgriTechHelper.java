/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agritechhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import agritechhelper.LoginPage.UserSession;
/**
 *
 * @author mekal
 */

public class AgriTechHelper {
    public static String Usname;
    public AgriTechHelper(UserSession us)
    {
        this.Usname=us.toString();
    }
    
    public static void main(String[] args) {
       
          System.out.println(Usname);
           
    }
     
    
}
