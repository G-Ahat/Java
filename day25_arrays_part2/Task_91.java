package day25_arrays_part2;

import java.util.Random;

public class Task_91 {

	public static void main(String[] args) {
	   int	numbers[]= new int[10];
	   Random rn=new Random();
	   int value=rn.nextInt(100);
	   for(int i=0;i<numbers.length;i++) {
	   numbers[i]=rn.nextInt(100);
	   System.out.println(numbers[i]);
	   }

	}

}

