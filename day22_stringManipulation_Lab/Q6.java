package day22_stringManipulation_Lab;

public class Q6 {

	public static void main(String[] args) {
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));

	}
	public static String withoutEnd(String str) {
		
		if(str.length()>=2) {
		
		return str.substring(1,str.length()-1);
		}else 
			return "string length is not enough";
	}

}
