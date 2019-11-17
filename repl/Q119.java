package repl;

import java.util.Scanner;

public class Q119 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = 0;
		double total = 0;
		double avgTemp = 0;
		double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
				scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

		for(double d:temps) {
			total+=d;
		}
		k=temps.length;
		avgTemp=total/k;
		System.out.println(avgTemp);
	}
	

}
