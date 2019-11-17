package day19_stringManipulation_part1;

public class task_78 {

	public static void main(String[] args) {
		String word="abcabqcabc";
		char myChar='a';
		int total=0;
		 for(int i=0;i<word.length();i++) {
			 if(word.charAt(i)==myChar) {
				 total++;
				 
				 
			 }
		 }
		 System.out.println("number of " + myChar + " in this string: " + total);

	}

}
