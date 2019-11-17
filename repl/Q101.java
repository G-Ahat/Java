package repl;

import java.util.Scanner;

public class Q101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    
	    for(int i=0;i<words.length;i++) {
	    char a=	words[i].charAt(0);
	    char b=words[i].charAt((words[i].length()-1));
	    
	    
	    System.out.print(a);
	    System.out.println(b);
	    	
	    }

	}

	

}
