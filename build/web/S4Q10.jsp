<%-- 
    Document   : portifolio
    Created on : Oct 14, 2015, 9:56:27 PM
    Author     : Nikhil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="niks.object"%>
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
background-image: url("portifolio.jpg");  
margin-left:100px;  
 background-repeat: no-repeat; 
}
#left{  
    position: absolute;  
    left: 20px;  
    top: 20px; 
}
#right{  
    position: absolute;  
    left: 300px;  
    
    border-left: thick solid #080808;
    border-right: thick solid #080808;
}
</style> 

    </head>
    
    <body>
        
        
        
        
        

        <div id="left">
            
            <h3>Q10. If god say that you have to become a sports person in which game you want to build your career.
               <br> 
               
                   
               <form action="game">
                   
                   <input type="radio" name="Answer" value="a" />
                   badminton 
                    <input type="radio" name="Answer" value="b" />
                    Cricket   
                    <input type="radio" name="Answer" value="c" />
                     Football 
                    <input type="radio" name="Answer" value="d" />
                    swimming
                    <br><br>
                    <% application.setAttribute("s", 4); %>
                    <% application.setAttribute("q", 10); %>
                    <input type="submit" value="Next" class="btn btn-default" />
                </form>
                   </div>
            </h3>
         
        
    </body>
</html>
