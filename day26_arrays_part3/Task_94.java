package day26_arrays_part3;

import java.util.Arrays;

public class Task_94 {

	public static void main(String[] args) {
		String info1 = "This info is used for creation password : xxxCD132Gxxx . Please do not share with anyone";
		String info2 = "This info is used for creation password : xxx00ABC!xxx . Please do not share with anyone";
 
		 String[] arr1=info1.split("xxx");
	        String[] arr2=info2.split("xxx");
	        System.out.println(Arrays.deepToString(arr1));
	        System.out.println(arr1[1]);
	        System.out.println(arr1[1]+arr2[1]);
	}

}
