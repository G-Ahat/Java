package day29_Arrays;

public class Q22 {

	public static void main(String[] args) {
		int[] x= {1,4,1};
		System.out.println(onetwo(x));

	}
	public static boolean onetwo(int[] arr) {
		int number1=0;
		int number2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				number1++;
			}else if(arr[i]==4) {
					number2++;
				    }
				}
			if(number1>number2) {
				return true;
			 }else {
				 return false;
			 }
			
		
			
	
	}	

	}
 