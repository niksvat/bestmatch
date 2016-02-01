
package niks;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nikhil
 */
public class game extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int[] S1Q = new int[11];
        int[] S2Q = new int[11];
        int[] S3Q = new int[11];
        int[] S4Q = new int[11];
        
        object user = new object();
        user = (object) request.getSession().getAttribute("user");
        
        
        ServletContext context=getServletContext();
        if(context.getAttribute("s").equals(1)){
            if(context.getAttribute("q").equals((1))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[0] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[0]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[0]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[0]=4;
            }
                
             try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("insert into answer values(?,?,?,?,?,?,?,?,?,?,?,?)");
                 stmt.setString(1, user.getroll());
                 stmt.setString(2, "1");
                 stmt.setInt(3, S1Q[0]);
                 stmt.setInt(4, 0);
                 stmt.setInt(5, 0);
                 stmt.setInt(6, 0);
                 stmt.setInt(7, 0);
                 stmt.setInt(8, 0);
                 stmt.setInt(9, 0);
                 stmt.setInt(10, 0);
                 stmt.setInt(11, 0);
                 stmt.setInt(12, 0);
                 int i = stmt.executeUpdate();
                 
             }catch(Exception e){
                 out.println(e);
             }
                
                
                
                response.sendRedirect("S1Q2.jsp");
                return;
            }else if(context.getAttribute("q").equals((2))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[1] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[1]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[1]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[1]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q2=? where roll=?");
                 stmt.setInt(1, S1Q[1]);
                 stmt.setString(2, user.getroll());
                 int i= stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S1Q3.jsp");
                return;
            }else if(context.getAttribute("q").equals((3))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[2] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[2]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[2]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[2]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q3=? where roll=?");
                 stmt.setInt(1, S1Q[2]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S1Q4.jsp");
            return;
            }else if(context.getAttribute("q").equals((4))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[3] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[3]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[3]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[3]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q4=? where roll=?");
                 stmt.setInt(1, S1Q[3]);
                 stmt.setString(2, user.getroll());
                 int i =stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S1Q5.jsp");
                return;
            }else if(context.getAttribute("q").equals((5))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[4] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[4]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[4]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[4]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q5=? where roll=?");
                 stmt.setInt(1, S1Q[4]);
                 stmt.setString(2, user.getroll());
                 int i=  stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S1Q6.jsp");
                return;
            }else if(context.getAttribute("q").equals((6))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[5] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[5]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[5]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[5]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q6=? where roll=?");
                 stmt.setInt(1, S1Q[5]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S1Q7.jsp");
                return;
            }else if(context.getAttribute("q").equals((7))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[6] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[6]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[6]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[6]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q7=? where roll=?");
                 stmt.setInt(1, S1Q[6]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S1Q8.jsp");
                return;
            }else if(context.getAttribute("q").equals((8))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[7] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[7]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[7]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[7]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q8=? where roll=?");
                 stmt.setInt(1, S1Q[7]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S1Q9.jsp");
                return;
            }else if(context.getAttribute("q").equals((9))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[8] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[8]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[8]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[8]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q9=? where roll=?");
                 stmt.setInt(1, S1Q[8]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S1Q10.jsp");
                return;
            }else if(context.getAttribute("q").equals((10))){
                if(request.getParameter("Answer").equals("a")){
                S1Q[9] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S1Q[9]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S1Q[9]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S1Q[9]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q10=? where roll=?");
                 stmt.setInt(1, S1Q[9]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
                 stmt = con.prepareStatement("update students set setp = 1 where roll=?");
                 stmt.setString(1, user.getroll());
                 i=stmt.executeUpdate();
                 user.setsetp("1");
             }catch(Exception e){
                 out.println(e);
             }
            }
            
            response.sendRedirect("rank");
            return;
            
     //-----------------------------------------------------End of Set 1 ------------------------------------
        }else if(context.getAttribute("s").equals(2)){
            if(context.getAttribute("q").equals((1))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[0] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[0]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[0]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[0]=4;
            }
                  try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("insert into answer values(?,?,?,?,?,?,?,?,?,?,?,?)");
                 stmt.setString(1, user.getroll());
                 stmt.setString(2, "2");
                 stmt.setInt(3, S2Q[0]);
                 stmt.setInt(4, 0);
                 stmt.setInt(5, 0);
                 stmt.setInt(6, 0);
                 stmt.setInt(7, 0);
                 stmt.setInt(8, 0);
                 stmt.setInt(9, 0);
                 stmt.setInt(10, 0);
                 stmt.setInt(11, 0);
                 stmt.setInt(12, 0);
                 int i = stmt.executeUpdate();
                 
             }catch(Exception e){
                 out.println(e);
             }
                
                
                
                response.sendRedirect("S2Q2.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((2))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[1] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[1]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[1]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[1]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q2=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[1]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q3.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((3))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[2] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[2]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[2]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[2]=4;
            }
                
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q3=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[2]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q4.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((4))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[3] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[3]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[3]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[3]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q4=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[3]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q5.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((5))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[4] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[4]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[4]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[4]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q5=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[4]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q6.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((6))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[5] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[5]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[5]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[5]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q6=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[5]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q7.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((7))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[6] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[6]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[6]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[6]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q7=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[6]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q8.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((8))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[7] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[7]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[7]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[7]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q8=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[7]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q9.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((9))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[8] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[8]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[8]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[8]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q9=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[8]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S2Q10.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((10))){
                if(request.getParameter("Answer").equals("a")){
                S2Q[9] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S2Q[9]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S2Q[9]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S2Q[9]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q10=? where roll=? and setp=2");
                 stmt.setInt(1, S2Q[9]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
                 stmt = con.prepareStatement("update students set setp = 2 where roll=?");
                 stmt.setString(1, user.getroll());
                 i = stmt.executeUpdate();
                 user.setsetp("2");
             }catch(Exception e){
                 out.println(e);
             }
                
                
                
            }
            response.sendRedirect("rank");
            return;
            //-------------------------------------------------End of Set 2 -----------------------------------
        }else if(context.getAttribute("s").equals(3)){
            if(context.getAttribute("q").equals((1))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[0] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[0]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[0]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[0]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("insert into answer values(?,?,?,?,?,?,?,?,?,?,?,?)");
                 stmt.setString(1, user.getroll());
                 stmt.setString(2, "3");
                 stmt.setInt(3, S3Q[0]);
                 stmt.setInt(4, 0);
                 stmt.setInt(5, 0);
                 stmt.setInt(6, 0);
                 stmt.setInt(7, 0);
                 stmt.setInt(8, 0);
                 stmt.setInt(9, 0);
                 stmt.setInt(10, 0);
                 stmt.setInt(11, 0);
                 stmt.setInt(12, 0);
                 int i = stmt.executeUpdate();
                 
             }catch(Exception e){
                 out.println(e);
             }
                
                
                
                response.sendRedirect("S3Q2.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((2))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[1] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[1]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[1]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[1]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q2=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[1]);
                 stmt.setString(2, user.getroll());
                 int i= stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S3Q3.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((3))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[2] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[2]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[2]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[2]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q3=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[2]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S3Q4.jsp");
            return;
            }else if(context.getAttribute("q").equals((4))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[3] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[3]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[3]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[3]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q4=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[3]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S3Q5.jsp");
            return;
                
            }else if(context.getAttribute("q").equals((5))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[4] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[4]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[4]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[4]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q5=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[4]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S3Q6.jsp");
            return;
                
            }else if(context.getAttribute("q").equals((6))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[5] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[5]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[5]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[5]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q6=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[5]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S3Q7.jsp");
            return;
                
            }else if(context.getAttribute("q").equals((7))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[6] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[6]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[6]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[6]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q7=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[6]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S3Q8.jsp");
            return;
                
            }else if(context.getAttribute("q").equals(8)){
                if(request.getParameter("Answer").equals("a")){
                S3Q[7] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[7]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[7]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[7]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q8=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[7]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S3Q9.jsp");
            return;
                
            }else if(context.getAttribute("q").equals((9))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[8] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[8]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[8]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[8]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q9=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[8]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
            response.sendRedirect("S3Q10.jsp");
            return;
                
            }else if(context.getAttribute("q").equals((10))){
                if(request.getParameter("Answer").equals("a")){
                S3Q[9] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S3Q[9]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S3Q[9]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S3Q[9]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q10=? where roll=? and setp=3");
                 stmt.setInt(1, S3Q[9]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
                 stmt = con.prepareStatement("update students set setp = 3 where roll=?");
                 stmt.setString(1, user.getroll());
                 i=stmt.executeUpdate();
                 user.setsetp("3");
             }catch(Exception e){
                 out.println(e);
             }
            }
             response.sendRedirect("rank");
             return;
             //-----------------------------------------------------End of Set 3 ------------------------------
        }else if(context.getAttribute("s").equals(4)){
            if(context.getAttribute("q").equals((1))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[0] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[0]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[0]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[0]=4;
            }
                 try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("insert into answer values(?,?,?,?,?,?,?,?,?,?,?,?)");
                 stmt.setString(1, user.getroll());
                 stmt.setString(2, "4");
                 stmt.setInt(3, S4Q[0]);
                 stmt.setInt(4, 0);
                 stmt.setInt(5, 0);
                 stmt.setInt(6, 0);
                 stmt.setInt(7, 0);
                 stmt.setInt(8, 0);
                 stmt.setInt(9, 0);
                 stmt.setInt(10, 0);
                 stmt.setInt(11, 0);
                 stmt.setInt(12, 0);
                 int i = stmt.executeUpdate();
                 
             }catch(Exception e){
                 out.println(e);
             }
                 response.sendRedirect("S4Q2.jsp");
                 return;
                
            }else if(context.getAttribute("q").equals((2))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[1] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[1]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[1]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[1]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q2=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[1]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q3.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((3))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[2] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[2]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[2]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[2]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q3=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[2]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q4.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((4))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[3] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[3]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[3]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[3]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q4=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[3]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q5.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((5))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[4] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[4]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[4]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[4]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q5=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[4]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q6.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((6))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[5] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[5]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[5]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[5]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q6=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[5]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q7.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((7))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[6] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[6]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[6]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[6]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q7=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[6]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q8.jsp");
                return;
                
            }else if(context.getAttribute("q").equals(8)){
                if(request.getParameter("Answer").equals("a")){
                S4Q[7] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[7]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[7]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[7]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q8=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[7]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q9.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((9))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[8] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[8]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[8]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[8]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q9=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[8]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
             }catch(Exception e){
                 out.println(e);
             }
                
                response.sendRedirect("S4Q10.jsp");
                return;
                
            }else if(context.getAttribute("q").equals((10))){
                if(request.getParameter("Answer").equals("a")){
                S4Q[9] = 1 ; 
            }else if(request.getParameter("Answer").equals("b")){
                S4Q[9]=2;
            }else if(request.getParameter("Answer").equals("c")){
                S4Q[9]=3;
            }else if(request.getParameter("Answer").equals("d")){
                S4Q[9]=4;
            }
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 PreparedStatement stmt = con.prepareStatement("update answer set Q10=? where roll=? and setp=4");
                 stmt.setInt(1, S4Q[9]);
                 stmt.setString(2, user.getroll());
                 int i = stmt.executeUpdate();
                 stmt = con.prepareStatement("update students set setp = 4 where roll=?");
                 stmt.setString(1, user.getroll());
                 i = stmt.executeUpdate();
                 user.setsetp("4");
             }catch(Exception e){
                 out.println(e);
             }
            }
            
            response.sendRedirect("rank");
            return;
        }
         //--------------------------------------------------------------------------------------------------
               
        
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        object user = new object();
        user = (object) request.getSession().getAttribute("user");
        
        String setp = user.getsetp();
        if(setp.equals("0")){
            response.sendRedirect("S1Q1.jsp");
            return;
        }else if(setp.equals("1")){
            response.sendRedirect("S2Q1.jsp");
            return;
        }else if(setp.equals("2")){
            response.sendRedirect("S3Q1.jsp");
            return;
        }else if(setp.equals("3")){
            response.sendRedirect("S4Q1.jsp");
            return;
        }else if(setp.equals("4")){
            response.sendRedirect("allq.jsp");
               return;
            //direct to replay all question message
        }
    }
    }