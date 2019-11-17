package day14_methods_Part2;

public class lab_1 {

	public static void main(String[] args) {
//		Write a method that accepts a string and a non-negative number, 
//		and prints a larger string that is number copies of the original String
//		stringTimes("Hi",2);
//		stringTimes("Hi",3);
//     	stringTimes("Hi",1);
//
//	}
//
//	public static void stringTimes(String greeting,int x) {
//		for(int i=0;i<x;i++) {
//			System.out.print("Hi");
//			
//			
//		}
//		System.out.println();
//	
//		
//		
//	deerPlay(70,false);
//	deerPlay(95,false);
//	deerPlay(95,true);
//		
//	}
//	public static void deerPlay(int tem,boolean isSummer ) {
//		if((isSummer==true)&&(tem>60&&tem<100)) {
//				System.out.println("true");
//			}
//		else if((isSummer==false)&&(tem>60&&tem<90)) {
//					System.out.println("true");
//				}else System.out.println("false");
//				
//			
//		
//		//number 6 is a truly great number. write a method that accepts num1 and num2 
//		//prints true if either one is 6 or their sum or difference is 6
//		
//		love6(6,4);
//		love6(4,5);
//		love6(1,5);
//		love6(12,6);
//		
//	}
//	
//	
//	public static void love6(int num1,int num2) {
//		
//		if(num1==6||num2==6) {
//			System.out.println("true");
//			
//		}else if (num1+num2==6||num1-num2==6 || num2-num1==6) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//		
		//special eleven..we say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11
		//write a method that accepts a number and prints true if the given number is special
		
//		specialEleven(22);
//		specialEleven(23);
//		specialEleven(24);
//		
//	}
//		
//		
//		public static void specialEleven(int number) {
//			if(number%11==0 ||(number-1)%11==0 || number%11==1) {
//				System.out.println(true);
//			}else {
//				System.out.println(false);
//			}
//		}
//		
//		
		//caughtspeed.
		
//		caughtSpeeding(60,false);
//		caughtSpeeding(65,false);
//		caughtSpeeding(65,true);
//	}
//		
//	public static void caughtSpeeding(int speed, boolean isBirthday) {
//		if(isBirthday) {
//			if(speed<=65) {
//				System.out.println(0);
//			}else if(speed>=66 && speed<=85) {
//				System.out.println(1);
//			}
//		}else  {
//			if(speed<=60) {
//				System.out.println(0);
//			}else if(speed>=61 && speed<=80) {
//				System.out.println(1);
//			}else if (speed>=81) {
//				System.out.println(2);
//			}
		
		cigarParty(30,false);
		cigarParty(50,false);
		cigarParty(70,true);
		
		
		
	}
	public static void cigarParty(int numberCigar,boolean isWeekend) {
		if(isWeekend) {
			if(numberCigar>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(numberCigar>=40 && numberCigar<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
		
	}
	
	
	
	
		

		
		
		
	}
	

