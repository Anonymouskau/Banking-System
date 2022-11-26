package com.java.services;
 import com.java.beans.*;
 
 import java.util.ArrayList;
public class CreateAccountserv {
     
	

	Accounts a=new SavingsAcc();
	Accounts a1=new Dematacc ();
   
	
	
	
    
    public void withdraw(int num) {
    	
    	if(a.getBalance()!=0) {
    	   
    		 a.setBalance(a.getBalance()-num);
    	
    	   }
    	else {
    		
    		System.out.println(" Insufficient balance");
    		
    	}
    	
      	
    	
    	
    }
    
   public void  Deposit(int num) {
    	
    	a.setBalance(a.getBalance()+num);
    	
      	
    	
    	
    }
   
   public void withdrawd(int num) {
   	
   	if(a1.getBalance()!=0) {
   	   
   		 a1.setBalance(a1.getBalance()-num);
   	
   	   }
   	else {
   		
   		System.out.println(" Insufficient balance");
   		
   	}
   	
     	
   	
   	
   }
   
  public void  Depositd(int num) {
   	
   	a1.setBalance(a.getBalance()+num);
   	
     	
   	
   	
   }
   
   
//   public void ChangePin(int Id,String mobile,int pin) {
//	   
//	      if(a.getId()==Id)
//	   
//   }
//   
   
    
    
    
    
    
	
	
	
}
