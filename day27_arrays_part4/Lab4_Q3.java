package day27_arrays_part4;

public class Lab4_Q3 {

	
	public static void main(String[] args) {
		int[] a= {1,2,3};
		int[] b= {7,3};
		
		System.out.println(ArrayLength(a,b));
		
		
		
		
	}
	public static String ArrayLength(int[] arr,int[] arr1) {
		if(!(arr.length>1)) {
			return "Array 1 is not valid ";
			}
		if(!(arr1.length>1)){
			return "Array 2 is not valid ";
		}
		if(arr.length>1 && arr1.length>1) {
			return "true";
		}
		if(arr[0]==arr1[0] || arr[arr.length-1]==arr1[arr.length-1]) {
			return "true";
		}else {
			return "false";
		}
		
		
	}

}
