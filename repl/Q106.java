package repl;

import java.util.Scanner;

public class Q106 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	   String str []=sentence.split(" ");
	   for(String s:str) {
		   System.out.println(s);
	   }
	    

	}

}
