package repl;

import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {
		//Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:
		//Display x if x is greater than or equal to 5
		//Display -x if x is less than 5//

		Scanner scan = new Scanner(System.in);
//	    System.out.println("Enter number:");
//			int x = scan.nextInt();
//			System.out.println(x>=5 ? x :-x);
 
			//######################################
			    System.out.println("Enter number1:");
					int num1 = scan.nextInt();
					System.out.println("Enter number2:");
					int num2 = scan.nextInt();
			System.out.println(num1>num2 ?  num1 : num2 );
			
			
	}

}
