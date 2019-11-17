package day14_methods_Part2;

public class Task_67 {
	/*Write a method that accepts 2 numbers and return if they have the same last digit.*/

	public static void main(String[] args) {
		 
		if(LastDigit(6,17)) {
			System.out.println("true");
		}else System.out.println("false");
		

	}
	public static boolean LastDigit (int num1,int num2) {
		 boolean x=num1%10==num2%10;
		 return x;
		
	}

}
