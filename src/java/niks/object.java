package niks;


public class object {
    
    private String roll;
    private String email;
    private String name;
    private String department;
    private String password;
    private String setp;
    
    public void setroll(String roll){
        this.roll = roll;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    
    public void setname(String name){
        this.name = name;
    }
    
    public void setpassword(String password){
        this.password = password;
    }
    
    public void setdepartment(String department){
        this.department = department;
    }
    public void setsetp(String setp){
        this.setp = setp;
    }
    public String getroll(){
        return roll;
    }
    public String getemail(){
        return email;
    }
    public String getpassword(){
        return password;
    }
    public String getname(){
        return name;
    }
    public String getdepartment(){
        return department;
    }
    public String getsetp(){
        return setp;
    }
}
