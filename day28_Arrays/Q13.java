package day28_Arrays;

import java.util.Arrays;

public class Q13 {

	public static void main(String[] args) {
		int[] x= {1,2};
		int[] y= {3,4};
		sumValue(x,y);

	}
	
	public static void sumValue(int[]arr1, int []arr2) {
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr1.length;i++) {
			sum1+=arr1[i];
		}
		
		for(int j=0;j<arr2.length;j++) {
			sum2+=arr2[j];
			
			
		}
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}
		if(sum2>sum1) {
			System.out.println(Arrays.toString(arr2));
		}
		if(sum1==sum2) {
			System.out.println("equal");
			
			
			
			
			
				
				
			}
			
			
		}
		
		
		
	}


