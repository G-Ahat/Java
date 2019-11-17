package day26_arrays_part3;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double sum=0.0;
		double avrg;
		
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println("please enter in the following rainfall for the months ahead:");
		for(int i=0;i<months.length;i++) {
		System.out.print(months[i] + ":");
		double rainFall=scan.nextDouble();
		sum+=rainFall;		
		}
		avrg=sum/months.length;
		
		System.out.println("the sum of all the rain is: " + sum);
		System.out.println("the average rainfall was: " + avrg );
			
			
		

	}

}
