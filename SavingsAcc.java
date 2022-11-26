package com.java.beans;

public class SavingsAcc extends Accounts{

	private static float Intrestrate;
	private   long checkbookno;
	private  static Integer minbalance;

public	SavingsAcc(){
		
		super();
		this.checkbookno=0;
		this.Intrestrate=0;
		this.minbalance=0;
		
	}





static {
	
	Intrestrate=(float)0.4;
    minbalance=1000;	
	
}
			
	
public 	SavingsAcc( String mobile, String name, int pin,int balance){
		
		
		super(mobile,name,pin, balance);
		this.checkbookno=0;
		this.Intrestrate=0;
		this.minbalance=0;
		
	}
	


	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}




@Override
public void Savings() {
	// TODO Auto-generated method stub
	
}




@Override
public void Dematacc() {
	// TODO Auto-generated method stub
	
}	
	


	
	
	



	
	
	
	
	
	
}
