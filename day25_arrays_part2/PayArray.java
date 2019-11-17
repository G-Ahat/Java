package day25_arrays_part2;

import java.util.Arrays;
import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		// this program stores in an array the hours worked for by 5 employees who all make the same hourly 
		//display their gross pay
		Scanner scan=new Scanner(System.in);
	double payment[]=new double[5];
	int hours[]=new int[5];
		for(int i=0;i<payment.length;i++) {
		System.out.println("enter for employee the hours who worked:");
		int num1=scan.nextInt();
		hours[i]=num1;
		System.out.println("what is the rate for employee: ");
		double wage=scan.nextDouble();
		payment[i]=num1*wage;
		}
		System.out.println(Arrays.toString(payment));
		System.out.println(Arrays.toString(hours));
		
		

	}

}
