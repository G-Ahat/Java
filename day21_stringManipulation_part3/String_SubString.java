package day21_stringManipulation_part3;

public class String_SubString {

	public static void main(String[] args) {
		
		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5,11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5,sentence.length()-5));
		
		String chars="{{}}";
		String word="AUTOMATION";
		
		String result=chars.substring(0,2) + word + chars.substring(2);
		System.out.println(result);
		
		System.out.println(word.toLowerCase());
		
		
		String str=" 342 ";
		System.out.println("|" + str.trim() +"|");
		
		
		String s="purr";
		s+=" two";
		System.out.println(s.length());
		
		
		int total=0;
		String letters="abcdefgh";
		
		total+=letters.substring(1,2).length();
		total+=letters.substring(6,6).length();
		total+=letters.substring(5,6).length();
		
		
		System.out.println(total);
	}

}
