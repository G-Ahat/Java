package day36_StaticClassMmebers;

public class AllBlocks {
	
	public AllBlocks(int x){
		System.out.println("One Argument constructor");
		
	}
	public AllBlocks() {
		System.out.println("NBo argument constructor");
	}

	static {
		System.out.println("first static init");
	}
	{
		System.out.println("first instance init");
	}
	{
		System.out.println("second instance init");
	}
	
	static {
		System.out.println("second static init");
	}
}
