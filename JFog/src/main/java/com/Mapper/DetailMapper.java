package com.Mapper;

import com.DB.DBConnector;
import com.Entity.Detail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DetailMapper {
    
    Connection conn;
    
    public DetailMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    public boolean createDetail(Detail d) throws SQLException{
        
        try{
            String sql = "INSERT INTO detail(length, heigth, width, roof) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, d.getLength());
            pst.setInt(2, d.getHeigth());
            pst.setInt(3, d.getWidth());
            pst.setString(4, d.getRoof());
            
            pst.executeLargeUpdate();
        
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
        }
            return false;
    }
    
    public Detail getDetail(int id) throws SQLException{
        
        try{
            String sql = "SELECT * FROM detail WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                int length = rs.getInt("length");
                int heigth = rs.getInt("heigth");
                int width = rs.getInt("width");
                String roof = rs.getString("roof");
                
                Detail d = new Detail(length, heigth, width, roof);
                return d;
            }
            return null;
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    
        public int getDetailId(int l, int h, int w, String r) throws SQLException{
        
        try{
            String sql = "SELECT * FROM detail WHERE detail.length = ? AND detail.heigth = ? AND detail.width = ? AND detail.roof = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, l);
            pst.setInt(2, h);
            pst.setInt(3, w);
            pst.setString(4, r);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt("did");
            }
            return 0;
        
        } catch(SQLException ex){
            System.out.println(ex);
        }
        return 0;
    }
}
