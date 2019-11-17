package day28_Arrays;

public class Lab4_Q12 {

	public static void main(String[] args) {
		int [] a= {1,2,3};
		int[] b= {1,3};
		first1(a,b);
		System.out.println(first1(a,b));
		
	}
	
	public static int first1(int[] x,int[]y) {
		int counter=0;
		
		if(x[0]==1) {
			counter++;
		}if(y[0]==1) {
			counter++;
		}
		return counter;
		
	}

}
