package repl;

import java.util.Scanner;

public class Q32 {

	public static void main(String[] args) {
		/*Write a program that determines the change to be dispensed from a vending
		machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
		increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
		dollar bill to pay for the item.*/
        //int change=100-itemPrice;
        //int quarters=(change)/25;        
        //int dimes=(change%25)/10;      
        //int nickels= ((change%25)%10)/10;
		
		int itemPrice;
		int change, quarter, dime, nickel;
		int bill=100;
		Scanner sc=new Scanner(System.in);
	    
	    System.out.println("enter item price of item you selected:");
	    itemPrice=sc.nextInt();
	    if(itemPrice<25 || itemPrice>100) {
	    
	      System.out.println("invalid price");
	      
	    }
	    else if(!(itemPrice%5==0)) {
	      System.out.println("invalid Price");
	      
	    }else {
		 quarter=(100-itemPrice)/25;
         itemPrice%=25;
         dime=(25-itemPrice)/10;      
         itemPrice%=10;
         nickel= (10-itemPrice)/10;
	    
	  
	   
	    System.out.println("your change is: " + quarter +" quarters, " + dime + " dimes, " + nickel + " nickels");
	    }
	
		
	  
	    
	    }
	    


	}


