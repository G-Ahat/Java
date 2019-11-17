package day27_arrays_part4;

public class Lab4_Q2 {

	public static void main(String[] args) {

		int[] x= {1,2,3};
		int[] y= {1,2,3,1};
		int[] z= {1,2,1};
		
		System.out.println(LengthOfArray(x));
	}
	public static String LengthOfArray(int[] arr) {
		if(!(arr.length>1)) {
			return "not a valid array";
			
		}
		if(arr[0]==arr[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
	}

}
