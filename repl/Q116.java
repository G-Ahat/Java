package repl;

import java.util.Scanner;

public class Q116 {

	public static void main(String[] args) {
		/*The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year, 
		 * this is a simple implementation of the algorithm. You will need to use loops to create it.
		 * Show 10 years of growth of the Utopian Tree.*/
		
		int[] growth=new int[10];
		int treesize=0;

		for(int i=0;i<3;i++) {
			    growth[i]=1;
			    treesize+=1;
				System.out.println("year " +(i+1) + " - growth " + growth[i] + " cm");
				System.out.println("tree size: " + treesize + " cm");
			}
		for(int i=3;i<10;i++) {
			growth[i]=2;
			treesize=treesize+2;
			System.out.println("year " +(i+1) + " - growth " + growth[i] + " cm");
			System.out.println("tree size: " + treesize + " cm");
		}
		
	}

}
