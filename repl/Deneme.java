package repl;

import java.util.Scanner;

public class Deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//############################
	//	Scanner scan=new Scanner(System.in);
//		String item1, item2, item3, report;
//		double price1, price2, price3, totalPrice;
//		System.out.println("Enter Item1 and its price:");
//		item1=scan.next();
//		price1=scan.nextDouble();
//		System.out.println("Enter Item2 and its price:");
//		item2=scan.next();
//		price2=scan.nextDouble();
//		System.out.println("Enter Item3 and its price:");
//		item3=scan.next();
//		price3=scan.nextDouble();
//		
//		report="Item1:" + item1+ " Price:" + price1 + "," + "Item2:" +item2 + "Price:" + price3 + "," + " Item3:" + item3 +"Price:"+ price3;
//		
//		totalPrice=price1+price2+price3;
//		System.out.println(report);
//		System.out.println(totalPrice);
		//######################################
		//Scanner scan=new Scanner(System.in);
//		int areaCode,localNumber;
//		String phoneNumber;
//		System.out.println("enter area code");
//		areaCode=scan.nextInt();
//		System.out.println("enter local number");
//		localNumber=scan.nextInt();
//		phoneNumber="-(" + areaCode + ")-" + localNumber;
//		System.out.println(phoneNumber);
		//################################
//		Scanner s = new Scanner(System.in);
//	    int a,b;
//	    
//	    System.out.println("enter numbers:");
//	    a=s.nextInt();
//    	b=s.nextInt();
//	    if(a>b) {
//	    	System.out.println(a + "is greater");
//	    	a=s.nextInt();
//	    }else if(b>a) {
//	    	System.out.println(b+ "is greater");
//	    }else {
//	    	System.out.println("numbers are equal");
//	    }
		
		//###############
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("enter a number");
		a=scan.nextInt();
		if(a<0) {
			System.out.println("negativ");
		}else if(a>0) {
			System.out.println("pozitiv");
		}else {
			System.out.println("zero");
		}
		
		
		
		
	}

}
