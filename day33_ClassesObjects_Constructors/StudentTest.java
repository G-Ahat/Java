package day33_ClassesObjects_Constructors;

public class StudentTest {

	public static void main(String[] args) {
		Student s1=new Student("Mike",17,'M',2016,"Java", "cybertek uni");
		Student s2=new Student("Smith", 18, 'M', 2015, "JS", "cybertek uni");
		Student s3=new Student("Mary", 19, 'F', 2017, "TS", "cybertek uni");

  s1.attendLecture();
  s2.attendLAb();
  
		
	}

}
