package repl;


import java.util.*;

public class Q117 {

	public static void main(String[] args) {
		System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(numbers)));
	    

	}
	public static String[] getWithE(String[] arr) {
		
		String dummy="";
	  
	
	    
	    for(String s:arr) {
	    	if(s.contains("e")) {
	    		
	    		dummy+=s+ ",";
	    			
	   	    	}
	    }
	    String [] fewValues=dummy.split(",");
	
	  
	    
	   
	    
		
		
		
		
	    return fewValues;
	  }
	  
}
