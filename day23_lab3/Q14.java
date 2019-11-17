package day23_lab3;

public class Q14 {

	public static void main(String[] args) {
		String str="oddnbcvfsly";
		if(str.length()<2) {
			System.out.println(false);
			return;
		}
		if(str.substring(str.length()-2).equals("ly")) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
