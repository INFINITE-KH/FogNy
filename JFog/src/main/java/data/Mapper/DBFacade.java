package data.Mapper;

import Service.Entity.Carport;
import Service.Entity.Customer;
import Service.Entity.Detail;
import Service.Entity.Employee;
import Service.Entity.CarportMaterial;
import Service.Entity.Orders;
import Service.Entity.Product;
import data.exception.CarportException;
import data.exception.CustomerException;
import data.exception.EmployeeException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBFacade implements IDBFacade {

    CarportMapper cpm = new CarportMapper();
    
    CustomerMapper cm = new CustomerMapper();
    DetailMapper dm = new DetailMapper();
    EmployeeMapper em = new EmployeeMapper();
    CarportMaterialMapper cmm = new CarportMaterialMapper();
    OrdersMapper om = new OrdersMapper();
    ProductMapper pm = new ProductMapper();
    
    @Override
    public Carport getCarport(int id) throws CarportException {
       return cpm.getCarport(id);
    }

    @Override
    public List<Carport> getAllCarport() throws SQLException {
        return cpm.getAllCarport();
    }

    @Override
    public boolean createCustomer(Customer c) throws CustomerException {
        return cm.createCustomer(c);
    }

    @Override
    public Customer getCustomer(int id) throws SQLException {
        return cm.getCustomer(id);
    }

    @Override
    public ArrayList<Customer> getAllCustomer() throws SQLException {
        return cm.getAllCustomer();
    }

    @Override
    public boolean createDetail(Detail d) throws SQLException {
        return dm.createDetail(d);
    }

    @Override
    public Detail getDetail(int id) throws SQLException {
        return dm.getDetail(id);
    }

    @Override
    public boolean createEmployee(Employee e) throws EmployeeException {
        return em.createEmployee(e);
    }

    @Override
    public Employee getEmployee(int id) throws EmployeeException {
        return em.getEmployee(id);
    }
    @Override
    public Employee geEmployee(int id, String password) throws EmployeeException{
        return em.geEmployee(id, password);
    }

    @Override
    public boolean createCarportMaterial(CarportMaterial cm) throws SQLException {
        return cmm.createCarportMaterial(cm);
    }

    @Override
    public void createOrders(Orders od) throws SQLException {
        om.createOrders(od);
    }

    @Override
    public void createProduct(Product p) throws SQLException {
        pm.createProduct(p);
    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException {
        return pm.getAllProduct();
    }
    
    public Orders getCustomerOrderByCustomer(Customer c)
    {
        return om.getOrderByCustommerID(c);
    }

}
