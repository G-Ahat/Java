package day29_Arrays;

public class Q19 {

	public static void main(String[] args) {
		
		int[] x= {1,2,2,6,99,99,7,3,4};
		except67(x);
		System.out.println(except67(x));
		
		
	}
	public static int except67(int [] arr) {
		int sum=0;
		boolean boolCheckSix= false;
		
		for(int i=0;i<arr.length;i++) {
			if(boolCheckSix) {
				if(arr[i]==7) {
					boolCheckSix=false;
			}
			
			}else if(arr[i]==6) {
				boolCheckSix=true;
			}else {
				sum+=arr[i];
			}
		}
		return sum;
		
	}
	

}
