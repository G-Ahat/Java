package day28_Arrays;

public class Lab4_Q10 {

	public static void main(String[] args) {
		int[] x= {2,2};
		int[] y= {3,3};
		int[] a= {2,3};
		int[] b= {12,20,42};
		int[] c= {2,2,2};
		
		System.out.println(twice(x));
		System.out.println(twice(y));
		System.out.println(twice(a));
		System.out.println(twice(b));
		System.out.println(twice(c));

	}
	public static boolean twice(int[] arr) {
		int c2=0;
		int c3=0;
		for(int value: arr) {
			if(value==2) {
				c2++;
			}else if(value==3) {
				c3++;
			}
		}
		if(c2==2 || c3==2) {
			return true;
		}else {
			return false;
		}
		
	}

}
