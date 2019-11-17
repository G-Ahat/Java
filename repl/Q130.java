package repl;

import java.util.Scanner;

public class Q130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    float[] score = new float[7];
		    for(int i=0;i<7;i++) {
		    	System.out.println("Enter score for judge " +(i+1)+ ":");
		    	score[i]=input.nextFloat();
		    }
		    System.out.println("Enter difficulty:");
		    float difficulty=input.nextFloat();
		    
		    float min=10,max=0;
		    for(int i=0;i<7;i++) {
		    	if(score[i]<=min) {
		    		min=score[i];
		    	}
		    }
		    for(int i=0;i<7;i++) {
		    	if(score[i]>=max) {
		    		max=score[i];
		    	}
		    }
		    float total=0;
		    float sum=0;
		    
		     for(int i=0;i<7;i++) {
		    	 sum+=score[i];
		     }
		     
		     total=(float) ((sum-(max+min))*(0.6)*difficulty);
		     
		     
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	System.out.printf("Total: %.2f", total);
		    System.out.println(max);
		    System.out.println(min);

	}

}
