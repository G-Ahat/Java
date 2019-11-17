package day6_logicalOperators;

public class OperatorPresedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int applesCount=20;
		int orangesCount=30;
		int pearsCount=30;
		
		boolean comp= applesCount<orangesCount||orangesCount>=pearsCount;
		System.out.println(comp);
		

	}

}
