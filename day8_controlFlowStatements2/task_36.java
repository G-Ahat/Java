package day8_controlFlowStatements2;

public class task_36 {

	public static void main(String[] args) {
		 int num1=10,num2=5;
		 String operator="+";
		 int result=0;
		 
		switch(operator) {
		case"+":
			result=num1+num2;
			break;
		case"-":
			result=num1-num2;
			break;
		case"*":
			result=num1*num2;
			break;
		case"/":
			result=num1/num2;
			break;
		default:
			System.out.println("invalid operator");
			
		 
		}
		System.out.println("result is " + result);
		 

	}

}
