package day13_methods_Part1;

public class CreditCardMethod {

	public static void main(String[] args) {
	double salary=50000;
	int creditRating=5;
	
	if(salary>=20000&&creditRating>=7) {
		qualify();
	}else {
		noQualify();
	}
	
	

	}
  public static void noQualify() {
	  System.out.println("i am sorry you are not qualified for the credit");
  }
  
  public static void qualify() {
	  System.out.println("congrat, you are qualified for the credit");
  }
}
