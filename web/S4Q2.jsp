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
            
            <h3>Q2.which of the following is your favourite actoress.
               <br> 
               
                   
               <form action="game">
                   
                   <input type="radio" name="Answer" value="a" />
                   Aiswarya roy  
                    <input type="radio" name="Answer" value="b" />
                    Deepika padukaone   
                    <input type="radio" name="Answer" value="c" />
                     Katrina  
                    <input type="radio" name="Answer" value="d" />
                    None of these
                    <br><br>
                    <% application.setAttribute("s", 4); %>
                    <% application.setAttribute("q", 2); %>
                    <input type="submit" value="Next" class="btn btn-default" />
                </form>
                   </div>
            </h3>
         
        
    </body>
</html>
