package data.Mapper;

import Service.Entity.CarportMaterial;
import data.DB.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CarportMaterialMapper {

    Connection conn;
    DetailMapper dm = new DetailMapper();
    
    public CarportMaterialMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    public boolean createCarportMaterial(CarportMaterial cm) throws SQLException{
        
        try{
            String sql = "INSERT INTO carportmaterial(wood_qty, screw_qty, roof, bracket, FK_detailid) VALUES(?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, cm.getWood_qty());
            pst.setInt(2, cm.getScrew_qty());
            pst.setString(3, cm.getRoof());
            pst.setInt(4, cm.getBracket());
            pst.setInt(5, dm.getDetailId(cm.getDetail().getLength(), cm.getDetail().getHeigth(), cm.getDetail().getWidth(), cm.getDetail().getRoof()));
            return true;
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }
    
}
