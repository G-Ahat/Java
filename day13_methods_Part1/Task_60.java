package day13_methods_Part1;

public class Task_60 {

	public static void main(String[] args) {
		Calculator(6,3,'+');
		Calculator(6,3,'-');
		Calculator(6,3,'*');
		Calculator(6,3,'/');
	}
	public static void Calculator(int num1,int num2,char operator) {
		switch(operator) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
		}
	}

}
