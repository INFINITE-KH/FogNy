package com.Mapper;

import data.DBConnector;
import com.Entity.Orderline;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderlineMapper {

    Connection conn;
    DetailMapper dm = new DetailMapper();
    
    public OrderlineMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    public void createOrderline(Orderline ol) throws SQLException{
        
        try{
            String sql = "INSERT INTO orderline(wood_qty, screw_qty, roof, bracket, FK_detailid) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, ol.getWood_qty());
            pst.setInt(2, ol.getScrew_qty());
            pst.setString(3, ol.getRoof());
            pst.setInt(4, ol.getBracket());
            pst.setInt(5, dm.getDetailId(ol.getDetail().getLength(), ol.getDetail().getHeigth(), ol.getDetail().getWidth(), ol.getDetail().getRoof()));

            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    
}
