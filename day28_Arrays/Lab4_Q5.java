package day28_Arrays;

import java.util.Arrays;

public class Lab4_Q5 {

	public static void main(String[] args) {
		int [] x= {17,10,12,8};
		System.out.println(Arrays.toString(rotateArray(x)));
		

	}
	public static int[] rotateArray(int [] arr) {
		int x=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=x;
		return arr;
	}

}
