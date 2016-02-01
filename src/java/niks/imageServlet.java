/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package niks;

import java.sql.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletOutputStream;


/**
 *
 * @author Nikhil
 */
public class imageServlet extends HttpServlet {

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
        
        
            byte[ ] imgData= null;
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 String roll=request.getParameter("id");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("select imag from image where roll=?");
                 stmt.setString(1, roll);
                 ResultSet rs = stmt.executeQuery();
                 
                     
                 if (rs.next()) {
                    Blob image = rs.getBlob(1);
                    imgData = image.getBytes(1, (int) image.length());
                    response.setContentType("image/gif");
                    OutputStream o = response.getOutputStream();
                    o.write(imgData); // even here we got the same as below.
                    o.flush();
                    o.close();
                } 

                  
                }catch(Exception e){
                    PrintWriter out = response.getWriter();
                    out.println("something went wrong:");
                    out.println(e);
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
