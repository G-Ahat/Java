package day6_logicalOperators;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=2;
		boolean res=++b==2||--b==2&&--b==2;// F||T&&F = F||F = F
		System.out.println(res);

	}

}
