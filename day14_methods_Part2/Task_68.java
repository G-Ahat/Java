package day14_methods_Part2;

public class Task_68 {
	/*Write two methods:1-calculateAge(yearBirth); and returns the age
	 * 2-yearsUntilRetirement(name,year); and displays in the console following:  
	 * “Mike retires in 36 years”
	 * Example: yearsUntilRetirement(“Mike”,1990);
	 */

	
	public static void main(String[] args) {
		int age=calculateAge(1990);
		yearsUntilRetirement("Mike",1990);
		
	}
	public static int calculateAge(int birthyear) {
		int age=2019-birthyear;
		return age;
	
		
	}
	
	public static void yearsUntilRetirement(String name,int year) {
		
		int untilRetirement=65-calculateAge(1990);
		System.out.println("Mike" + " retires in " + untilRetirement + " years");
		
	}
	
		
		

}
