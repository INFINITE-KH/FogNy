package data.Mapper;

import data.DB.DBConnector;
import Service.Entity.Employee;
import data.exception.EmployeeException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper {
    
    Connection conn;
    
    public EmployeeMapper(){
        this.conn = new DBConnector().getConnection();
    }
    
    public boolean createEmployee(Employee e) throws EmployeeException{
        
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
    
    public Employee getEmployee(int id) throws EmployeeException{
        
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
    /*  login by mohamed */
    public Employee geEmployee(int id, String password) throws EmployeeException {
        EmployeeMapper em = new EmployeeMapper();
        Employee e = null;
        try {
            String sql = "SELECT * FROM employee WHERE id = ? AND password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                int em_id = rs.getInt("id");
                String em_name = rs.getString("ename");
                int em_phone = rs.getInt("ephone");
                String em_password = rs.getString("password");
                e = new Employee(em_id, em_name, em_phone, em_password);
            }

        } catch (SQLException ex) {
            System.out.println(ex);

        }

        return e;
    }

    /* end login*/
    
    public static void main(String[] args) throws EmployeeException {
        
        EmployeeMapper e = new EmployeeMapper();
        Employee c = e.getEmployee(1);
        System.out.println(c.getEname());
        
    }
}
