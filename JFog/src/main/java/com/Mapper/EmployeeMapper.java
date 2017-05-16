package com.Mapper;

import com.DB.DBConnector;
import com.Entity.Employee;
import com.exception.EmployeeException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper {

    Connection conn;

    public EmployeeMapper() {
        this.conn = new DBConnector().getConnection();
    }

    /* Insert a new Employee */
    public boolean createEmployee(Employee e) throws SQLException {

        try {
            String sql = "INSERT INTO employee(ename, ephone, password) VALUES(?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, e.getEname());
            pst.setInt(2, e.getEphone());
            //int hashPassword = e.getPassword().hashCode();
           // String hashString = String.valueOf(hashPassword);
            pst.setString(3, e.getPassword());
            pst.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();

            return false;
        }
    }

    /*End the insert*/
 /*  login by mohamed */
    public Employee geEmployee(String ename, String password) throws SQLException {
        EmployeeMapper em = new EmployeeMapper();
        Employee e = null;
        try {
            String sql = "SELECT * FROM employee WHERE ename = ? AND password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, ename);
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
    public Employee getEmployee(int id) throws SQLException {

        try {
            String sql = "SELECT * FROM employee WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String ename = rs.getString("ename");
                int cphone = rs.getInt("ephone");
                String password = rs.getString("password");

                Employee c = new Employee(id, ename, cphone, password);
                return c;
            }
            return null;

        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
// code mohamed Insert a new employee
//    public void InsertEmp(String ename, int ephone, String password) throws SQLException {
//        
//        try {
//
//            String sql = "INSERT INTO employee(ename, ephone, password) VALUES(?, ?, ?)";
//            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1, ename);
//            pst.setInt(2, ephone);
//            int hashPassword = password.hashCode();
//            String hashString = String.valueOf(hashPassword);
//            pst.setString(3, hashString);
//            pst.executeUpdate();
//
//            conn.commit();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
// end her new employee
    
    public static void main(String[] args) throws SQLException {

        EmployeeMapper e = new EmployeeMapper();
        Employee c = e.getEmployee(1);
        System.out.println(c.getEname());

    }
}
