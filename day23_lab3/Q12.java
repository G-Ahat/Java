package day23_lab3;

public class Q12 {

	public static void main(String[] args) {
//System.out.println(catDog("catdog"));
//System.out.println(catDog("catcat"));
//System.out.println(catDog("1cat1cadodog"));
//
//
//	}
//	public static boolean catDog(String str) {
//		int counter1=0;
//		int counter2=0;
//		for(int i=0;i<str.length()-2;i++) {
//			if(str.substring(i,i+2).equalsIgnoreCase("cat")) {
//				counter1++;
//			}
//				if(str.substring(i,i+2).equalsIgnoreCase("dog")) {
//					counter2++;
//				}
//			}
//		   return counter1==counter2;
		String str = "Catdog";  //counterCat
        //counterDog
        //substring(0,3) = i,i+3
		//substring(3,6) = i,i+3

int counterCat=0,counterDog=0;


for(int i=0;i<str.length()-2;i++) {  


if(str.substring(i, i+3).equalsIgnoreCase("cat")) {  
counterCat++;
}
if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
counterDog++;
}

}

if(counterCat==counterDog) {
System.out.println(true);
}else {
System.out.println(false);
}






			
		}
	}


