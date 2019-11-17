package day23_lab3;

import java.util.Random;

public class Task_84 {

	public static void main(String[] args) {
		Random rn=new Random();
		boolean a;
				
		for (int i=0;i<9;i++) {
			a=rn.nextBoolean();
			
			if (rn.nextInt(2)==0) {
				System.out.println("Heads");
			}else {
				System.out.println("Tails");
			}
		}

	}

}
