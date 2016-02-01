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
table, th, td {  
    border: 1px solid black;  
    border-collapse: collapse;  
}  
th, td {  
    padding: 10px;  
}  
table#alter tr:nth-child(even) {  
    background-color: #eee;  
}  
table#alter tr:nth-child(odd) {  
    background-color: #fff;  
}  
table#alter th {  
    color: white;  
    background-color: gray;  
}  
#button{
    position: absolute;
    left: 390px;
    top: 85px;
    
}
#tablea{
    position: absolute;
    left: 150px;
}
#newtable{
    position: absolute;
    left: 600px
}
</style> 

    </head>
    
    <body>
        
        
        <% 
        object student = new object();
        student = (object) request.getSession().getAttribute("user");
        %>
        
        <div id="tablea">
        <table border="3" >
            
            <tr><td>Name: <%= student.getname()%></td></tr>
            <tr><td>Email: <%= student.getemail()%></td></tr>
            <tr><td>Department: <%= student.getdepartment()%></td></tr>
            <tr><td>Password: <%= student.getpassword()%></td></tr>
            
        
        </table>
        </div>
            <div id="button" >
                
                Change to:
                
            </div>
           
            <div id="newtable">
        <table border="3" >
            <form method="post" action="profile">
            <tr><td>Name: <input autofocus name="name" placeholder="Username" type="text"/></td></tr>
            <tr><td>Email: <input autofocus name="email" placeholder="Username" type="text"/></td></tr>
            <tr><td>Department: <input autofocus name="department" placeholder="Username" type="text"/></td></tr>
            <tr><td>Password: <input name="password" placeholder="Password" type="password"/></td></tr>
            <tr><td>Confirm Password: <input name="cpassword" placeholder="Password" type="password"/></td></tr>
            
        </table>
                <button type="submit" class="btn btn-default" name="update">Update</button>
                 </form>
                <form method="post" action="profile">
                <button type="submit" class="btn btn-default" name="update">Cancel</button>
           
                </form>
        </div>
               
         
        
    </body>
</html>
