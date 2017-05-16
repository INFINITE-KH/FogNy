package com.Mapper;

import com.Entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductMapper {
    
    Connection conn;
    
    public void createProduct(Product p) throws SQLException{
        
        try{
            String sql = "INSERT INTO product(id, name, measure, price) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, p.getId());
            pst.setString(2, p.getName());
            pst.setDouble(3, p.getMeasure());
            pst.setDouble(4, 0);
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Product> getAllProduct() throws SQLException{
        
        ArrayList<Product> p = new ArrayList();
        
        String sql = "SELECT * FROM product";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            int pid = rs.getInt("id");
            String name = rs.getString("name");
            double measure = rs.getInt("measure");
            
            Product pd = new Product(pid, name, measure);
            p.add(pd);
        }
         return p;
    }
}
