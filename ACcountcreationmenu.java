package com.java.services;

import java.util.Scanner;
import java.util.ArrayList;
import com.java.beans.*;

public class ACcountcreationmenu extends CreateAccountserv{

	Scanner s=new Scanner(System.in);
    ArrayList l=new ArrayList();
	public void  Menu(){

		System.out.println("| Create  Bank Account |==>1"  + "  "+"|Login existing Account |==>2");
		int choice =s.nextInt();
		boolean status1=choice>2 && choice>0 ;

		do {
			switch(choice) {

			case 1:
				System.out.println("Enter the Name :");
				s.next();
				String c=s.nextLine();
				System.out.println("Enter the Mobileno :");
				String v=s.nextLine();
				System.out.println("set the Pin :");
				int p=s.nextInt();
				System.out.println("REenter the Pin :");
				int p1=s.nextInt();
				if(p==p1) {
					System.out.println("Account Type    1::Savings  2::Demat");
					int type=s.nextInt();
					boolean status=type>2 && type>0 ;
					do {
						if(type==1) {
							
							System.out.println("Minimal balance for creating account (3000)\n Enter the amount:");
							int h=s.nextInt();
							if(h>3000) {
						    	this.a=new SavingsAcc(c,v,p,h);
						    	l.add(a);
						    	System.out.println("Account created succesfully");
							}else
							{
								System.out.println("Account  not created ");
								break;
							}
							
							
						}
						else if(type==2) {
							System.out.println("Minimal balance for creating account (000):\n Enter the amount");
							int h=s.nextInt();
                          
							this.a1=new Dematacc(c,v,p,h);
							l.add(a1);
							System.out.println("Account created succesfully");
							
							
						}
						else {

							System.out.println("Not created account fatal Error");


						}}while(status);


				}else {
					
					System.out.println("Creation failed");
					break;
				}
				
				break;
				
				
				
				
				
				
				
				







			}








		}while(status1);

	}
}
