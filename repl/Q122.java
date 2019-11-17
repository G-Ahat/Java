package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Q122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    int day = 0;
	    System.out.print("Day " + day +" ");
	    System.out.println(Arrays.toString(inhabitants));
	    
		     for(int i:inhabitants) {
		    	 
		    	
		    		 
		    		 while(i!=0) {
		    			 day++;
				    	 System.out.print("Day " + day +" ");
		    			 i/=2;
		    		 System.out.println(Arrays.toString(inhabitants));
		     }
		     
		    	 
		     }
				
					
					
				
				
				System.out.println("---- EXTINCT ----");
	     
	    

	}

}
