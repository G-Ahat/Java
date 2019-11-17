package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Q95 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();
	     int count=0;

	     for(int i=0;i<str.length()-4;i++) {
	    	 if((str.substring(i, i+5)).equals("bread")) {
	    		 count++;
	    	 }
	     }
	     if(count<=1 || !(str.contains("bread"))) {
	    	 System.out.println("nothing");
	     }else if(count==2){
	     
	     String [] arr=str.split("bread");
	   System.out.println(arr[1]);
	     }else {
	       String [] arr=str.split("bread");
	       System.out.println("bread" + arr[2]);
	       
	     }
	}

}
