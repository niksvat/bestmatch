/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  javax.servlet.ServletException
 *  javax.servlet.annotation.MultipartConfig
 *  javax.servlet.http.HttpServlet
 *  javax.servlet.http.HttpServletRequest
 *  javax.servlet.http.HttpServletResponse
 *  javax.servlet.http.HttpSession
 *  javax.servlet.http.Part
 *  niks.object
 */
package niks;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import niks.object;

@MultipartConfig(maxFileSize=16177215)
public class image
extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        InputStream inputStream = null;
        Part filePart = request.getPart("photo");
        if (filePart != null) {
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
            inputStream = filePart.getInputStream();
        }
        object user = new object();
        user = (object)request.getSession().getAttribute("user");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
            PreparedStatement st = con.prepareStatement("select * from image where roll=?");
            st.setString(1, user.getroll());
            ResultSet rr = st.executeQuery();
            if (rr.next()) {
                PreparedStatement s = con.prepareStatement("update image set imag=? where roll=?");
                s.setBlob(1, inputStream);
                s.setString(2, user.getroll());
                int i = s.executeUpdate();
                response.sendRedirect("portifolio.jsp");
            } else {
                PreparedStatement stmt = con.prepareStatement("insert into image values(?,?)");
                stmt.setString(1, user.getroll());
                stmt.setBlob(2, inputStream);
                int i = stmt.executeUpdate();
                response.sendRedirect("portifolio.jsp");
            }
        }
        catch (Exception e) {
            out.println(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.processRequest(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }
}