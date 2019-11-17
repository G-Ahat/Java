package day10_controlFlowStatements_Part4;

public class task_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=50;
		int num2=10;
		int repeat=3;
		for(int i=1;i<=3;i++) {
			if(num1>num2) {
				System.out.println("number1 is greater than number2");
			}else if (num2>num1) {
				System.out.println("number2 is greater than number1");
			}else if(num1==num2) {
				System.out.println("number1 is equal to number2");
			}
		}

	}

}
