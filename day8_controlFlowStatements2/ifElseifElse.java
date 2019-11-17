package day8_controlFlowStatements2;

public class ifElseifElse {

	public static void main(String[] args) {
		
		//program to display days
		//1-monday
		//2-tuesday
		//3-wendesday
		//4-thursday
		//5-friday
		//6-saturday
		//7-sunday
		
		int day=5;
		if(day==1) {
			System.out.println("monday");
		}else if(day==2) {
			System.out.println("tuesday");
		} else if(day==3) {
			System.out.println("wendesday");
		} else if(day==4) {
			System.out.println("thursday");
		} else if(day==5) {
			System.out.println("friday");
		} else if(day==6) {
			System.out.println("saturday");
		} else if(day==7) {
			System.out.println("sunday");
		} else {
			System.out.println("not a valid day");
		}
		  System.out.println("**********");
		 
		  
		  
		  int age=16;
		  if(age<2||age>18) {
			  System.out.println("ineligeble");
		  }else if(age==2) {
			  System.out.println("toddler");
		  } else if(age>=3 && age<=5) {
			  System.out.println("early childhood");
		  }else if(age==6||age==7) {
			  System.out.println("young reader");
		  }else if(age>=8 && age<=10) {
			  System.out.println("elemantery");
		  }else if(age==11||age==12) {
			  System.out.println("middle");
		  }else if(age==13) {
			  System.out.println("impossible");
		  }else if(age>=14 && age<=16) {
			  System.out.println("high school");
		  }else {
			  System.out.println("not valid age");
		  }
			  
	}

}
