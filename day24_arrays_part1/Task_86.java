package day24_arrays_part1;

import java.util.Scanner;

public class Task_86 {

	public static void main(String[] args) {
		String names[]=new String[12];
		names[0]="January";
		names[1]="February";
		names[2]="March";								
		names[3]="April";
		names[4]="May";
		names[5]="June";
		names[6]="July";
		names[7]="August";
		names[8]="September";
		names[9]="October";																	
		names[10]="November";
		names[11]="December";
																						
		Scanner scan=new Scanner (System.in);
		System.out.println("enter month index:");
		int indexNum=scan.nextInt();
		System.out.println("The month is " + names[indexNum]);
		
		
		
	}

}
