import java.util.*;

class Customer extends Account {
    // private ArrayList<String> cust_name = new ArrayList<String>();
    // private ArrayList<String> address = new ArrayList<String>();
    // private ArrayList<String> cust_email = new ArrayList<String>();
    
    private String cust_name;
    private String address;
    private String cust_email;
    
    Customer(String id, String pass, String cname, String addr, String cmail) {
        super(id, pass);
        this.cust_name = cname;
        this.address = addr;
        this.cust_email = cmail;
    }
    
    void set_data(String id, String pass, String cname, String addr, String cmail){
        super.username = id;
        super.password = pass;
        this.cust_name = cname;
        this.address = addr;
        this.cust_email = cmail;
    }
    
    void get_data(){
        System.out.println("Username = " + super.username);
        System.out.println("Password = " + super.password);
        System.out.println("Name = " + this.cust_name);
        System.out.println("Address = " + this.address);
        System.out.println("Email = " + this.cust_email);
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
    
    void check_account(){
            System.out.println(". "+super.username +" "+ super.password);
    }
    
    void print_data(){
        System.out.println("Username = " + super.username);
        System.out.println("Password = " + super.password);
        System.out.println("Name = " + this.cust_name);
        System.out.println("Address = " + this.address);
        System.out.println("Email = " + this.cust_email);
    }
}