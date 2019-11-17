package day4_arithmeticOperators;

public class wages {

	public static void main(String[] args) {
		
		double regularWage;//The calculated regular wage
		double basePay=25; //The base pay
		double regularHours=40; //the hours worked less overtime
		double overtimeWages; //overtime wages
		double overtimePay=37.5; // overtime pay rate
		double overtimeHours=10;
		double totalWage; //Total wage
		
		regularWage=basePay*regularHours;
		overtimeWages=overtimePay*overtimeHours;
		
		totalWage=regularWage+overtimeWages;
		
		System.out.println("Wages for this week are $ " + totalWage);

	}

}
