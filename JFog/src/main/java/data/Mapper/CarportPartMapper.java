package data.Mapper;

import data.DB.DBConnector;
import Service.Entity.CarportPart;
import Service.Entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarportPartMapper {
   
    Connection conn;
    
    public CarportPartMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    /**
     * The combination of CarportPart and product, 
     * is only shown to the employee of the company.
     */
    public List<CarportPart> getCarportParts(int id) throws SQLException{
        
        ArrayList<CarportPart> cpp = new ArrayList<>();
        
        Product product = new Product();
        
        String sql = "SELECT * FROM product INNER JOIN carportpart ON product.pid = carportpart.FK_product WHERE FK_carportid = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()){
            int pid = rs.getInt("id");
            String name = rs.getString("name");
            double measure = rs.getInt("measure");
            product = new Product(pid, name, measure);
            int amount = rs.getInt("measure");
            CarportPart cp = new CarportPart(product, amount);
            cpp.add(cp);
        }
        return cpp;
    }

    public static void main(String[] args) throws SQLException {
        CarportPartMapper cpm = new CarportPartMapper();
        List<CarportPart> partList = cpm.getCarportParts(2);
        for(int i = 0; i<partList.size(); i++){
            System.out.println(partList.get(i).getProduct().getName());
            System.out.println(partList.get(i).getProduct().getMeasure());
            System.out.println(partList.get(i).getAmount());
        }
    }
}
