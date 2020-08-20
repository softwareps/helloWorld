import java.util.Scanner;

public class PropertyTax {
	
	public static void main(String args[])
	{
		
//Scanner initialize
		Scanner prompt=new Scanner(System.in);
		boolean user_choice=true;
		
  //while loop
  		while(user_choice){
  			
//display message
  			System.out.println("Enter the property value of the house");
  			
//prompt  property_value
			double property_value=prompt.nextDouble();
			
//display message
			System.out.println("Enter property tax rate");
			
//prompt  property_tax_rate
			double property_tax_rate=prompt.nextDouble();
			
//calculate tax
			double tax=(property_value*(property_tax_rate/100));
			
//calculate tax+property value
	
			double result=property_value+tax;
			
//display tax
			System.out.println("Property tax="+tax);
			
//display result
			System.out.println("result="+result);
			
//display message
			System.out.println("Do you want to calculate another property tax?\n Press yes to continue:");
			
//prompt choice
			String choice=prompt.next();
			
//if condition
			if(choice.equals("yes") ||choice.equals("YES"))
				
//it true then user_choice=true
				user_choice=true;
			
			else
//else user_choice=false﻿
				user_choice=false;
		}
  		
//Exit message
		System.out.println("Exit from the program");
	}
}