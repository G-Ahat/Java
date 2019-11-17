package day20_stringManipulation_part2;

public class task_81 {

	public static void main(String[] args) {
		
		timeStamp("10/10/2019 14:59:00");

	}
	public static void timeStamp(String str) {
      str=str.replace("/","").replace(":","").replace(" ","");
      System.out.println(str);
	}

}
