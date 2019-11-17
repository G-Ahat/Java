package day30_wrapperClass;

public class Task_98 {

	public static void main(String[] args) {
		String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
		System.out.println(decodeTheCode(str1));
		
		String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
		System.out.println(decodeTheCode(str2));




	}
	public static String decodeTheCode(String str) {
		  String s1="";
	       for(int i=0; i<str.length(); i++) {
	    	   if(Character.isAlphabetic(str.charAt(i)) ||  str.charAt(i)==' ') {
	    		   s1+=str.charAt(i);
	    	   }
	    	   
	       }
	       String[] arr = s1.split(" ");
			
			String s2= "";
			for(String value : arr) { // 
				
				s2 = s2 + getDigit(value) + " ";
				
			}
			
			
			
			
			return s2;
		
		}public static String getDigit(String st) { //ONE
			
			switch(st.toUpperCase()) {
			
			case "ZERO":
				return "0";
			case "ONE":
				return "1";
			case "TWO":
				return "2";
			case "THREE":
				return "3";
			case "FOUR":
				return "4";
			case "FIVE":
				return "5";
			case "SIX":
				return "6";
			case "SEVEN":
				return "7";
			case "EIGHT":
				return "8";
			case "NINE":
				return "9";
			default:
				return "";
						

	       
	       
			} 
			

	}

}
