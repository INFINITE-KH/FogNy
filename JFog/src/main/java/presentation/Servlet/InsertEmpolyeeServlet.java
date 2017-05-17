package presentation.Servlet;

import Service.Entity.Employee;
import data.exception.EmployeeException;
import data.Mapper.DBFacade;
import data.Mapper.EmployeeMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InsertEmpolyeeServlet", urlPatterns = {"/InsertEmpolyeeServlet"})
public class InsertEmpolyeeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, EmployeeException, SQLException {

        DBFacade cm = new DBFacade();
        // reads from form DATA
        String ename = request.getParameter("ename");
        int ephone = Integer.parseInt(request.getParameter("ephone"));
        String password = request.getParameter("password");

        // create a new employee
        Employee e = new Employee(ephone, ename, ephone);
        
        
        // add the new employee to the DATABASE
        if (cm.createEmployee(e)) {

            request.getSession().setAttribute("ename", ename);
            request.getSession().setAttribute("ephone", ephone);
            request.getSession().setAttribute("password", password);

            request.getRequestDispatcher("Login.jsp").forward(request, response);         
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
        } catch (EmployeeException ex) {
            Logger.getLogger(InsertEmpolyeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertEmpolyeeServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (EmployeeException ex) {
            Logger.getLogger(InsertEmpolyeeServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertEmpolyeeServlet.class.getName()).log(Level.SEVERE, null, ex);
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
