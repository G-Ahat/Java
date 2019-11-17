package day19_stringManipulation_part1;

public class String_Contains {

	public static void main(String[] args) {
		
		String email= "teas@gmail.com";
		System.out.println(email.contains("@"));
		
		String list="potatoes,tomatoes,eggs,milk,bread,cereal,meat,apples";
		
		if(list.contains("apples")) {
			System.out.println("apples are in your list");
		}else {
			System.out.println("apples are not in your list");
		}
		
		boolean hasEggs=list.contains("eggs");
		System.out.println("contains eggs: " + hasEggs);

		
		boolean hasCucumbers=list.contains("cucumber");
		System.out.println("contains cucumbers: " + hasCucumbers);
		
		email="name@yahoo.com";
		
		if(email.contains("@yahoo")) {
			System.out.println("yahoo account");
		}else if(email.contains("@gmail")) {
			System.out.println("gmail account");
		}else if(email.contains("@hotmail")) {
			System.out.println("hotmail account");
		}
		
		
		String etsyTitle= "Car | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("pipe is there expected");
		}else {
			System.out.println("pipe is not detected");
		}
		
	}

}
