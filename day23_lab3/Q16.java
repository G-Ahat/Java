package day23_lab3;

public class Q16 {

	public static void main(String[] args) {
		String str="al ala"; //forwardString.equals(backwardstring)=true
		//a+l+a+l+a
		//4 3 2 1 0
		//m+a+d+a+m
		//4 3 2 1 0
		String dummy="";
		for(int i=str.length()-1;i>=0;i--) {
			dummy=dummy+str.charAt(i);
         }
		if(str.replace(" ","").equals(dummy.replace(" ",""))) {
			System.out.println(true);
		}
		else {
		System.out.println(false);
	      }
//		public static Boolean palindrome(String str) {
//			
//			String reverse = "";
//			Boolean flag = true;
//			
//			for (int i =str.length()-1; i>=0; i-- ) {
//				reverse = reverse + str.charAt(i);
//				
//				if (str.contentEquals(reverse)) {
//					flag = true;
//				}else {
//					flag = false;
//				}
//				
//			}
//			return flag;

	  }
}

