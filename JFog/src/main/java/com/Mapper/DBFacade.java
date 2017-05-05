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

public class DBFacade implements IDBFacade {

    CarportMapper cpm = new CarportMapper();
    
    CustomerMapper cm = new CustomerMapper();
    DetailMapper dm = new DetailMapper();
    EmployeeMapper em = new EmployeeMapper();
    OrderlineMapper olm = new OrderlineMapper();
    OrdersMapper om = new OrdersMapper();
    ProductMapper pm = new ProductMapper();
    
    @Override
    public Carport getCarport(int id) throws SQLException {
       return cpm.getCarport(id);
    }

    @Override
    public List<Carport> getAllCarport() throws SQLException {
        return cpm.getAllCarport();
    }

    @Override
    public boolean createCustomer(Customer c) throws SQLException {
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
    public boolean createEmployee(Employee e) throws SQLException {
        return em.createEmployee(e);
    }

    @Override
    public Employee getEmployee(int id) throws SQLException {
        return em.getEmployee(id);
    }

    @Override
    public void createOrderline(Orderline ol) throws SQLException {
        olm.createOrderline(ol);
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
    
}
