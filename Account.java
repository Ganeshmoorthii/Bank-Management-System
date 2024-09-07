package BankSystem;

public class Account {
    String name;
    long AC;
    Ifsc ifsc;
    
    Account(String name,long AC,Ifsc ifsc){
    	this.name = name;
    	this.AC = AC;
    	this.ifsc = ifsc;
    }
    public String toAccount(String n,long A,Ifsc i) {
    	return n+" "+A+" "+i;
    }
}
