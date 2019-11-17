package day23_lab3;

import java.util.Random;

public class Task_85 {

	public static void main(String[] args) {
		Random rn= new Random();
		int computerDice;
		int userDice;
		
		
		userDice=rn.nextInt();
		
		int computerPoints=0;
		int userPoints=0;
		
		for(int i=0;i<10;i++) {
			computerDice=rn.nextInt(6)+1;
			userDice=rn.nextInt(6)+1;
			
			if(computerDice>userDice) {
				computerPoints++;
			}else if(userDice>computerDice) {
				userPoints++;
			}
		}
		
		System.out.println("computer point is: " + computerPoints);
		System.out.println("user point is: " + userPoints);
		
		if(computerPoints>userPoints) {
			System.out.println("computer wins");
		}else if(userPoints>computerPoints) {
			System.out.println("user wins");
		}else {
			System.out.println("there is no winner");
		}
		
		
	}

}
