package day36_StaticClassMmebers;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result=Calculator.plus(55,7);
		System.out.println("result: " +result);
		
		Calculator c=new Calculator();
		System.out.println(c.plus(55,7));

	}

}
