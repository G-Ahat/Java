package day16;

public class Employee {
	String name;
	String jobTitle;
	double salary;
	
	public void work() {
		System.out.println(name + " is working hard...");
	}
     
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting...");
	}
	
	public void introduce() {
		System.out.println("name:" + name + "job title:" + jobTitle +"Salary:" + salary );
	}
}
