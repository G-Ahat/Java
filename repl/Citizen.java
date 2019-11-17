package repl;

import java.util.Scanner;

public class Citizen {

	public static void main(String[] args) {
//		-Declare int variables: seniorCitizens, nonSeniorCitizens, age
//		-Create a Scanner object
//		- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
//		"Enter current count for seniorCitizens and nonSeniorCitizens:"
//
//		-Ask user to enter age:
//		"What is new citizen's age?"
//
//		-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.
//
//		-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.
//
//		-At last, print another message:
//		"New seniorCitizens count ValueOfVariable"
//		"New nonSeniorCitizens count ValueOfVariable"
		int seniorCitizens, nonSeniorCitizens, age;
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		 seniorCitizens=scan.nextInt();
	     nonSeniorCitizens=scan.nextInt();
		System.out.println("What is new citizen's age?");
		age=scan.nextInt();
		if(age>=65) {
			System.out.println("senior citizen");
			seniorCitizens+=1;
		}if(age<65) {
			System.out.println("non-senior citizen");
			nonSeniorCitizens+=1;
		}
		System.out.println("New senior Citizens count= " + seniorCitizens);
		System.out.println("New non senior citizens count= " + nonSeniorCitizens);

	}

}
