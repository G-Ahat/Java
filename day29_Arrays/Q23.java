package day29_Arrays;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(newArray(4)));

	}
	public static int[] newArray(int a) {
		int [] newArr= new int[a];
		for(int i=0;i<a;i++) {
			newArr[i]=i;
		}
		return newArr;
	}

}
