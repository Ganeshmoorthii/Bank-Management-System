package BankSystem;

public class User {
     String name;
     int age;
     long aadhar;
     long mobile;
     Branch branch;
     Ifsc ifsc;
     User(String name , int age,long aadhar,long mobile,Branch branch,Ifsc ifsc){
    	 this.name=name;
    	 this.age=age;
    	 this.aadhar=aadhar;
    	 this.mobile = mobile;
    	 this.branch=branch;
    	 this.ifsc = ifsc;
     }
      public long create_Account_Number(Ifsc ifsc) {
    	   String change = ifsc.toString();
    	   long rem = 0, k =1;
    	   for(int i =change.length()-7;i<change.length();i++) {
    		     long val = change.charAt(i)-'0';
    		    rem = rem*10+val;
    	   }
    	   System.out.println("rem is : "+rem);
    	   long cha =(rem*1000000000)+k;
    	   System.out.println("cha is : "+cha);
    	   return cha;
      }
}
