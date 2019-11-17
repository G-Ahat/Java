package day4_arithmeticOperators;

public class contribution {

	public static void main(String[] args) {
		
	
/* this program calculates the amaount of pay that will be contributed to a retirement plan 
		if 5%, 8% or 10% of monthly pay is withheld*/
		
	
		double contribution;
		double salary=6000;
		
		//calculate anad display 5% contribution
				contribution=salary*0.05;
				System.out.println("5 percent is $ " +contribution + "per month");
				
	    // calculate and display 8% contribution
				contribution=salary*0.08;
				System.out.println("8 percent is $ " +contribution + "per month");
				
	    //calculate and display 10% contribution
				contribution=salary*0.10;
				System.out.println(("10 percent is $ " +contribution +"per month"));
				
				
				int num1=46;
				int num2=90;
				int sum=num1+num2;
				System.out.println(num1+  "+" +num2 + "=" + sum);
				
		
		
		
	
	
	
	
	
	
	
	}
	
	
}