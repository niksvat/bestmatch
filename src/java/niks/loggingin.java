package niks;

import java.sql.*;

public class loggingin {
    
    private String roll;
    private String password;
    private String name;
    private String email;
    private String department;
    private String setp;
    
    
    loggingin(String roll, String password){
        this.roll = roll;
        this.password = password;
    }

    
    
    public boolean check(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bestmatch","root","nikhil");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from students");
       
        while(rs.next()){
           
            if(rs.getString("roll").equals(roll) && rs.getString("password").equals(password)){
                name = rs.getString("name");
                email = rs.getString("email");
                department = rs.getString("department");
                setp = rs.getString("setp");
               con.close();
               return true;
            }
        }
       con.close();
       
       }catch(Exception e){
           System.out.println(e);
       }
        
        return false;
    }
    
    
    public object getdetails(String roll){
        object o = new object();
        o.setpassword(password);
        o.setroll(roll);
        o.setname(name);
        o.setdepartment(department);
        o.setemail(email);
        o.setsetp(setp);
        return o;
        
        
    }
    
}
