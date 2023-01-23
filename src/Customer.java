import java.util.*;

class Customer extends Account {
    protected String cust_name;
    protected String address;
    protected String cust_email;
    
    Customer(String id, String pass, String cname, String addr, String cmail) {
        super(id, pass);
        this.cust_name = cname;
        this.address = addr;
        this.cust_email = cmail;
    }
    
    // This method overloads the method in Account
    void set_data(String id, String pass, String cname, String addr, String cmail){
        super.username = id;
        super.password = pass;
        this.cust_name = cname;
        this.address = addr;
        this.cust_email = cmail;
    }
    
    void get_data(){
        System.out.println(" Username    : " + super.username);
        System.out.println(" Password    : " + super.password);
        System.out.println(" Name        : " + this.cust_name);
        System.out.println(" Address     : " + this.address);
        System.out.println(" Email       : " + this.cust_email);
    }
    
    void set_name(String nama){
        this.cust_name = nama;
    }
    
    void set_address(String addr){
        this.address = addr;
    }
    
    void set_email(String email){
        this.cust_email = email;
    }
}