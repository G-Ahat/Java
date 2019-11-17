package day28_Arrays;

import java.util.Arrays;

public class Lab4_Q6 {

	public static void main(String[] args) {
		int[] x= {1,20,0,0,0,0,0,125};
		System.out.println(Arrays.toString(greatest(x)));
		
	}
	public static int[] greatest(int [] arr) {
		int max=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>max) {
				max=arr[i+1];
			}		
			
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=max;
		}
		return arr;
	}

}
