
package day36_StaticClassMmebers;

public class Campus {

	private String city;
	static String country;
	
	static {
		System.out.println("Static Block");
		country="usa";
	}
	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city=city;
	}
	static{
		System.out.println("Static Block Second");
		country="uk";
	}
	
	
}
