/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package niks;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Nikhil
 */
public class profile extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             
            response.sendRedirect("profileform.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
         object user = new object();
         
        user = (object) request.getSession().getAttribute("user");
        if(request.getParameter("update").equals("Cancel")){
            response.sendRedirect("portifolio.jsp");
            return;
        }else if(request.getParameter("update").equals("Update")){
           
            try{
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
            PreparedStatement ss = con.prepareStatement("update students set name=?,email=?,department=?,password=? where roll=?");
                ss.setString(1, request.getParameter("name"));
                ss.setString(2, request.getParameter("email"));
                ss.setString(3, request.getParameter("department"));
                ss.setString(4, request.getParameter("password"));
                ss.setString(5, user.getroll());
                int i = ss.executeUpdate();
                loggingin lo = new loggingin(user.getroll(),user.getpassword());
                lo.check();
           user = lo.getdetails(user.getroll());
           HttpSession session = request.getSession();
           session.setAttribute("user", user);
                response.sendRedirect("portifolio.jsp");
                return;
            }catch(Exception e){
                out.println(e);
            }
        }
      response.sendRedirect("portifolio.jsp"); //PROBLEM BETWEEN MOZILLA AND INTERNET EXPLORER IS HERE............
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
