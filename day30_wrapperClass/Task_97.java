package day30_wrapperClass;

public class Task_97 {

	public static void main(String[] args) {
		//write a method that returns :Welcome to core Java
		
		String s = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		String letter = "";
		
		 for (int i = 0; i < s.length(); i++) {
			    
			    if(Character.isLetter(s.charAt(i)) || s.charAt(i)== ' ' ) {
			      
			    	letter += s.charAt(i) + "";
			     
			    }

		 }
		 System.out.println(letter);
		


		
		

	}

}
