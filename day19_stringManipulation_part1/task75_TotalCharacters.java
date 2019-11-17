package day19_stringManipulation_part1;

import java.util.Scanner;

public class task75_TotalCharacters {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your first name:");
		String firstName= sc.next();
		
		System.out.println("enter your last name:");
		String lastName=sc.next();
		
		System.out.println("total characters in your first and last name is:" + ((firstName.length())+lastName.length()));

	}

}
