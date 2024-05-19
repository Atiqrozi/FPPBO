/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasuas;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class Tugasuas {


    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) throws SQLException {
        firstpage login = new firstpage();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "");
            System.out.println("Connection established: " + conn);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Tugasuas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
