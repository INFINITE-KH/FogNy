package com.presentation.Servlet;

import com.Service.Entity.Customer;
import com.data.Mapper.CustomerMapper;
import com.data.Mapper.DBFacade;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CustomerInformation", urlPatterns = {"/CustomerInformation"})
public class CustomerInformation extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
       
        // CustomerMapper cm = new CustomerMapper();
        DBFacade cm = new DBFacade();
        
        Customer c = cm.getCustomer(Integer.parseInt(request.getParameter("cid")));
        
        request.getSession().setAttribute("cid", c.getId());
        request.getSession().setAttribute("fname", c.getFname());
        request.getSession().setAttribute("lname", c.getLname());
        request.getSession().setAttribute("adress", c.getAdress());
        request.getSession().setAttribute("cphone", c.getCphone());
        request.getSession().setAttribute("mail", c.getMail());
        request.getSession().setAttribute("FK_ono", c.getFK_ono());
        
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
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CustomerInformation.class.getName()).log(Level.SEVERE, null, ex);
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
