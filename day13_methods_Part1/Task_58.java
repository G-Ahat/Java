package day13_methods_Part1;

public class Task_58 {

	public static void main(String[] args) {
		Greaternum();

	}
	public static void Greaternum() {
		int num1=5, num2=8;
		if(num1>num2) {
			System.out.println(num1 + " is greater");
			
		}else if(num2>num1) {
			System.out.println(num2 + " is greater");
		}else {
			System.out.println("numbers are greater");
		}
	}

}
