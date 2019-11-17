package assignment_5;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
//		Dr. Kimuta was so happy,  and he has asked you to write one more program. :) 
//
//	A slot machine (Links to an external site.) is a gambling device that the user inserts money into and then pulls a lever (or presses a button). The slot machine then displays a set of random images. If two or more of the images match, the user wins an amount of money that the slot machine dispenses back to the user.
//
//	Create a program that simulates a slot machine. When the program runs, it should do the following:
//
//	Ask the user to enter the amount of money he or she wants to enter into the slot machine.
//	Instead of displaying images, the program will randomly select a word from the following list: Cherries, Oranges, Plums, Bells, Melons, Bars
//	To select a word, the program can generate a random number in the range of 0 through 5. If the number is 0, the selected word is Cherries; if the number is 1, the selected word is Oranges; and so forth. The program should randomly select a word from the list three times and display all three of the words.
//	If none of the randomly selected words match, the program will inform the user that he or she has won $0.
//	If two of the words match, the program will inform the user that he or she was won two times the amount entered.
//	If three of the words match, the program will inform the user that he or she has won three times the amount entered.
//	The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program displays the total amount of money entered into the slot machine and the total amount won.

		Scanner scan=new Scanner(System.in);
		Random rn= new Random();
		System.out.println("enter the amount of money you want to enter into the slot machine:");
		int randomNum1=rn.nextInt(5);
		int amount=scan.nextInt();
		if (randomNum1==0) {
			System.out.println("Cherries");
		}else if(randomNum1==1) {
			System.out.println("Oranges");
		}else if(randomNum1==2) {
			System.out.println("Plums");
		}else if (randomNum1==3) {
			System.out.println("Bells");
		}else if(randomNum1==4) {
			System.out.println("Melons");
		}else if (randomNum1==5) {
			System.out.println("Bars");
		}
		int randomNum2=rn.nextInt(5);
		if (randomNum2==0) {
			System.out.println("Cherries");
		}else if(randomNum2==1) {
			System.out.println("Oranges");
		}else if(randomNum2==2) {
			System.out.println("Plums");
		}else if (randomNum2==3) {
			System.out.println("Bells");
		}else if(randomNum2==4) {
			System.out.println("Melons");
		}else if (randomNum2==5) {
			System.out.println("Bars");
		}

		int randomNum3=rn.nextInt(5);
		if (randomNum3==0) {
			System.out.println("Cherries");
		}else if(randomNum3==1) {
			System.out.println("Oranges");
		}else if(randomNum3==2) {
			System.out.println("Plums");
		}else if (randomNum3==3) {
			System.out.println("Bells");
		}else if(randomNum3==4) {
			System.out.println("Melons");
		}else if (randomNum3==5) {
			System.out.println("Bars");
		}
		
		if(randomNum1==randomNum2||randomNum1==randomNum3||randomNum2==randomNum3) {
		int	amount2=amount*2;
		System.out.println("you win " + amount2);
		}else if(randomNum1==randomNum2&&randomNum2==randomNum3) {
			int amount3=amount*3;
			System.out.println("you win " + amount3);
		}else if(randomNum1!=randomNum2&&randomNum2!=randomNum3&&randomNum1!=randomNum3) {
			System.out.println("you win $0");
			
		}
		System.out.println("do you want to try again(y=yes)(n=no)?");
		String again=scan.next();
		if(again.equals("y")) {
			System.out.println("enter the amount of money you want to enter into the slot machine: ");
			int amountNew=scan.nextInt();
		}else {
			System.out.println("good bye");
		}
		int randomNum4=rn.nextInt(5);
		
		if (randomNum4==0) {
			System.out.println("Cherries");
		}else if(randomNum4==1) {
			System.out.println("Oranges");
		}else if(randomNum4==2) {
			System.out.println("Plums");
		}else if (randomNum4==3) {
			System.out.println("Bells");
		}else if(randomNum4==4) {
			System.out.println("Melons");
		}else if (randomNum4==5) {
			System.out.println("Bars");
		}
		int randomNum5=rn.nextInt(5);
		if (randomNum5==0) {
			System.out.println("Cherries");
		}else if(randomNum5==1) {
			System.out.println("Oranges");
		}else if(randomNum5==2) {
			System.out.println("Plums");
		}else if (randomNum5==3) {
			System.out.println("Bells");
		}else if(randomNum5==4) {
			System.out.println("Melons");
		}else if (randomNum5==5) {
			System.out.println("Bars");
		}

		int randomNum6=rn.nextInt(5);
		if (randomNum6==0) {
			System.out.println("Cherries");
		}else if(randomNum6==1) {
			System.out.println("Oranges");
		}else if(randomNum6==2) {
			System.out.println("Plums");
		}else if (randomNum6==3) {
			System.out.println("Bells");
		}else if(randomNum6==4) {
			System.out.println("Melons");
		}else if (randomNum6==5) {
			System.out.println("Bars");
		}
		
		
		if(randomNum4==randomNum5||randomNum4==randomNum6||randomNum4==randomNum6) {
			int amountNew=scan.nextInt();
			int amount4=amountNew*2;
			System.out.println("you win " + amount4);
			}else if(randomNum4==randomNum5&&randomNum5==randomNum6) {
				int amountNew=scan.nextInt();
				int amount5=amountNew*3;
				System.out.println("you win " + amount5);
			}else if(randomNum4!=randomNum5&&randomNum5!=randomNum6&&randomNum4!=randomNum6) {
			     System.out.println("you win $0");}			

     }
}