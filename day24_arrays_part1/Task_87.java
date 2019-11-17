package day24_arrays_part1;

import java.util.Scanner;

public class Task_87 {

	public static void main(String[] args) {
		String days[]=new String[7];
		Scanner scan=new Scanner(System.in);
		days[0]="monday";
		days[1]="tuesday";
		days[2]="wednesday";
		days[3]="thursday";
		days[4]="friday";
		days[5]="saturday";
		days[6]="sunday";
		System.out.println("enter index");
		int index=scan.nextInt();
		System.out.println("today is "+ days[index]);

	}

}
