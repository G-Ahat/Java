package repl;

import java.util.Scanner;

public class PatientInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String firstName, lastName, fullName, email, street, state, city, address, contacts;
		int age, zipcode;
		double height, weight;
		boolean  isMarried;
		long workPhoneNumber, personalPhoneNumber;
		System.out.println("Welcome to the patient portal!");
		System.out.println("Please enter your personal information");
		System.out.println("Enter your first name");
		firstName=scan.next();
		System.out.println("Enter your last name");
		lastName=scan.next();
		System.out.println("Enter your email");
		email=scan.next();
		System.out.println("Enter your street");
		street=scan.next();
		System.out.println("Enter your state");
		state=scan.next();
		System.out.println("Enter your city");
		city=scan.next();
		System.out.println("Enter your zipcode");
		zipcode=scan.nextInt();
		System.out.println("Enter your weight");
		weight=scan.nextDouble();
		System.out.println("Enter your height");
		height=scan.nextDouble();
		System.out.println("Are you married");
		isMarried=scan.nextBoolean();
		System.out.println("enter your work phone number");
		workPhoneNumber=scan.nextLong();
		System.out.println("enter your personal number");
		personalPhoneNumber=scan.nextLong();
		System.out.println("enter your age");
		age=scan.nextInt();
		contacts="work phone number - " + workPhoneNumber + " personal phone number - " + personalPhoneNumber + " email: " + email;
		address=street + "," + city + "," + state + zipcode;
		fullName=firstName + " " + lastName;
		System.out.println("patient personal information");
		System.out.println("fullname: " + fullName);
		System.out.println("address: " + address);
		System.out.println("contacts: " + contacts);
		System.out.println("age: " + age);
		System.out.println("weight: " + weight);
		System.out.println("height: " + height);
		System.out.println("Married?" + isMarried);
		
		
		
	}

}
