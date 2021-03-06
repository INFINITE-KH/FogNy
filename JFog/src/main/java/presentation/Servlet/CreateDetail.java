package presentation.Servlet;

import Service.Entity.Detail;
import Service.Entity.CarportMaterial;
import data.Mapper.DBFacade;
import Service.calculator.MaterialCalculator;
import data.Mapper.IDBFacade;
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
        IDBFacade dbf = new DBFacade();
        
        int length = Integer.parseInt(request.getParameter("length"));
        int heigth = Integer.parseInt(request.getParameter("heigth"));
        int width = Integer.parseInt(request.getParameter("width"));
        String roof = request.getParameter("roof");
        
        Detail d = new Detail(length, heigth, width, roof);
        CarportMaterial cm = oc.calcParts(d.getLength(), d.getHeigth(), d.getWidth(), d.getRoof());
        
        //TODO: Create an order using the detail and order created above and link that to costumer
        // then add the variables of the order to session variables 
        
        if(dbf.createDetail(d)){
            request.getSession().setAttribute("length", d.getLength());
            request.getSession().setAttribute("heigth", d.getHeigth());
            request.getSession().setAttribute("width", d.getWidth());
            request.getSession().setAttribute("roof", d.getRoof());
            if(dbf.createCarportMaterial(cm)){
                request.getSession().setAttribute("woodAmount", cm.getWood_qty());
                request.getSession().setAttribute("screwAmount", cm.getScrew_qty());
                request.getSession().setAttribute("bracketAmount", cm.getBracket());
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
