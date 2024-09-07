package BankSystem;
import java.util.Scanner;
import java.util.*;
public class main {
    public static void main(String args[]) {
    	Scanner scanner = new Scanner(System.in);
    	Map<String,Long>map = new HashMap<>();
    	boolean flag = false;
    	do {
    		System.out.println("1) create account ");
    		System.out.println("2) I have account ");
    		
    		int option = scanner.nextInt();
    		String emty = scanner.nextLine();
    		switch(option) {
    		case 1:
    			System.out.print("Enter User name : ");
    			String name  = scanner.nextLine();
    			int age;
    			long aadhar;
    			long mobile;
    			
    			do {
    			System.out.print("Enter User age : ");
    			 age  = scanner.nextInt();
    			if(age>17)flag = false;
    			else {
    				flag = true;
    				System.out.println("User age below 18 ");
    			}
    			}while(flag);
    			do {
    			System.out.print("Enter User aadhar number : ");
    			aadhar = scanner.nextLong();
    			if(100000000000l<aadhar && 999999999999l>aadhar) {
    				flag  = false;
    			}
    			else {
    				flag = true;
    				System.out.println("invalid aadhar number ");
    			}
    			}while(flag);
    			do {
        			System.out.print("Enter User mobile number : ");
        			mobile= scanner.nextLong();
        			if(1000000000l<mobile && 9999999999l>mobile) {
        				flag  = false;
        			}
        			else {
        				flag = true;
        				System.out.println("invalid mobile number ");
        			}
        			}while(flag);
    			Branch branch  = null;
    			Ifsc ifsc = null;
    			do {
        			System.out.print("1) KALAKAD");
        			System.out.print("2) CHERANMAHADEVI");
        			System.out.print("3) AMBAI");
        			System.out.print("4) KADAYAM");
        			System.out.print("5) VALLIYUR");
        			System.out.print("6) TENKASI");
        			System.out.print("7) SURANDAI");
                    int chose = scanner.nextInt();  
                    switch(chose) {
                    case 1:
                    	branch = Branch.KALAKAD;
                    	ifsc = Ifsc.IFSC0001123;
                    	break;  
                     	
                    case 2:
                    	branch = Branch.CHERANMAHADEVI;
                    	ifsc = Ifsc.IFSC0001124;
                    	break; 
                    case 3:
                    	branch = Branch.AMBAI;
                    	ifsc = Ifsc.IFSC0001125;
                    	break; 
                    case 4:
                    	branch = Branch.KADAIYAM;
                    	ifsc = Ifsc.IFSC0001126;
                    	break; 
                    case 5:
                    	branch = Branch.VALLIYUR;
                    	ifsc = Ifsc.IFSC0001127;
                    	break; 
                    case 6:
                    	branch = Branch.TENKASI;
                    	ifsc = Ifsc.IFSC0001128;
                    	break; 
                    case 7:
                    	branch = Branch.SURANDAI;
                    	ifsc = Ifsc.IFSC0001129;
                    	break; 
                    default:
                    	flag = true;
                    	System.out.println("invalid option  ");
                    	break; 
                    }
        			}while(flag);
    			User user = new User(name,age,aadhar,mobile,branch,ifsc);
    			long account_No = user.create_Account_Number(ifsc);
    			System.out.println(account_No);
    			Account ac = new Account(name,account_No,ifsc);
    			String account = ac.toAccount(name,account_No,ifsc);
    			long bal = 0; 
    			
    			map.put(account, bal);
    			System.out.println("map is :"+map);
    			break;
    		case 2:
    			break;
    		default:
    			flag = true;
    			System.out.println("invalid option");
    		}
    	}while(flag);
    	do {
    		System.out.println("1) deposite");
    		System.out.println("2) withdraw");
    		System.out.println("3) exit");
    		int chose =scanner.nextInt();
    		String emty = scanner.nextLine();
    		switch(chose) {
    		case 1:
    			//Account acc = null;
    			System.out.print("Enter Accounder name :");
    			String name = scanner.nextLine();
    			System.out.print("Enter Account No :");
    			long ac_no1 = scanner.nextLong();
    			Ifsc ifsc = null;
    			do {
    				System.out.println("Enter IFSC code :");
        			System.out.print("1) IFSC0001123  ");
        			System.out.print("2) IFSC0001124  ");
        			System.out.print("3) IFSC0001125  ");
        			System.out.println("4) IFSC0001126  ");
        			System.out.print("5) IFSC0001127  ");
        			System.out.print("6) IFSC0001128  ");
        			System.out.println("7) IFSC0001129  ");
                    int choose = scanner.nextInt();  
                    switch(choose) {
                    case 1:
                    	ifsc = Ifsc.IFSC0001123;
                    	break;  
                     	
                    case 2:
                    	ifsc = Ifsc.IFSC0001124;
                    	break; 
                    case 3:
                    	ifsc = Ifsc.IFSC0001125;
                    	break; 
                    case 4:
                    	ifsc = Ifsc.IFSC0001126;
                    	break; 
                    case 5:
                    	ifsc = Ifsc.IFSC0001127;
                    	break; 
                    case 6:
                    	ifsc = Ifsc.IFSC0001128;
                    	break; 
                    case 7:
                    	ifsc = Ifsc.IFSC0001129;
                    	break; 
                    default:
                    	flag = true;
                    	System.out.println("invalid option  ");
                    	break; 
                    }
        			}while(flag);
    			Account acc = new Account(name,ac_no1,ifsc);
    			String account = acc.toAccount(name, ac_no1,ifsc );

    			System.out.print("Enter deposit amount");
    			long amt = scanner.nextLong();
    			if(map.containsKey(account)) {
    				map.put(account,amt+=amt);
    			}
    			else System.out.println("invalid account");
    			break;
    		case 2:
    			System.out.print("Enter Accounder name :");
    			String name1= scanner.nextLine();
    			System.out.print("Enter Account No :");
    			long ac_no2 = scanner.nextLong();
    			Ifsc ifsc1 = null;
    			do {
    				System.out.println("Enter IFSC code :");
        			System.out.print("1) IFSC0001123  ");
        			System.out.print("2) IFSC0001124  ");
        			System.out.print("3) IFSC0001125  ");
        			System.out.println("4) IFSC0001126  ");
        			System.out.print("5) IFSC0001127  ");
        			System.out.print("6) IFSC0001128  ");
        			System.out.println("7) IFSC0001129  ");
                    int choose = scanner.nextInt();  
                    switch(choose) {
                    case 1:
                    	ifsc1 = Ifsc.IFSC0001123;
                    	break;  
                     	
                    case 2:
                    	ifsc1 = Ifsc.IFSC0001124;
                    	break; 
                    case 3:
                    	ifsc1 = Ifsc.IFSC0001125;
                    	break; 
                    case 4:
                    	ifsc1 = Ifsc.IFSC0001126;
                    	break; 
                    case 5:
                    	ifsc1 = Ifsc.IFSC0001127;
                    	break; 
                    case 6:
                    	ifsc1 = Ifsc.IFSC0001128;
                    	break; 
                    case 7:
                    	ifsc1 = Ifsc.IFSC0001129;
                    	break; 
                    default:
                    	flag = true;
                    	System.out.println("invalid option  ");
                    	break; 
                    }
        			}while(flag);
    			Account acc1 = new Account(name1,ac_no2,ifsc1);
    			String account1= acc1.toAccount(name1, ac_no2,ifsc1);

    			System.out.print("Enter withdraw amount");
    			long amount = scanner.nextLong();
    			if(map.containsKey(account1)) {
    				if(map.get(account1)<amount) System.out.println("insufficient amount ...");
    				else {
    				map.put(account1,amount-=amount);
    				System.out.println("amount successfully withdraw . Thank You.... ");
    				}
    			}
    			else System.out.println("invalid account");
    			break;
    		case 3:
    			System.out.println("Thank you...");
    			break;
    		default:
    			flag = true;
    			System.out.println("invalid option");

    		}
    	}while(flag);
    }
}
