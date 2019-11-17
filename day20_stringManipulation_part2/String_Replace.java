package day20_stringManipulation_part2;

public class String_Replace {

	public static void main(String[] args) {
	
		String str="moscow is the capital of Russia";
		 str= str.replace("moscow",  "baku").replace("Russia","Azarbaijan");
		 System.out.println(str);
		 
		 String email="firstName_LastName@gmail.com";
		 String company="capitalone";
		 
		 String newEmail=email.replace("gmail",company);
		 System.out.println(newEmail);

		 System.out.println(email);
		 
		 String b="rumble";
		 b+=b.concat("4").substring(3,b.length()-1);
		 System.out.println(b
				 );
	}

}
