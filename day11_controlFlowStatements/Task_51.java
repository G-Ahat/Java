package day11_controlFlowStatements;

public class Task_51 {

	public static void main(String[] args) {
		
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				
				System.out.print(c);
			}
			for(int x=1;x<=5-r;x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
