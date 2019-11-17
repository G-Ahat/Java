package day28_Arrays;

import java.util.Arrays;

public class Lab4_Q7 {

	public static void main(String[] args) {
		int[] x= {1,2,3,14,6,50,9};
		int[] y= {};
		
		System.out.println(Arrays.toString(firstLast(x,y)));
		

	}
	
	public static int[] firstLast(int[] arr,int arr1[]) {
		arr1= new int[2];
		arr1[0]=arr[0];
		arr1[1]=arr[arr.length-1];
		return arr1;
		
		
		
	}

}
