package day31_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Q118 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    int maximumIndex = nums.length - 1;

		double halfIndex = nums.length / 2;

		int temp;

		for (int i = 0; i < halfIndex; i++) {

			temp = nums[i];

			nums[i] = nums[maximumIndex - i];

			nums[maximumIndex - i] = temp;

		}
	    
	    
	    
	    
	    
	    
	    System.out.println(Arrays.toString(nums));
	}

}
