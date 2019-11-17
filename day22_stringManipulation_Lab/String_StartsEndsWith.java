package day22_stringManipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {
		
		String word1= "Eclipse";
		System.out.println(word1.startsWith("E"));
		System.out.println(word1.startsWith("Ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("xe"));
		
		
		//Mr. => married man
		//Mrs. => married woman
		//Ms. => some woman
		//Dr. => doctor man or woman
		//no title => unknown status
		
		
		String word2="";
		if(word2.startsWith("Mr.")) {
			System.out.println(word2 + "is a married man");
		}else if (word2.startsWith("Mrs.")) {
			System.out.println(word2 + "is a married woman");
		}else if (word2.startsWith("Ms.")) {
			System.out.println("some woman");
		}else if (word2.startsWith("Dr.")) {
			System.out.println("doctor man or woman");
		}else {
			System.out.println("unknown status");
		}
		

	
	}
}
