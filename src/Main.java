import java.util.*;
 import java.io.*;
import java.util.ArrayList;

public class Main
{
    
    static ArrayList<Customer> cust =new ArrayList<Customer>();
    // static List<Account> user =new ArrayList<>();
    
     public static void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        try {
            int read = System.in.read(new byte[2]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    static void adminsetting(){
        System.out.print("\033[H\033[2J"); 
        int choice;
		Scanner myObj = new Scanner(System.in);

		System.out.println("========================");
		System.out.println("1. Add New Package");
		System.out.println("2. Delete Package");
		System.out.println("3. Modify Package");
		System.out.println("4. Back");
		System.out.println("5. Exit");
		System.out.println("========================");
		System.out.println("Input Choice (1-5) :");
		choice = myObj.nextInt();
		System.out.print("\033[H\033[2J"); 
		switch(choice){
		    case 1:
		        System.out.print("Package Name:");
		        String name = myObj.nextLine();
		        
		        System.out.print("Transportation:");
		        String jeniskend = myObj.next();
		        
		        System.out.print("Destination:");
		        String dest = myObj.nextLine();
		        
		        System.out.print("Price:");
		        int harga = myObj.nextInt();
		        
		        System.out.print("Ticket Amount:");
		        int jumlahtiket = myObj.nextInt();
		        
		      //  Packages output = new Packages();  
		    case 2:
		        System.out.print("Choose Package Number(Ex:1);");
		        int choice1 = myObj.nextInt();
		        
		    case 3:
		        System.out.println("Choose Package Number(Ex:1):");
		        int choice2 = myObj.nextInt();
		    case 4:
		        main(null);
		    case 5:
		        System.exit(0);
		}
		
    }
    
    static void usersetting(){
        System.out.print("\033[H\033[2J"); 
        int choice;
		Scanner myObj = new Scanner(System.in);
// 		paket travel = new paket(String pakett,String jenisken,String dest,int harga,int jumlah);
		System.out.println("========================");
		System.out.println("1. View Profile");
		System.out.println("2. Modify Profile");
		System.out.println("3. Choose Travel Package");
		System.out.println("4. Exit");
		System.out.println("========================");
		System.out.println("Input Choice (1-4) :");
		choice = myObj.nextInt();
		switch (choice){
		    case 1:
		      //  print_data();
		    case 2:
		      //  modify_data();
		    case 3:
		      //  main();
		    case 4:
		        System.out.println("Thank you for trying out this program!!!");
		        System.exit(0);
            
		}
    }
    
    static void registersetting(){
        System.out.print("\033[H\033[2J"); 
		Scanner myObj = new Scanner(System.in);
		System.out.print("Username: ");
	    String uname = myObj.next();
	    
	    System.out.print("Password: ");
	    String upass = myObj.next();
	    
	    myObj.nextLine();
	    System.out.print("Full Name: ");
	    String ufname = myObj.nextLine();
	    
	    System.out.print("Address: ");
	    String adrs = myObj.nextLine();
	    
	    System.out.print("Email: ");
	    String mail = myObj.next();
	    
	   // Customer data = new Customer(uname, upass, ufname, adrs, mail);
	   cust.add(new Customer(uname, upass, ufname, adrs, mail));
		System.out.println("Your data has been registered!");
		promptEnterKey();
		main(null);
    }
    
	public static void main(String[] args) {
	    System.out.print("\033[H\033[2J"); 
	    
	   // Account check = new Account("tes","check");
	   String idd = "";
	   String passv = "";
	    Scanner myObj = new Scanner(System.in);
		System.out.print("\033[H\033[2J"); 
		System.out.println("Main Page");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. Check Account");
		System.out.println("4. Exit");
		System.out.println("Input Choice (1-4) :");
		int choice = myObj.nextInt();
		do{
		    System.out.print("\033[H\033[2J"); 
		    if(choice == 1){
			    System.out.print("Input ID: ");
			    String id = myObj.next();
			    System.out.print("Input Password: ");
			    String pass = myObj.next();
			    
			    for(int i=0;i<cust.size();i++){
			        if(id.equals(cust.get(i).get_id()) && pass.equals(cust.get(i).get_pass()))
			        idd = id;
			        passv = pass;
			    }
			
			    if((id.equals("ADM123"))&&(pass.equals("ADMPASS"))){
				    adminsetting(); 
			    }
			    else if((id.equals(idd)) && (pass.equals(passv))){
				    usersetting();
				    main(null);
		    	}
		    	else{
		    	    System.out.print("Invalid Input");
		    	    promptEnterKey();
		    	    main(null);
		    	}
		    }
		    else if(choice == 2){
		        registersetting();
		        main(null);
		    }
		    else if(choice == 3){
		        System.out.println("Thank you for trying out this program!!!");
		        promptEnterKey();
		        System.exit(0);
		    }
		    else if(choice == 4){
		        for(int i=0;i<cust.size();i++){
		        cust.get(i).check_account();
		        }
		        promptEnterKey();
		        main(null);
		    }
		    else{
		        System.out.println("Wrong Input!");
		        promptEnterKey();
		        main(null);
	    	}
	}while(choice != 1 || choice != 2);
}

}
