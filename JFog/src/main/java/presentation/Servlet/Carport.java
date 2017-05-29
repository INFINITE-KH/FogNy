package presentation.Servlet;

import data.Mapper.DBFacade;
import data.Mapper.IDBFacade;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Carport", urlPatterns = {"/Carport"})
public class Carport extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        // CarportMapper cpm = new CarportMapper();
        IDBFacade dbf = new DBFacade();
        List<Service.Entity.Carport> lc = dbf.getAllCarport();
        
       for(int i = 0; i < lc.size(); i++){ 
        request.getSession().setAttribute("cpid" + i+1 , lc.get(i).getId());
        request.getSession().setAttribute("carname" + i+1, lc.get(i).getCarname());
        request.getSession().setAttribute("measure" + i+1, lc.get(i).getMeasure());
        request.getSession().setAttribute("price" + i+1, lc.get(i).getPrice());
        
        // Only show for the employee (dont use sesseionvariable partList for costumer)
        request.getSession().setAttribute("partList" + i+1, lc.get(i).getParts());
        
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
            Logger.getLogger(Carport.class.getName()).log(Level.SEVERE, null, ex);
        
            String msg = ex.getMessage();
            request.setAttribute("msg", msg);
            RequestDispatcher rd = request.getRequestDispatcher("");
            rd.forward(request, response);
        }
    }
    
    
    // catch carportexception'
    // set attribute med fejlmessage
    //oprette en jsp errorpage
    //catch (carportexception ex) {
    //       request,getsession().setAttribute ("Error", "Der opstod desværre en fejl"
    // Kalder attributen error fra errorpage

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
            Logger.getLogger(Carport.class.getName()).log(Level.SEVERE, null, ex);
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
