package day8_controlFlowStatements2;

public class nestedifStatement {

	public static void main(String[] args) {
		 boolean isrushhour=false;
		 int cartype=2;
		 double price=0.0;
		 
		 if(cartype==1 ) {
			 if(isrushhour) {
				 price=30.0;
			 }else {
				 price=5.0;
				 
			 }
		 }else if(cartype==2) {
			 if(isrushhour) {
				 price=55.30;
			 }else {
				 price=15.99;
			 }
		 }
     System.out.println("toll cost: " + price);
	}

}
