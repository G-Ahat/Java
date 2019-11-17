package repl;

import java.util.Scanner;

public class Q126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int population = 0, day = 0;
		// System.out.println("Please enter the human population : ");

		population = scan.nextInt();

		/*
		 * 10/2=5 5/2=2 2/2=1 1/2=0
		 */

		while (population != 0) {

			System.out.println("Day " + day + " [" + population + "]");
			day++;
			// population=population/2;
			population /= 2;

		}
		System.out.println("---- EXTINCT ----");

	}

}
