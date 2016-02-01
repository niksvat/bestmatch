<%-- 
    Document   : portifolio
    Created on : Oct 14, 2015, 9:56:27 PM
    Author     : Nikhil
--%>

<%@page import="java.io.OutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="niks.*"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Portifolio</title>
        <link href="css/bootstrap.min.css" rel="stylesheet"/>
        <link href="css/bootstrap-theme.min.css" rel="stylesheet"/>
        <link href="css/styles.css" rel="stylesheet"/>
        <style>
body {  
background: lavender;
margin-left:100px;  
 background-repeat: no-repeat; 
}
#left{  
    position: absolute;  
    left: 1px;
    top: 1px; 
    background: aqua;
    height: 100%;
    width: 22%;
}
#right{  
    position: absolute;  
    left: 300px;  
    
    border-left: thick solid #080808;
    border-right: thick solid #080808;
}
#rright{
    position: absolute;
    left: 830px;
    background: cornsilk;
    height: 100%;
    width: 35%;
} 
#info{
    position: absolute;
    left: 320px;
    font-size: 90%;
}
#profile{
    position: absolute;
    left: 320px;
    top: 350px
}
</style> 

    </head>
    
    <body>
        
        <div id="info">There are now four sets of question available (10 question per set). Ones <br>you click on playnow first set of questions appear. Answer all 10
questions and <br>you will redirected to this portifolio page. Now, you can check your ranking in <br>this rank list.
If you again click on play now second set appear and so on....<br>
In order to get best result play all sets.
Keep checking site for newer questions.<br> I will notify here when new set will introduce.

In case you have submitted you <br>roll or name false. you can notify me through gmail or through. I will change..
 </div>
        
        <% object user = (object) session.getAttribute("user");%>
        
        
        
        
        
        
        
        
        <div id="left">
            
            <h3>Hi, <% out.println(user.getname()); %></h3>
            <br>  
            <form action="image" method="post" enctype="multipart/form-data">
                Upload your photo:
                <input type="file" name="photo" size="20"/>
                <input type="submit" class="btn btn-default" value="Upload" />
            </form>
            <br>
            <br>
           <img width="120" height="130" src="imageServlet?id=<%=user.getroll()%>" />
            
            </div>
       
           
        <div id="right">
            
            <br>
            <br>
            <br><br><br><br><br><br><br></br>
            <center>
            -------------------------------------------------------------------------------------------------------
            <form action="game" method="post">
             <input type="submit" class="btn btn-default" value="Play Now" />
            </form>
            -------------------------------------------------------------------------------------------------------            
            </center>
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        </div>
       
            
            
            
            
            <div id="rright"> <h4>Rank List of best Matches in UIET</h4>
               
            <% int i=1;
               try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
                 Statement stmt = con.createStatement();
                 Statement st = con.createStatement();
                 ResultSet rs = stmt.executeQuery("select * from rank order by points desc");
                 ResultSet r = st.executeQuery("select * from students");
                 String n2="";
                 String n1="";
                 String d1="";
                 String d2="";
                 out.println(" <table border=3> ");
                 out.println("<tr><th>Rank</th><th>Name</th><th>Name</th><th>Points</th></tr> ");
                 while(rs.next()){
                     String cr1 = rs.getString("cr1");
                     String cr2 = rs.getString("cr2");
                     r.first();
                     if(r.getString("roll").equals(cr1)){
                         n1=r.getString("name");
                         d1=r.getString("department");
                     }
                     if(r.getString("roll").equals(cr2)){
                         n2=r.getString("name");
                         d2=r.getString("department");
                     }
                         
                     
                     while(r.next()){
                         
                         if(r.getString("roll").equals(cr1)){
                             
                             n1=r.getString("name");
                             d1=r.getString("department");    
                         }else if(r.getString("roll").equals(cr2)){
                             
                             n2=r.getString("name");
                             d2=r.getString("department");
                         }
                     }
                     out.println("<tr>");
                     
                    
                    out.println("<td>"+i+".</td>");
                    out.println("<td>");%>
                   
                    
                    
                    <img width="120" height="130" src="imageServlet?id=<%=cr1%>" />
                  
                    <br>
                    
                    <% out.println(n1+"["+d1+"]");
                    out.println("</td>");
                  
                     out.println("<td>");%>
                   
                    
                    
                    <img width="120" height="130" src="imageServlet?id=<%=cr2%>" />
                  
                    <br>
                    
                    <% out.println(n2+"["+d2+"]");
                    out.println("</td>");
                    out.println("<td>"+rs.getInt("points")+"</td>");
                   
                     
                   
                     out.println("</tr>");
                     i++;
                     
                     
                 }
                  out.println(" </table> ");
                        
             }catch(Exception e){
                 out.println(e);
             }
            %>
               
            
        
            
            
            
            
            
            
            
            
            
            
            
            
          </div>
                
                 <div id="profile">
                    Update your profile:<br>
                    <form action="profile" method="get">
                    <input type="submit" class="btn btn-default" value="Update Profile" />
                    </form>
                    
                    
                </div>
                
        
    </body>
</html>
