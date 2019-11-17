package day28_Arrays;

import java.util.Arrays;

public class Lab4_Q11 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		System.out.println(Arrays.toString(threetozero(x)));

	}
	public static int[] threetozero(int [] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==2 && arr[i+1]==3) {
			
				arr[i+1]=0;
			}
		}return arr;
		
		
	}

}
