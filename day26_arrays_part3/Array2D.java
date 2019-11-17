package day26_arrays_part3;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int [][] scores=new int [3][4];
		System.out.println(scores[2][3]);
		System.out.println(scores[0][0]);
		
		 char [][] tictactoe=new char [3][3];
		char tictaoe [][]= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}; 
		 
		String[][] chessBoard = new String[8][8];
		String [] s1= {"1","2","3","4","5","6","7","8"};
		String [] s2= {"a","b","c","d","e","f","g","h"};
               
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j] = s1[i]+s2[j];
            }
        }


System.out.println(Arrays.toString(s1));
		 
	}

}
