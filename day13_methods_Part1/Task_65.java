package day13_methods_Part1;

public class Task_65 {

	public static void main(String[] args) {
		calculateGrade(100,100,100);
		calculateGrade(50,50,50);
		

	}
	public static void calculateGrade(int g1,int g2,int g3) {
		double average=(g1+g2+g3)/3;
		if(average<=100&&average>=90) {
			System.out.println("A");
		}else if(average<=89&&average>=80) {
			System.out.println('B');
		}else if (average<=79&&average>=70) {
			System.out.println('C');
		}else if (average<=69&&average>=60) {
			System.out.println('D');
		}else if (average<=59&&average>=0) {
			System.out.println('F');
		}else System.out.println("invalid data input");
	}

}
