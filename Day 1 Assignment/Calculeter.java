package com.Rohit.demo;

import java.util.Scanner;

public class Calculeter {
	public static void main(String[] args) {
		
		
				float number1,number2,result;
				char choice, ch;
				Scanner S=new Scanner(System.in);
				
				do
				{
					 
					System.out.println("\n 1.Addition");
					System.out.println("\n 2.Subtraction");
					System.out.println("\n 3.Division");
					System.out.println("\n 4.Multiplication");
					System.out.println("\n 5.Exit");
					
					System.out.print("Enter your choice : ");
					
					choice=S.next().charAt(0);
					
					
					switch(choice)
					{ 
					    case '1':System.out.print("Enter 1st numbers : ");
					             number1=S.nextFloat();
					             System.out.println("Enter 2nd number");
					             number2=S.nextFloat();	
					             
					             result=number1+number2;
					    
					             System.out.print("Result : " +result);
					    break;
					     
					     case '2':System.out.print("Enter 1st numbers : ");
			                      number1=S.nextFloat();
			                      System.out.println("Enter 2nd number");
			                      number2=S.nextFloat();	
						          
			                      result=number1-number2;
						          
			                      System.out.print("Result : " +result);
						 break;
						    
					     case '3':System.out.print("Enter 1st numbers : ");
			                      number1=S.nextFloat();
			                      System.out.println("Enter 2nd number");
			                      number2=S.nextFloat();	
						          
			                      result=number1/number2;
						          
			                      System.out.print("Result : " +result);
						 break;
						    
					     case '4':System.out.print("Enter 1st numbers : ");
			                      number1=S.nextFloat();
			                      System.out.println("Enter 2nd number");
			                      number2=S.nextFloat();
			                      result=number1*number2;     
			                      System.out.print("Result : " +result);
						 break;
						   
					     case '5':
						         System.exit(0);
						 break;
						 
						 default : System.out.print("Wrong Choice.....\n");
						 break;
					}
			    }
			  while(choice!=5);		
	}

}
