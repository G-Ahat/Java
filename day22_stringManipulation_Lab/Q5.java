package day22_stringManipulation_Lab;

public class Q5 {

	public static void main(String[] args) {
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

	}
	public static String firstHalf(String str) {
		if(str.length()%2==0) {
			return str.substring(0,str.length()/2);
		}else {
			return "String length is not even";
		}
	}

}
