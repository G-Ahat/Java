package day13_methods_Part1;

public class Task_59 {

	public static void main(String[] args) {
		payment(80,20);
	}
	
	public static void payment(double hours,double hourlypay) {
		double pay=hours*hourlypay;
		System.out.println(pay);
	}

}
