package com.java.beans;

public class Dematacc  extends Accounts{

	private static float comm, Interestrate;
	
	

	public Dematacc() {
		// TODO Auto-generated constructor stub
		
		
		super();
	
	}
	public Dematacc( String mobile, String name, int pin,int balance){
	
		
		super( mobile, name , pin,balance);
		this.comm=0;
		this.Interestrate=0;

	}
	
	
	static{
		
		Interestrate=(float)0.8;
		
		comm =(float)0.32;
		
	
		
		
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
