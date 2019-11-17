package day17;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a byte value:");
		byte b1= sc.nextByte();
		System.out.println(b1);
		System.out.println("enter another byte value");
		byte b2= sc.nextByte();
		System.out.println(b2);

	}

}
