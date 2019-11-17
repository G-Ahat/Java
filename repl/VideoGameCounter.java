package repl;

import java.util.Scanner;

public class VideoGameCounter {

	public static void main(String[] args) {
//		The video game machines at your local arcade output coupons according to
//		how well you play the game. You can redeem 10 coupons for a candy bar or 3
//		coupons for a gumball. You prefer candy bars to gumballs. Write a program that
//		defines a variable initially assigned to the number of coupons you win. Next, 
//		the program should output how many candy bars and gumballs you can get if
//		you spend all of your coupons on candy bars first, and any remaining coupons
//		on gumballs.
//
//		if you the coupons are not enough for any redeem, display message:
//		"Not enough coupons"
//		
//		Scanner scan=new Scanner(System.in);
//		int numbersOfcoupons;
//		System.out.println("enter number of coupons:");
//		numbersOfcoupons=scan.nextInt();
//		int candy=numbersOfcoupons/10;
//		int gumballs=(numbersOfcoupons%10)/3;
//		System.out.println("number of candies:" + candy);
//		System.out.println("number of gumballs:" + gumballs);
		
		//####################################3
		
//		Scanner s = new Scanner(System.in);
//	
//		String word1;
//	    String word2;
//		System.out.println("enter two words");
//		word1=s.next();
//		word2=s.next();
//		if(word1.equals(word2)) {
//			System.out.println(word1 + " equals " + word2);
//		}else {
//			System.out.println(word1 + " does not equal " + word2);
//		}
		
		
		//###########################3
		
//		 //DO NOT CHANGE
//	    int num, digit1, digit2, digit3, digit4, digit5;
//	    //WRITE YOUR CODE HERE
//	    Scanner scan=new Scanner(System.in);
//	    System.out.println("Enter your number:");
//	    num=scan.nextInt();
//	    digit1=num/10000;
//	    digit2=(num/1000)%10;
//	    digit3=(num/100)%10;
//	    digit4=(num/10)%10;
//	    digit5=num%10;
//	    System.out.println(digit1);
//	    System.out.println(digit2);
//	    System.out.println(digit3);
//	    System.out.println(digit4);
//	    System.out.println(digit5);
//		
//		
		//################################3
		
		 Scanner s = new Scanner(System.in);
		    
		    
		    
		    
		    //your code here
		    String in;
		    float orderPrice=(float)10.0;
		    System.out.println("in: ");
		    in = s.next();
		    if(in.contentEquals("burger")||in.contentEquals("chicken")) {
		        System.out.println("10.0");
		       
		    }
		    if(in.equals("soda")){
		      System.out.println(2.0);
		    }


	}

}
