package day36_StaticClassMmebers;

public class StaticMethods {
	
	
	public static void show1() {
		System.out.println("hi");
		//show2();//error you can not call instance method from static method
		show4();//you can call static method from static method
	}
	public void show2() {
		System.out.println("hi");
		show1();//you can call static from instance
	}
	public void show3() {
		System.out.println("hi");
		show2();//you can call instance from instance
		show1();
	}
	public static void show4() {
		System.out.println("hi");
		
	}

}
