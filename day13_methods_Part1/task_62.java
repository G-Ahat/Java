package day13_methods_Part1;

public class task_62 {

	public static void main(String[] args) {
		calculateGreatest(5,2,3);
		calculateGreatest(1,7,4);
		calculateGreatest(8,0,15);
		calculateGreatest(0,0,0);

	}
    
	public static void calculateGreatest(int num1,int num2,int num3) {
		
		if(num1>num2&&num1>num3) {
			System.out.println(num1 + " is the greatest");
		}else if (num2>num1&&num2>num3) {
			System.out.println(num2 + " is the greatest");
			
		}else if (num3>num1&&num3>num2) {
			System.out.println(num3 + " is the greatest");
		}else System.out.println("numbers are equal");
		
	}
}
