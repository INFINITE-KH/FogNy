package data.Mapper;

import Service.Entity.Carport;
import Service.Entity.Customer;
import Service.Entity.Detail;
import Service.Entity.Employee;
import Service.Entity.CarportMaterial;
import Service.Entity.Orders;
import Service.Entity.Product;
import data.exception.CarportException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface IDBFacade {
    
     // CarportMapper
     public Carport getCarport(int id) throws CarportException;
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
     public boolean createCarportMaterial(CarportMaterial cm) throws SQLException;
     
     // OrdersMapper
     public void createOrders(Orders od) throws SQLException;
     
     // ProductMapper
     public void createProduct(Product p) throws SQLException;
     public ArrayList<Product> getAllProduct() throws SQLException;
}
