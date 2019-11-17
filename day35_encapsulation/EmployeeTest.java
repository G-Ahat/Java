package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1= new Employee();
		Employee emp2= new Employee("Mark Jones.", 39119);
		Employee emp3= new Employee("Tedd Britt.", 81774,"Sales","Sales Person");
		
		emp1.setName("Mike Smith");
		emp1.setIdNumber(47889);
		emp1.setDepartment("Accounting");
		emp1.setPosition("VP");
		
		emp2.setDepartment("Devops");
	    emp2.setPosition("tester");
		System.out.println("Name:        ID Number:   Department:   Position:");
		System.out.println(emp1.getName() + "    " + emp1.getIdNumber() + "      " + emp1.getDepartment() + "        " + emp1.getPosition());
		System.out.println(emp2.getName() + "    " + emp2.getIdNumber() + "      " + emp2.getDepartment() + "        " + emp2.getPosition());
		System.out.println(emp3.getName() + "    " + emp3.getIdNumber() + "      " + emp3.getDepartment() + "        " + emp3.getPosition());


	}

}
