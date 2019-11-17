package repl;

import java.util.Scanner;

public class Q89 {

	public static void main(String[] args) {
		
		//Given two strings, word and a separator sep, return a big string made of 
		//count occurrences of the word, separated by the separator string.
		
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    String dummy = word;
	    if(count == 0) {
	    	System.out.println("");}
	    
	    for(int i=1; i < count; i++) {
	      dummy= dummy+ separator +word ; 
	    }
	    System.out.println(dummy);
	    
		
		
		

	}

}
