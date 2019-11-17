package repl;

import java.util.Scanner;

public class Q97 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String sentence = scan.nextLine();
	     int count1=0;
	     int count2=0;
	    String [] arr=sentence.split(" ");
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i].contains("java")) {
	    		count1++;
	    	}
	    	if(arr[i].contains("python")) {
	    		count2++;
	    	}
	    }
	    if(count1==count2) {
	    	System.out.println(true);
	    }else {
	    	System.out.println(false);
	    }
	}

}
