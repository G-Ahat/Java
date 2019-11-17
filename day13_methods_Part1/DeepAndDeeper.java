package day13_methods_Part1;

public class DeepAndDeeper {

	public static void main(String[] args) {
	System.out.println("i am starting in main");
	deep();
	System.out.println("now i am back in main");

	}
	public static void deep() {
		System.out.println("i am now in deep");
		deeper();
		System.out.println("now i am back in deep");
	}
	
	public static void deeper() {
		System.out.println("i am now in deeper");
	}

}
