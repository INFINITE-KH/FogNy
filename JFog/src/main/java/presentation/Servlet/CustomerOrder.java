/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation.Servlet;

import Service.Entity.Customer;
import Service.Entity.Orders;
import data.Mapper.DBFacade;
<<<<<<< HEAD
import data.Mapper.IDBFacade;
=======
import data.exception.CustomerException;
>>>>>>> f81236831051ec05cda136697f0bbaa7e3d8d7be
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CustomerOrder", urlPatterns = {"/CustomerOrder"})
public class CustomerOrder extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException        
       
 {
       

        IDBFacade dbf = new DBFacade();
        
        Customer c = dbf.getCustomer(Integer.parseInt(request.getParameter("cid")));
        
        Orders o = dbf.getCustomerOrderByCustomer(c);
        
        request.getSession().setAttribute("ono", o.getOno());
        request.getSession().setAttribute("checkout_time", o.getCheckout());
        request.getSession().setAttribute("delivery_time", o.getDeliviry());
        request.getSession().setAttribute("shipping_price", o.getShipping());
        request.getSession().setAttribute("carportmaterial_id", o.getcarportmaterial_id());
        
        request.getRequestDispatcher("").forward(request, response);
} 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerOrder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
