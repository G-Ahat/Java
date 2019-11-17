package day14_methods_Part2;

public class Task_69 {
	/*Write a method named isPrimewhich takes an integer as an argument and 
	returns true if the argument is a prime number, or false otherwise.*/

	public static void main(String[] args) {
		int x=4;
		
		if(isPrime(x) ) {
			System.out.println(x + " is a prime number");
		}else {
			System.out.println(x + " is not a prime number");
		}
		
	}
	public static boolean isPrime(int x) {
		boolean flag=true;
	
		if(x==0||x==1) {
			flag=false;
		}else {
		for(int i=2;i<x;i++) {
			
			
			if(x%i==0) {
				flag=false;
				break;
			}
			}
	     } return true;
	     
	    	 
	     }
	} 
	
			
	

