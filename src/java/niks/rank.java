
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
public class rank extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        object user = new object();
        user = (object) request.getSession().getAttribute("user");
        String cr1 = user.getroll();
        String cr2;
        int points = 0;
        int[] uq1 = new int[10];
        int[] uq2 = new int[10];
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from answer");
        rs.last();
        for(int i=0;i<10;i++){
            uq1[i]=rs.getInt(i+3);
        }
        rs.first();
        if(rs.getString("setp").equals(user.getsetp())){
                cr2=rs.getString("roll");
                if(!cr2.equals(cr1)){
                    
                     for(int i=0;i<10;i++){
                    uq2[i]=rs.getInt(i+3);
                }
                for(int i=0;i<10;i++){
                    if(uq1[i]==uq2[i]){
                        points++;
                    }
                }
              
                
                //------------------------------------jvhvjh*----------------------
                //also have to check that if ranking also exist add points to previous points
                
           PreparedStatement s = con.prepareStatement("select * from rank where cr1=? and cr2=? or cr1=? and cr2=?");
            s.setString(1, cr1);
            s.setString(2, cr2);
            s.setString(3, cr2);
            s.setString(4, cr1);
            ResultSet rr = s.executeQuery();
           // rr.next();
            if(rr.next()){
                PreparedStatement ss = con.prepareStatement("update rank set points = points + ? where cr1=? and cr2=?");
                ss.setInt(1, points);
                ss.setString(2, cr1);
                ss.setString(3, cr2);
                int i = ss.executeUpdate();
                PreparedStatement s2 = con.prepareStatement("update rank set points = points + ? where cr1=? and cr2=?");
                s2.setInt(1, points);
                s2.setString(2, cr2);
                s2.setString(3, cr1);
                i = s2.executeUpdate();
            }else{
                PreparedStatement st = con.prepareStatement("insert into rank values(?,?,?)");
            st.setString(1, cr1);
            st.setString(2, cr2);
            st.setInt(3, points);
            int i = st.executeUpdate();
            }
            
            
             /*PreparedStatement st = con.prepareStatement("insert into rank values(?,?,?)");
            st.setString(1, cr1);
            st.setString(2, cr2);
            st.setInt(3, points);
            int i = st.executeUpdate();*/
                  //--------------------------------------------kjkjbkjb---  
                    
                }
               
            } 
        while(rs.next()){
            if(rs.getString("setp").equals(user.getsetp())){
                cr2=rs.getString("roll");
                if(cr2.equals(cr1)){
                    break;
                }
                //-----------------changes*/*/*/*/*/*/*/*/*/*/*/** 
                points=0;
                for(int i=0;i<10;i++){
                    uq2[i]=rs.getInt(i+3);
                }
                for(int i=0;i<10;i++){
                    if(uq1[i]==uq2[i]){
                        points++;
                    }
                }
                
            PreparedStatement s = con.prepareStatement("select * from rank where cr1=? and cr2=?");
            s.setString(1, cr1);
            s.setString(2, cr2);
            ResultSet rr = s.executeQuery();
            //rr.next();
            if(rr.next()){
                PreparedStatement ss = con.prepareStatement("update rank set points = points + ? where cr1=? and cr2=?");
                ss.setInt(1, points);
                ss.setString(2, cr1);
                ss.setString(3, cr2);
                int i = ss.executeUpdate();
                PreparedStatement s2 = con.prepareStatement("update rank set points = points + ? where cr1=? and cr2=?");
                s2.setInt(1, points);
                s2.setString(2, cr2);
                s2.setString(3, cr1);
                i = s2.executeUpdate();
            }else{
                PreparedStatement st = con.prepareStatement("insert into rank values(?,?,?)");
            st.setString(1, cr1);
            st.setString(2, cr2);
            st.setInt(3, points);
            int i = st.executeUpdate();
            }
            }    
        }
        
        
        }catch(Exception e){
            out.println(e);
        }
        
        
        response.sendRedirect("portifolio.jsp");
        
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
