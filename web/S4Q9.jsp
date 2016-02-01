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
            
            <h3>Q9.If you have to gone one of the following film scenario in reality which one of the following you choose.
               <br> 
               
                   
               <form action="game">
                   
                   <input type="radio" name="Answer" value="a" />
                   Harry Potter 
                    <input type="radio" name="Answer" value="b" />
                    White house down  
                    <input type="radio" name="Answer" value="c" />
                     James Bond 
                    <input type="radio" name="Answer" value="d" />
                    Fast and furious
                    <br><br>
                    <% application.setAttribute("s", 4); %>
                    <% application.setAttribute("q", 9); %>
                    <input type="submit" value="Next" class="btn btn-default" />
                </form>
                   </div>
            </h3>
         
        
    </body>
</html>

