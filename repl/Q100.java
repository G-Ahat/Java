package repl;

import java.util.Scanner;

public class Q100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++){
			arr[i] = input.nextLine();
		}
	    for(int i=0;i<arr.length;i++) {
	    	char a=arr[i].charAt(0);
	    	char b=arr[i].charAt(1);
	    	char c=arr[i].charAt(2);
	    	 System.out.print(a);
	 	    System.out.print(b);
	 	    System.out.println(c);

	    }
	   
	}

}
