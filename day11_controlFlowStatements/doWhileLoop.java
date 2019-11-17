package day11_controlFlowStatements;

public class doWhileLoop {

	public static void main(String[] args) {
int i=20;
		
		do {
			
			
			System.out.println(i);
			i++;
			
		}while(i<=10);

		//print 0-10
		
				int b=0;
				
				while(b<=10) {
					System.out.println(b);
					b++;
				}
				
				//using a loop , iterate untill we have 10 students in the room
				
				int numberOfStudents=1;
				
				while(numberOfStudents<=10) {
					System.out.println("Student " + numberOfStudents);
					numberOfStudents++;
				}
				
				//print 11,10,9,8......1
				
				int num=11;
				while(num>=1) {
					System.out.print(num + " ");
					num--;
				}
		








	}

}
