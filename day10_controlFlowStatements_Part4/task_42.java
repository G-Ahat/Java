package day10_controlFlowStatements_Part4;

public class task_42 {

	public static void main(String[] args) {
		int sumeven=0;
		int sumodd=0;
		
		
		for(int x=1; x<100 ;x++) {
			if(x%2==0) {
				sumeven=sumeven+x;
				
			}else {
				sumodd=sumodd+x;
		
			}
			
		}
         System.out.println("sum of even numbers " + sumeven);
         System.out.println("sum of odd numbers " + sumodd );
	}

}
