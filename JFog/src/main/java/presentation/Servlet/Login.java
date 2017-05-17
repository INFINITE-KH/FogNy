package presentation.Servlet;

import Service.Entity.Employee;
import data.Mapper.DBFacade;
import data.Mapper.EmployeeMapper;
import data.exception.EmployeeException;
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

@WebServlet(name = "Login", urlPatterns = {"/Login"})

public class Login extends HttpServlet {
//
//    public Employee emp;
//    boolean loggedin = false;
//    int id;
//    String password;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, EmployeeException {
//        if (!loggedin) {
//
//            id = Integer.parseInt(request.getParameter("eid"));
//            password = request.getParameter("psw");
//            DBFacade em = new DBFacade();
//            Employee e = new Employee(id, password);
//            emp = em.getEmployee(e.getId());
//
//            if (id == (emp.getId()) && password.equals(emp.getPassword())) {
//                request.getRequestDispatcher("Admin/home.jsp").forward(request, response);
//
//            } else {
//                request.getSession().setAttribute("eid", id);
//                request.getRequestDispatcher("Login.jsp").forward(request, response);
//            }
//        }
        DBFacade dfacede = new DBFacade();
        int id = Integer.parseInt(request.getParameter("eid"));
        String password = request.getParameter("psw");
        String employeeName = "";
        
        Employee em = dfacede.geEmployee(id, password);
        employeeName = em.getEname();

        if (em == null) {
            response.sendRedirect("Login.jsp");
        } else {
            request.getSession().setAttribute("ename", employeeName);
            response.sendRedirect("Admin/home.jsp");
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
            Logger.getLogger(Login.class
.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Login.class
.getName()).log(Level.SEVERE, null, ex);
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
