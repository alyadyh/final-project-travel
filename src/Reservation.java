import java.util.*;

class Reservation extends Account{
    
    private int increment;
    
    Reservation(String id,String pass,int incr){
        super(id,pass);
        this.increment = incr;
    }
    
    void set_data(String id,String pass,int incr){
        super.username = id;
        super.password = pass;
        this.increment = incr;
    }
    
     void get_data(){
        String t = "";
        String subchar = super.username.substring(0,4);
        for (int i = 0; i<subchar.length();++i) {
            char ch = subchar.charAt(i);
            int n = (int)ch - (int)'a' + 1;
            t += String.valueOf(n);
            
        }
        
        System.out.println("Reservation:");
        System.out.println("ResID" + t + this.increment);
    }
}

    // Reservation(String id,String pass,int incr){
    //     super(id,pass);
    // }
    
    // void set_data(String id,String pass){
    //     super.username = id;
    //     super.password = pass;
    // }
    
    // protected <T> void get_data(T apaaja){
    //     System.out.println("Reservation: ");
    //     System.out.println("ResID" + Integer.parseInt(super.username) + apaaja);
    // }
