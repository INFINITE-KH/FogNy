package data.Mapper;

import data.DB.DBConnector;
import Service.Entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper {
    
    Connection conn;
    
    public EmployeeMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    public boolean createEmployee(Employee e) throws SQLException{
        
        try{
            String sql = "INSERT INTO employee(id, ename, ephone, password) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, e.getId());
            pst.setString(2, e.getEname());
            pst.setInt(3, e.getEphone());
            
            int hashPassword = e.getPassword().hashCode();
            String hashString = String.valueOf(hashPassword);
            pst.setString(4, hashString);
            
            pst.executeUpdate();
            
            return true;
        } catch(SQLException ex){
            ex.printStackTrace();
            
            return false;
        }
    }
    
    public Employee getEmployee(int id) throws SQLException{
        
        try{
            String sql = "SELECT * FROM employee WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                String ename = rs.getString("ename");
                int cphone = rs.getInt("ephone");
                String password = rs.getString("password");
                
                Employee c = new Employee(id, ename, cphone, password);
                return c;
            }
            return null;
            
        } catch (SQLException ex){
            System.out.println(ex);
        }
        return null;
    }
    
    public boolean verifyEmployee(int id, String password){
        
        try{
            String sql = "SELECT id, password FROM employee WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            
            ResultSet rs = pst.executeQuery();
            
        if(rs.next()){
            rs.getString("password");         
            if(password.equals(rs.getString("password")))
                return true;
        }
        
        
    } catch (SQLException ex){
            System.out.println(ex);
    }
      return false;  
    }
    
    public static void main(String[] args) throws SQLException {
        
        EmployeeMapper e = new EmployeeMapper();
        boolean c = e.verifyEmployee(1, "12324");
        System.out.println(c);
        
    }
}
