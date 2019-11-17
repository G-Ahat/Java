package repl;

import java.util.Scanner;

public class Q93 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    int n = scan.nextInt();
	    int count=0;
	    String pre=str.substring(0,n);
	    
	    for(int i=0;i<str.length()-n;i++) {
	    	if((str.substring(i,i+n).contains(pre))) {
	    		count++;
	    	}
	    	
	    	}
	    if(count>=2) {
    		System.out.println(true);
    	}else {
    		System.out.println(false);
	    }
	    

	}

}
