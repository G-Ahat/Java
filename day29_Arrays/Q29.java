package day29_Arrays;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
		int[] x= {2,10,3,4,20,5,6,100,3,4};
		System.out.println(Arrays.toString(tenRun(x)));
		

	}
	public static int[] tenRun(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%10==0) {
				for(int j=i+1;j<arr.length && arr[j]%10!=0;j++) {
					arr[j]=arr[i];
				}
			}
		}
		return arr;
	}

}
