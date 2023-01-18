import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class Main
{
    
    static ArrayList<Customer> cust =new ArrayList<Customer>();
    static ArrayList<Packages> paket = new ArrayList<Packages>();
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
        int choice, choice2;
		Scanner myObj = new Scanner(System.in);

		System.out.println("========================");
		System.out.println("1. Add New Package");
		System.out.println("2. Delete Package");
		System.out.println("3. Modify Package");
		System.out.println("4. Back");
		System.out.println("5. Exit");
		System.out.println("========================");
		System.out.print("Input Choice (1-4): ");
		choice = myObj.nextInt();
		System.out.print("\033[H\033[2J"); 
		switch(choice){
		    case 1:
				myObj.nextLine();
		        System.out.print("Package Name: ");
		        String name = myObj.nextLine();
		        
		        System.out.print("Transportation: ");
		        String jeniskend = myObj.next();

				myObj.nextLine();
		        System.out.print("Destination: ");
		        String dest = myObj.nextLine();
		        
		        System.out.print("Price: ");
		        int harga = myObj.nextInt();
		        
		        System.out.print("Ticket Amount: ");
		        int jumlahtiket = myObj.nextInt();
		        
		      	paket.add(new Packages(name,jeniskend,dest,harga,jumlahtiket));
		      	System.out.println("Package added succesfully!!");
		      	promptEnterKey();
				adminsetting();
		      
		    case 2:
				System.out.println(" ===========================================================================================================");
				System.out.println(" | No.\t || Package Name\t || Transportation\t || Destination\t || Price\t || Ticket Amount |");
				for(int i = 0;i<paket.size();i++){
					System.out.print((" | " + (i+1) + "\t || "));
					paket.get(i).print_data();
				}
				System.out.println(" ===========================================================================================================");
				System.out.print("Choose Package Number(Ex:1): ");
				choice2 = myObj.nextInt();
				paket.remove(choice2 - 1);
				System.out.println("Package has been succesfully deleted!!");
			  	promptEnterKey();
				adminsetting();
		        
		    case 3:
				System.out.println("===========================================================================================================");
				System.out.println(" | No.\t || Package Name\t || Transportation\t || Destination\t || Price\t || Ticket Amount |");
				for(int i = 0;i<paket.size();i++){
					System.out.print((" | " + (i+1) + "\t || "));
					paket.get(i).print_data();
				}
				System.out.println("===========================================================================================================");
				System.out.print("Choose Package Number(Ex:1): ");
				choice2 = myObj.nextInt();

				System.out.println();
				System.out.println("Choose Section you want to edit!!");
			  	System.out.println("1.Package Name");
			  	System.out.println("2.Transportation");
			  	System.out.println("3.Destination");
			  	System.out.println("4.Price");
			  	System.out.println("5.Ticket Amount");
			  	System.out.print("Input Choice(1-5): ");
			  	int choice3 = myObj.nextInt();
			  	if(choice3 == 1){
			  		System.out.print("\nPackage Name: ");
			  		String changepackname = myObj.next();
			  		paket.get(choice2 - 1).set_namapaket(changepackname);
			  		System.out.println("Data has been successfully changed!");
			  		promptEnterKey();
			  		adminsetting();
			  	}
			  	else if(choice3 == 2){
			  		System.out.print("\nTransportation: ");
			  		String changetransport = myObj.next();
			  		paket.get(choice2 - 1).set_jenisken(changetransport);
			  		System.out.println("Data has been successfully changed!");
			  		promptEnterKey();
			  		adminsetting();
			  	}
			  	else if(choice3 == 3){
			  		myObj.nextLine();
			  		System.out.print("\nDestination: ");
			  		String changedest = myObj.nextLine();
			  		paket.get(choice2 - 1).set_dest(changedest);
			  		System.out.println("Data has been successfully changed!");
			  		promptEnterKey();
			  		adminsetting();
			  	}
			  	else if(choice3 == 4){
					myObj.nextLine();
			  		System.out.print("\nPrice: ");
			  		int changeprice = myObj.nextInt();
			  		paket.get(choice2 - 1).set_price(changeprice);
			  		System.out.println("Data has been successfully changed!");
			  		promptEnterKey();
			  		adminsetting();
			  	}
			  	else if(choice3 == 5){
			  		System.out.print("\nTicket amount: ");
			  		int changetiket = myObj.nextInt();
			  		paket.get(choice2 - 1).set_jumlahtiket(changetiket);
			  		System.out.println("Data has been successfully changed!");
			  		promptEnterKey();
			  		adminsetting();
			  	}

		    case 4:
		        main(null);
		    case 5:
		        System.exit(0);
		}
		
    }
    
    static void usersetting(int varr){
        System.out.print("\033[H\033[2J"); 
        int choice,choice1 = 0,choice3 = 0;
		Scanner myObj = new Scanner(System.in);
// 		paket travel = new paket(String pakett,String jenisken,String dest,int harga,int jumlah);
		System.out.println("========================");
		System.out.println("1. View Profile");
		System.out.println("2. Modify Profile");
		System.out.println("3. Choose Travel Package");
		System.out.println("4. Exit");
		System.out.println("========================");
		System.out.print("Input Choice (1-4) :");
		choice = myObj.nextInt();
		switch (choice){
		    case 1:
		      cust.get(varr).get_data();
		      promptEnterKey();
		      usersetting(varr);
		    case 2:
		      System.out.println("Choose Section you want to edit!!");
		      System.out.println("1.Username");
		      System.out.println("2.Password");
		      System.out.println("3.Full Name");
		      System.out.println("4.Address");
		      System.out.println("5.Email");
		      System.out.print("Input Choice(1-5): ");
		      choice1 = myObj.nextInt();
		      if(choice1 == 1){
		          System.out.print("\nUsername: ");
		          String changeid = myObj.next();
		          cust.get(varr).set_id(changeid);
		          System.out.println("Data has been successfully changed!");
		          promptEnterKey();
		          usersetting(varr);
		      }
		      else if(choice1 == 2){
		          System.out.print("\nPassword: ");
		          String changepass = myObj.next();
		          cust.get(varr).set_pass(changepass);
		          System.out.println("Data has been successfully changed!");
		          promptEnterKey();
		          usersetting(varr);
		      }
		      else if(choice1 == 3){
				  myObj.nextLine();
		          System.out.print("\nFull Name: ");
		          String changefull = myObj.nextLine();
		          cust.get(varr).set_name(changefull);
		          System.out.println("Data has been successfully changed!");
		          promptEnterKey();
		          usersetting(varr);
		      }
		      else if(choice1 == 4){
					myObj.nextLine();
		          System.out.print("\nAddress: ");
		          String changeaddr = myObj.nextLine();
		          cust.get(varr).set_address(changeaddr);
		          System.out.println("Data has been successfully changed!");
		          promptEnterKey();
		          usersetting(varr);
		      }
		      else if(choice1 == 5){
		          System.out.print("\nEmail: ");
		          String changemail = myObj.next();
		          cust.get(varr).set_email(changemail);
		          System.out.println("Data has been successfully changed!");
		          promptEnterKey();
		          usersetting(varr);
		      }
		      
		    case 3:
		      System.out.println(" |No.\t || Package Name || Transportation || Destination || Price || Ticket Amount");
		      for(int i = 0;i<paket.size();i++){
		          System.out.print((i+1));
		          paket.get(i).print_data();
		      }
		      System.out.print("Choose Package Number(Ex:1): ");
		      choice3 = myObj.nextInt();
		      System.out.print("\033[H\033[2J"); 
		      for(int i=0;i<paket.size();i++){
		          if((i+1) == choice3){
		              paket.get(i).get_data();
		          }
		      }
		      System.out.println("Are you certain??\n");
		      promptEnterKey();
		      main(null);
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
	   
	   	cust.add(new Customer(uname, upass, ufname, adrs, mail));
		System.out.println("Your data has been registered!");
		promptEnterKey();
		main(null);
    }
    
	public static void main(String[] args) {
	    System.out.print("\033[H\033[2J"); 
	    
	   String idd = "";
	   String passv = "";
	   int var = 0;
	    Scanner myObj = new Scanner(System.in);
		System.out.print("\033[H\033[2J"); 
		System.out.println("Main Page");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3.Check Account");
		System.out.println("4. Exit");
		System.out.print("Input Choice (1-4): ");
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
			        var = i;
			    }
			    
			    if((id.equals("ADM123"))&&(pass.equals("ADMPASS"))){
				    adminsetting(); 
			    }
			    else if((id.equals(idd)) && (pass.equals(passv))){
				    usersetting(var);
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
		        for(int i=0;i<cust.size();i++){
		        cust.get(i).check_account();
		        }
		        promptEnterKey();
		        main(null);
		    }
		    
		    else if(choice == 4){
		        System.out.println("Thank you for trying out this program!!!");
		        promptEnterKey();
		        System.exit(0);
		    }
		    else{
		        System.out.println("Wrong Input!");
		        promptEnterKey();
		        main(null);
	    	}
	}while(choice != 1 || choice != 2 || choice != 3);
}

}
