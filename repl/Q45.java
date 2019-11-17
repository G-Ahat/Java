package repl;

import java.util.*;

public class Q45 {

	public static void main(String[] args) {
		
		    Scanner s = new Scanner(System.in);
		    
		    
		    		    
		       
		    float orderPrice=(float) 10.0;
		    System.out.println("in: ");
		    String in = s.next();
		    
		    
		    if(in=="burger"||in=="chicken") {
		    	
		        System.out.println(orderPrice);
		        orderPrice=s.nextFloat();
		        
		    }
		    if(in=="soda"){
		      System.out.println(2.0);
		    }

	}

}
