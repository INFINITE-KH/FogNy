package presentation.Servlet;

import Service.Entity.Employee;
import data.Mapper.DBFacade;
import data.Mapper.EmployeeMapper;
<<<<<<< HEAD
import data.Mapper.IDBFacade;
=======
import data.exception.EmployeeException;
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

@WebServlet(name = "Signup", urlPatterns = {"/Signup"})
public class Signup extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, EmployeeException {
        
        // EmployeeMapper e = new EmployeeMapper();
        IDBFacade dbf = new DBFacade();
        
        int id = Integer.parseInt(request.getParameter("eid"));
        String password = request.getParameter("psw");
        
        Employee em = new Employee(id, password);
        
        if(dbf.createEmployee(em)){
                    
        request.getSession().setAttribute("eid", em.getId());
        request.getSession().setAttribute("psw", em.getPassword());
        request.getSession().setAttribute("name", em.getEname());
        request.getSession().setAttribute("phone", em.getEphone());
        
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
        } catch (EmployeeException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
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
