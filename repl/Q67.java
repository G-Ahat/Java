package repl;

import java.util.Scanner;

public class Q67 {

	public static void main(String[] args) {
		//Write a program that will reverse a string. 
		//Your program should reverse a string only 5 characters long. If word is shorter,
		//display message: "Too short!". If word is longer, display message: "Too long!".
		//Otherwise, reverse this word and print out result into the console.
		
		Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter a word: ");
	    String word = scan.next();
	    if(word.length()<5) {
	    	System.out.println("Too short!");
	    } 
	    if(word.length()>5) {
	    	System.out.println("Too long!");
	    }
	    if(word.length()==5) {
	    	 String reverse = "";
	         for(int i = word.length() - 1; i >= 0; i--){
	             reverse = reverse + word.charAt(i);
	         }
	         
	         System.out.println(reverse);
	    }
		/*You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:*/
	    
	   
	    String word1 = scan.next();
	    String word2 = scan.next();
	    //YOUR CODE HERE
	    if(word1.length()!=3 ||word2.length()!=3){
	      System.out.println("cannot merge");
	    }else {
	    	String merge="";
	    	for(int a=0;a<word1.length();a++) {
	    		merge=merge+word1.charAt(a)+word2.charAt(a);
	    		
	    	}
	    	
	    	System.out.println(merge);
	    }
		
		
		

	}

}
