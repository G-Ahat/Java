package day28_Arrays;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		swapValue(a);

	}
	
	public static void swapValue(int[] x) {
		int[] newArray=new int[x.length];
		newArray[0]=x[x.length-1];
		newArray[x.length-1]=x[0];
		
		for(int i=1;i<x.length-1;i++) {
			newArray[i]=x[i];
			}
		System.out.println(Arrays.toString(newArray));
	}

}
