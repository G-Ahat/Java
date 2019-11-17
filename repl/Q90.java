package repl;

import java.util.Scanner;

public class Q90 {

	public static void main(String[] args) {
		// Return the number of times that the string "java" appears anywhere in the given string word.
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    int counter=0;
	    for(int i=0;i<word.length()-3;i++) {
	    	if((word.substring(i,i+4)).equals("java")) {
	    		counter++;
	    	
	    	}
	    }
	    System.out.println(counter);
		

	}

}
