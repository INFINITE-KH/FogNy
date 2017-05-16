package com.Mapper;

import com.DB.DBConnector;
import com.Entity.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerMapper {
    
    Connection conn;
    
    public CustomerMapper(){
        this.conn = new DBConnector().getConnection();
    }
   
    
    public boolean createCustomer(Customer c) throws SQLException{
        
        try{
            String sql = "INSERT INTO customer(fname, lname, adress, cphone, mail) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, c.getFname());
            pst.setString(2, c.getLname());
            pst.setString(3, c.getAdress());
            pst.setInt(4, c.getCphone());
            pst.setString(5, c.getMail());            
            pst.executeQuery();
            
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
        
            return false;
        }
  
    }
    
     public Customer getCustomer(int id) throws SQLException{
        
         String sql = "SELECT * FROM customer WHERE id=?";
         PreparedStatement pst = conn.prepareStatement(sql);
         pst.setInt(1, id);
         ResultSet rs = pst.executeQuery();
         
         
         if(rs.next()){
             int cid = rs.getInt("id");
             String fname = rs.getString("fname");
             String lname = rs.getString("fname");
             String adress = rs.getString("adress");
             int cphone = rs.getInt("cphone");
             String mail = rs.getString("mail");
             int FK_ono = rs.getInt("FK_ono");
             Customer c = new Customer(cid, fname, lname, adress, cphone, mail, FK_ono);
             
             return c;
         }
         
         return null;
        }
     
     public ArrayList<Customer> getAllCustomer() throws SQLException{
         
         ArrayList<Customer> cu = new ArrayList<>();
         
         String sql = "SELECT * from customer";         
         PreparedStatement pst = conn.prepareStatement(sql);
         ResultSet rs = pst.executeQuery();
         
        while(rs.next()){ 
            int cid = rs.getInt("id");
            String fname = rs.getString("fname");
            String lname = rs.getString("fname");
            String adress = rs.getString("adress");
            int cphone = rs.getInt("cphone");
            String mail = rs.getString("mail");
            int FK_ono = rs.getInt("FK_ono");
            
            Customer c = new Customer(cid, fname, lname, adress, cphone, mail, FK_ono);
            cu.add(c);
        
        }  
         return cu;
     }
}
