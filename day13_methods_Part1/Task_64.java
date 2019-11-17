package day13_methods_Part1;

public class Task_64 {

	public static void main(String[] args) {
	printPattern(5);

	}
	public static void printPattern(int x) {
		for( int i=1;i<=x;i++) {
			System.out.println(" ");
			for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
		}
	}

}
