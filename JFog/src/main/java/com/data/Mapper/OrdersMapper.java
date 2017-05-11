package com.data.Mapper;

import com.data.DB.DBConnector;
import com.Service.Entity.Customer;
import com.Service.Entity.Orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersMapper
{

    Connection conn;

    public OrdersMapper()
    {
        this.conn = new DBConnector().getConnection();
    }

    public void createOrders(Orders od) throws SQLException
    {

        try
        {
            String sql = "INSERT INTO orders(checkout_time, delivery_time, shipping_price, carportmaterial_id) VALUES(?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, od.getCheckout());
            pst.setDate(2, od.getDeliviry());
            pst.setDouble(3, od.getShipping());
            pst.setInt(4, od.getcarportmaterial_id());

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public Orders getOrderByCustommerID(Customer c)
    {
        try
        {
            String sql = "SELECT * FROM orders WHERE ono = " + c.getFK_ono();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while (rs.next())
            {
                Orders customerOrder = new Orders(rs.getInt("ono"), rs.getDate("checkout_time"), rs.getDate("delivery_time"), rs.getInt("shipping_price"), rs.getInt("carportmaterial_id"));
                return customerOrder;
            }

        } catch (SQLException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }

}
