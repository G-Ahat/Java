package day23_lab3;

public class Q13 {

	public static void main(String[] args) {
		String str1="The";
		String newString="";
		for(int i=0;i<str1.length();i++) {
			newString=newString+str1.substring(i,i+1).concat(str1.substring(i, i+1));
			
			
		}System.out.println(newString);
        
	}

}
