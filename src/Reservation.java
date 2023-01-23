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
        System.out.println("Reservation:");
        System.out.println("ResID" + Integer.parseInt(super.username) + this.increment);
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
}
