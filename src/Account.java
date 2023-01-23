import java.util.*;

class Account {
    protected String username;
    protected String password;
    
    Account(String id, String pass){
        this.username = id; 
        this.password = pass; 
    }
    
    void set_data(String id, String pass){
        this.username = id; 
        this.password = pass;
    }
    
    void set_id(String id){
        this.username = id; 
    }
    
    void set_pass(String pass){
        this.password = pass; 
    }
    
    boolean check_id(String id,String pass){
            if(id.equals(username) && pass.equals(password)){
                System.out.println("Login Success");
                return true;
            }
        return false;
    }
    
    String get_id(){
        return this.username; 
    }
    
    String get_pass(){
        return this.password; 
    }
}