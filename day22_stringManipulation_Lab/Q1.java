package day22_stringManipulation_Lab;

public class Q1 {

	public static void main(String[] args) {
		//create a method that accepts 1 string,e.g. "Bob" return a greeting of the form "hello Bob"
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));
		
	}
     
	public static String helloName(String str) {
		
		return "hello".concat(str).concat("!");
		
	}
	
	
}
