package com.Mapper;

import com.DB.DBConnector;
import com.Entity.Orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrdersMapper {
    
    Connection conn;
    
    public OrdersMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    public void createOrders(Orders od) throws SQLException{
        
        try{
            String sql = "INSERT INTO orders(checkout_time, delivery_time, shipping_price, orderline_id) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, od.getCheckout());
            pst.setDate(2, od.getDeliviry());
            pst.setDouble(3, od.getShipping());
            pst.setInt(4, od.getOrderline_id());
            
        } catch(SQLException ex){
            ex.printStackTrace();
        }   
    }
}
