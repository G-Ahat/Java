package day27_arrays_part4;

public class Task_95 {

	public static void main(String[] args) {
		int scores[][]= {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
		int sum=0;
		for(int grade=0;grade<scores[0].length;grade++) {
			sum+=scores[0][grade];
		}
		System.out.println("average: " +sum/scores[0].length);
		
		int sum2=0;
		for(int row=0;row<scores.length;row++) {
			sum2+=scores[row][0];
			
		}
		System.out.println(sum2);
		
		
		
		
		
		
		

	}

}
