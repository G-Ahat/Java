package day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {
		sum(2,4);
		System.out.println(concat("Apple", "Orange","123"));
		
	}
	
	public static void sum(int...numbers) {
		int sum=0;
				for(int value: numbers) {
					sum+=value;
				}
		System.out.println(sum);
	}
	public static String concat(String...strs){
		String newStr="";
		for(String str:strs) {
			newStr=newStr+str.charAt(2);
		}
		return newStr;
		
	}

}
