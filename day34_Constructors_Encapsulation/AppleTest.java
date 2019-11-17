package day34_Constructors_Encapsulation;

public class AppleTest {

	public static void main(String[] args) {
		Apple a1=new Apple();
		System.out.println(a1.color);

	}

	public static void changeApple(Apple a) {
	 
		a.color="blue";
	}
}
