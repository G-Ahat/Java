package day24_arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class Task_88 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rn=new Random();
		String cars[]=new String[7];
		
		cars[0]="Honda";
		cars[1]="Toyota";
		cars[2]="Nissan";
		cars[3]="BMV";
		cars[4]="Mercedes";
		cars[5]="Porsche";
		cars[6]="Ferrari";
		
		System.out.println("enter a number between 0-6:");
		int num=scan.nextInt();
		String selectedCar=cars[num];
		int price=0;
		
		switch(selectedCar) {
		case "Honda": case"Toyota": case"Nissan":
			price=rn.nextInt((40000-20000)+1)+20000;
			break;
		case "BMW" : case "Mercedes":
			price=rn.nextInt((80000-50000)+1)+50000;
			break;
		case "Porsche": case "Ferrari":
			price=rn.nextInt((150000-100000)+1)+100000;
			break;
			default:
				System.out.println("invalid car type");
		}
		System.out.println("Price for selected car is: " + price);
		
		
		
	}

}
