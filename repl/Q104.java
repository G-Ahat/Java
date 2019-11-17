package repl;

import java.util.Scanner;

public class Q104 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
boolean flag=false;
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==5&& nums[i+1]==5) {
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	    

	}

}
