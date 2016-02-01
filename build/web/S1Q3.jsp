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
            
            <h3>Q3. If you could have named yourself, what name would you have chosen?
               <br> 
               
                   
               <form action="game">
                   
                   <input type="radio" name="Answer" value="a" />
                    Same name that i have .
                    <input type="radio" name="Answer" value="b" />
                    It doesn't matter
                    <input type="radio" name="Answer" value="c" />
                    Name of my like
                    <input type="radio" name="Answer" value="d" />
                    Something stylish.
                    <br><br>
                    <% application.setAttribute("s", 1); %>
                    <% application.setAttribute("q", 3); %>
                    <input type="submit" value="Next" class="btn btn-default" />
                </form>
                   </div>
            </h3>
         
        
    </body>
</html>
