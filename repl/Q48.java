package repl;

import java.util.Scanner;

public class Q48 {

	public static void main(String[] args) {
		//in this problem you need to write a program that checks for the bigger of 3 numbers.
		
		 Scanner s = new Scanner(System.in);
		    int n1,n2,n3;
		    System.out.println("enter 3 numbers");
		    n1 = s.nextInt();
		    n2 = s.nextInt();
		    n3 = s.nextInt();
		    if(n1>n2&&n1>n3) {
		    	System.out.println("n1 is bigger");
		    }else if (n2>n1&&n2>n3) {
		    	System.out.println("n2 is bigger");
		    }else if(n3>n1&&n3>n2) {
		    	System.out.println("n3 is bigger");
		    }else {
		    	System.out.println("numbers are equal");
		    }
		    
		
		
		
		

	}

}
