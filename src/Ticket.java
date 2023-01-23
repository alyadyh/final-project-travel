//Generic Class
import java.util.*;
import java.lang.*;

class Ticket <T> extends Account{

    Ticket(String id, String pass) {
        super(id, pass);
    }

    void set_data(String id, String pass){
        super.username = id;
        super.password = pass;
    }

    //Generic Method
    public <T> void get_data(T choice){
        String t = "";
        String subchar = super.username.substring(0,4);
        for (int i = 0; i<subchar.length();++i) {
            char ch = subchar.charAt(i);
            int n = (int)ch - (int)'a' + 1;
            t += String.valueOf(n);
            
        }

        int min = 10000;
        int max = 99999;
        int random_num = (int)(Math.random()*(max-min+1)+min);
        System.out.println(" Ticket             : " + t + choice + random_num);
    }
}