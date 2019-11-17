package day22_stringManipulation_Lab;

public class Q3 {

	public static void main(String[] args) {
		System.out.println(extraEnd("hello"));
		System.out.println(extraEnd("hi"));
		System.out.println(extraEnd("a"));
		
		

	}
	public static String extraEnd(String str) {
		if(str.length()<2) {
			return "invalid input";
		}else {
		
		return str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2);
		}
	}
	
	}


