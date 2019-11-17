package day25_arrays_part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[]=new int[4];
		
		getValues(numbers);
		System.out.println("here are the numbers that you entered");
		
		
		showArray(numbers);
	}
	
	public static void getValues(int[] array) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a series of " + array.length + " numbers");
		for(int i=0; i<array.length;i++) {
			System.out.println("enter number " + (i+1)+ " :");
			array[i]=scan.nextInt();
			
		}
		
	}
	public static void showArray(int[] array) {
		for(int value:array) {
			System.out.println(value + " ");
		}
		
		
	}
	

}
