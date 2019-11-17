package day28_Arrays;

import java.util.Arrays;

public class Lab4_Q9 {

	public static void main(String[] args) {
		int [] x= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(doubleLength(x)));

	}
	public static int[] doubleLength(int [] arr) {
		int[] newArray = new int[2*arr.length];
		newArray[newArray.length-1]=arr[arr.length-1];
		
		return newArray;
	}
	

}
