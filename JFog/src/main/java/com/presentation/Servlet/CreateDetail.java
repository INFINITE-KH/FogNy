package com.presentation.Servlet;

import com.Service.Entity.Detail;
import com.Service.Entity.Orderline;
import com.data.Mapper.DBFacade;
import com.Service.calculator.MaterialCalculator;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CreateDetail", urlPatterns = {"/CreateDetail"})
public class CreateDetail extends HttpServlet {
    
    private MaterialCalculator oc = new MaterialCalculator();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
        // DetailMapper dm = new DetailMapper();
        DBFacade dm = new DBFacade();
        
        int length = Integer.parseInt(request.getParameter("length"));
        int heigth = Integer.parseInt(request.getParameter("heigth"));
        int width = Integer.parseInt(request.getParameter("width"));
        String roof = request.getParameter("roof");
        
        Detail d = new Detail(length, heigth, width, roof);
        Orderline o = oc.calcParts(d.getLength(), d.getHeigth(), d.getWidth(), d.getRoof());
        
        //TODO: Create an order using the detail and order created above and link that to costumer
        // then add the variables of the order to session variables 
        
        if(dm.createDetail(d)){
            request.getSession().setAttribute("length", d.getLength());
            request.getSession().setAttribute("heigth", d.getHeigth());
            request.getSession().setAttribute("width", d.getWidth());
            request.getSession().setAttribute("roof", d.getRoof());
            if(dm.createOrderline(o)){
                request.getSession().setAttribute("woodAmount", o.getWood_qty());
                request.getSession().setAttribute("screwAmount", o.getScrew_qty());
                request.getSession().setAttribute("bracketAmount", o.getBracket());
            }
            request.getRequestDispatcher("").forward(request, response);

        }
        
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
            Logger.getLogger(CreateDetail.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CreateDetail.class.getName()).log(Level.SEVERE, null, ex);
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
