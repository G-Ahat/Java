package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Q120 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	    int index=0;
	    String dummy="";
	    
	    int min=str[0].length();
	    for(int i=0;i<str.length;i++) {
	    	if(str[i].length()<min) {
	    	min=str[i].length();
	    	index=i;
	    	dummy+=str[index]+",";
	             }
           }
	    String[] shortest=dummy.split(",");
	    System.out.println(Arrays.toString(shortest));
      }
}
