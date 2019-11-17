package repl;

import java.util.Scanner;

public class Q92 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    long factorial=1;// data type is very important here
	    if(n==0) {
	    	System.out.println(factorial);
	    }
	    for(int i=1;i<=n;i++) {
	    	factorial=factorial*i;
	    }
System.out.println(factorial);
	}

}
