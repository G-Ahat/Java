package day28_Arrays;

import java.util.Arrays;

public class Q14 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= {5,6,7,8};
		newArray(x,y);
		
		

	}
	public static void newArray(int[] arr1, int[] arr2) {
		int[] arr3=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		System.out.println(Arrays.toString(arr3));
		
	}
}
