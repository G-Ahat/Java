package repl;

import java.util.Scanner;

public class Q115 {

	public static void main(String[] args) {
		//Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length
		
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		String longest="";
		int maxlength=0;
		for(String s:words) {
			if(s.length()>maxlength) {
				maxlength=s.length();
				longest=s;
			}
		}
		System.out.println(longest);
		
		

	}

}
