package day27_arrays_part4;

public class Lab4_Q1 {

	public static void main(String[] args) {
		int[] x= {1,2,6};
		int[] y= {6,1,2,3};
		int[] z= {13,6,1,2,3};
		
		
		System.out.println(SixInArray(x));
		System.out.println(SixInArray(y));
		System.out.println(SixInArray(z));
		

	}
	public static boolean SixInArray(int[] arr) {
		if(arr.length<1) {
			return false;
		}
		if(arr[0]==6 || arr[arr.length-1]==6) {
			return true;
		}else {
			return false;
		}
	}

}
