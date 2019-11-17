package day28_Arrays;

public class Lab_Q4 {

	public static void main(String[] args) {
		int [] x= {1,2,3};
		int [] y= {5,6,9,10};
		System.out.println(sumArray(x));
		System.out.println(sumArray(y));
	}
	
	public static int sumArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
		
		
	}

}
