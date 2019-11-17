package day22_stringManipulation_Lab;

public class String_IsEmpty {

	public static void main(String[] args) {
		String userName="";
		String password="";
		
		if(userName.isEmpty() ) {
			System.out.println("username field can not be empty");
		}else {
			System.out.println("username is not empty");
		}
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("username or password can not be empty");
			
		}else {
			System.out.println("username or password is not empty");
		}

	}

}
