package repl;

import java.util.Arrays;
import java.util.Scanner;

public class Q114 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
	    
        
        int count=0;
        for(int j=0;j<nums.length;j++) {
            for(int k =0; k<nums.length;k++) {
                if(nums[j] == nums[k]) {
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[j]);
                break;
            }
          count = 0;
        }

	    
	   
	    

	}

}
