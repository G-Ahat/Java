package day28_Arrays;

public class Lab4_Q8 {

	public static void main(String[] args) {
		int [] x= {1,2};
		int [] y= {2,3};
		int [] z= {4,5};
		System.out.println(contain(x));
		System.out.println(contain(y));
		System.out.println(contain(z));
	}
	public static boolean contain(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==2||arr[i]==3) {
				return true;
			}
		}
			return false;
		}
		
	}
