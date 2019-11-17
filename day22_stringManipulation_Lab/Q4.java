package day22_stringManipulation_Lab;

public class Q4 {

	public static void main(String[] args) {

		System.out.println(firstTwo("hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));


	}
	public static String firstTwo(String str) {
		if (str.length()<2) {
			return str;
		}else { 
			return str.substring(0,2);
		
		}
	}

}
