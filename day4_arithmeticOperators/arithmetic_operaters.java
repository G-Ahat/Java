package day4_arithmeticOperators;

public class arithmetic_operaters {

	public static void main(String[] args) {
		
		//Addition operator+
		System.out.println(55+5);
		int chairs=140;
		System.out.println(chairs+2);
		
		int moreChairs=chairs+5;
		System.out.println(moreChairs);
		
		int tables=130;
		int total=tables+chairs;
		System.out.println(total);
		
		//Subtraction -
		double balance=1200.50;
		double transaction=56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		//Create a variable linesofCode and assign 50 and print "lines of code 50"
		// delete 2 lines
		//decrease the value of linesofCode by 2 and print "lines of code 48"
		
		int linesofcode=50;
		System.out.println("lines of code " + linesofcode);
		linesofcode=linesofcode-2;
		System.out.println("lines of code " + linesofcode);
		
		// Multipication
		System.out.println(22*2);
		
		int classes=5;
		System.out.println(linesofcode*classes);
		int totallinesofcode=linesofcode*classes;
		System.out.println("total lines of codes = " + totallinesofcode);
		
		//Division /
		System.out.println(10/2);
		System.out.println(60/3);
		
		//Remainder %
		
		System.out.println(11%3);
		System.out.println(99%2);
		System.out.println(10%2);
		System.out.println(0/4);
		
		
		
		
		
		
		
		
		
		
	}

}
