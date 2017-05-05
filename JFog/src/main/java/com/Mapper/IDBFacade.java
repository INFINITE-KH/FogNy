package com.Mapper;

import com.Entity.Carport;
import com.Entity.Customer;
import com.Entity.Detail;
import com.Entity.Employee;
import com.Entity.Orderline;
import com.Entity.Orders;
import com.Entity.Product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IDBFacade {
    
     // CarportMapper
     public Carport getCarport(int id) throws SQLException;
     public List<Carport> getAllCarport() throws SQLException;
     
     // CustomerMapper
     public boolean createCustomer(Customer c) throws SQLException;
     public Customer getCustomer(int id) throws SQLException;
     public ArrayList<Customer> getAllCustomer() throws SQLException;
     
     // DetailMapper
     public boolean createDetail(Detail d) throws SQLException;
     public Detail getDetail(int id) throws SQLException;
     
     // EmployeeMapper
     public boolean createEmployee(Employee e) throws SQLException;
     public Employee getEmployee(int id) throws SQLException;
     
     // OrderlineMapper
     public void createOrderline(Orderline ol) throws SQLException;
     
     // OrdersMapper
     public void createOrders(Orders od) throws SQLException;
     
     // ProductMapper
     public void createProduct(Product p) throws SQLException;
     public ArrayList<Product> getAllProduct() throws SQLException;
}
