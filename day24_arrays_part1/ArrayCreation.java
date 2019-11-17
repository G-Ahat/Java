package day24_arrays_part1;

public class ArrayCreation {

	public static void main(String[] args) {
	//option-1	
	int[] numbers;
	numbers=new int[3];
	
	//option-2
	int[] numbers1=new int[5];
	float[] temp=new float[100];
	char[] letters=new char[40];
	long[] units=new long[50];
	String words[]=new String[5];
	
	System.out.println(words[1]);
	System.out.println(units[46]);
	System.out.println(numbers[4]);
	System.out.println(letters[30]);
	System.out.println(temp[7]);
	
	
	int []scores=new int[5];
	scores[0]=80;
	scores[1]=85;
	scores[2]=90;
	scores[3]=100;
	scores[4]=85;
	
	
	System.out.println(scores[0]);
	System.out.println(scores[1]);
	System.out.println(scores[2]);
	System.out.println(scores[3]);
	System.out.println(scores[4]);
	
	int avgScore=(scores[0]+scores[1]+scores[3]+scores[2]+scores[4])/5;
	System.out.println(avgScore);
	
	
	
	
	
	
	
	
	
	
	

	}

}
