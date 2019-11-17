package day22_stringManipulation_Lab;

public class Q7 {

	public static void main(String[] args) {
		System.out.println(comboString("Hello","hi"));
		System.out.println(comboString("hi","Hello"));



	}
	public static String comboString(String str1,String str2) {
		if(str1.length()<str2.length()) {
			return str1+str2+str1; 
		}else if(str2.length()<str1.length()) {
			return str2+str1+str2;
		}else 
			return "length of strings are equal";
		
	}

}
