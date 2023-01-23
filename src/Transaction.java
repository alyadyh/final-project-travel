import java.util.*;
import java.lang.Math;

public class Transaction implements Ticket{
    // protected ArrayList<String> ticketid = new ArrayList<String>();

    public <T> void get_data(T apaaja){                                                                                                                                                                                                                                                    
        int min = 10000;
        int max = 99999;
        int random_num = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Ticket: " + apaaja + random_num);
    }
    
    // void set_ticket(){
    //     // this.ticketid.add(Integer.parseInt())
    // }

    //Metode Generic
    // public <T> void print(T apaaja){
        
    // }
}