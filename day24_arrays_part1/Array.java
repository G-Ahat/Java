package day24_arrays_part1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 //int[] myList= {1,2,3,4}	;
		
		int[] myList= {1,2,3,4};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		
		System.out.println(myList.length);
		
		for(int i=0;i<myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		int[] scores= {80,90,100,34,56,78,45,67,34,23,45,78,69,36,45,12,3,4,9,97,86,75,64,53,42,31};
		int count=0;
		for(int i=0;i<scores.length;i++) {
			count+=scores[i];
			}
		System.out.println(count/scores.length);
		
		
		
		
		
		
		

	}

}
