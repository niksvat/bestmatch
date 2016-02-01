
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            
            
               <br> 
               <h4>
               You Have attempted all sets of question now questions will repeat.
               <br> Do you want to reset all your questions, rank and play again.
               <br> Ranking will be given according to new set of question...
               <form action="reset" method="POST">
                   <input type="radio" name="g" value="reset" />Yes, Reset and take me to my Portifolio page
                   <br> <input type="radio" name="g" value="nreset" />No, Just take me to Portifolio page
                   <br><input type="submit" class ="btn btn-default" value="continue"/>
               </form>
            </h4>
               
               
            </div>
         
        
    </body>
</html>

