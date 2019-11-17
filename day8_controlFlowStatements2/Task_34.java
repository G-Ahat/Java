package day8_controlFlowStatements2;

public class Task_34 {

	public static void main(String[] args) {
	 int mark1=50,mark2=60,mark3=100;
	 double a=(mark1+mark2+mark3)/3;
	 System.out.println("average is " + a);
	 if (a<=100&&a>=90) {
		 System.out.println("grade is A");
	 }else if(a>=0 && a<=59) {
		 System.out.println("grade is F");
	 }else if (a>=60 && a<=69) {
		 System.out.println("grade is D");
	 }else if(a>=70 && a<=79) {
		 System.out.println("grade is C");
	 }else if (a>=80 && a<=89) {
		 System.out.println("grade is B");
	 }else if(a>=90 && a<=100) {
		 System.out.println("grade is A");
	 }

	}

}
