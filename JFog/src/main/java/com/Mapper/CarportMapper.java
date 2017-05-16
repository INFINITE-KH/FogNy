package com.Mapper;

import data.DBConnector;
import com.Entity.Carport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarportMapper {
    
    Connection conn;
    
    public CarportMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    public Carport getCarport(int id) throws SQLException{
    
        try{  
        String sql = "SELECT * FROM carport WHERE id= ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        
        if(rs.next()){
            int cpid = rs.getInt("id");
            String carname = rs.getString("carname");
            String measure = rs.getString("measure");
            double price = rs.getDouble("price");
            
            Carport cp = new Carport(cpid, carname, measure, price);
            return cp;
        }
        
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    
    public List<Carport> getAllCarport() throws SQLException{
        CarportPartMapper cpm = new CarportPartMapper();
        ArrayList<Carport> ac = new ArrayList<>();
        
        String sql = "SELECT * FROM carport";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        int index = 1;
        while(rs.next()){
            int cpid = rs.getInt("cpid");
            String carname = rs.getString("carname");
            String measure = rs.getString("measure");
            double price = rs.getDouble("price");
            Carport cp = new Carport(cpid, carname, measure, price);
            cp.setPartsList(cpm.getCarportParts(index));
            ac.add(cp);
            index++;
        }
        return ac;
    }
}
