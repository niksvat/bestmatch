
package niks;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nikhil
 */
public class reset extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        object user = new object();
        user = (object) request.getSession().getAttribute("user");
        
        if(request.getParameter("g").equals("reset")){
                user.setsetp("0");
               try{
                Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update students set setp=0 where roll=?");
                 stmt.setString(1, user.getroll());
                 int i = stmt.executeUpdate();
                 stmt = con.prepareStatement("delete from answer where roll=?");
                 stmt.setString(1, user.getroll());
                 i = stmt.executeUpdate();
                 stmt = con.prepareStatement("delete from rank where cr1=?");
                 stmt.setString(1, user.getroll());
                 i = stmt.executeUpdate();
                 stmt = con.prepareStatement("delete from rank where cr2=?");
                 stmt.setString(1, user.getroll());
                 i = stmt.executeUpdate();
                }catch(Exception e){
                    out.println(e);
                }
                response.sendRedirect("portifolio.jsp");
                return;
           }else{
               response.sendRedirect("portifolio.jsp");
               return;
           }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
