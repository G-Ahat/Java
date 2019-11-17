package day29_Arrays;

public class Q21 {

	public static void main(String[] args) {
		
		int[] x= {2,3,2,2,4};
		System.out.println(sum2(x));
		
		
		

	}
	public static boolean sum2(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2) {
				sum+=arr[i];
			}
			if(sum==8) {
				return true;
				
			
			}
			
		}
		return false;
	}

}
