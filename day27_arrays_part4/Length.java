package day27_arrays_part4;

public class Length {

	public static void main(String[] args) {
		int numbers [] []= {{1,2,3,4},{5,6,7,8},{9,10,11,23,30,50,60}};//row-0, row-1, row-2,
		
		//you have two length in 2 dimensional array
	
		//display number of the rows
		System.out.println(numbers.length);//it will print row number
		
		//display the number of columns in each row
		
		for(int i=0;i<numbers.length;i++){
		System.out.println("the number of columns in row "+ i + " is " + numbers[i].length);
		        }
		
		int [] x= {1,2,34,4,5};  //print elements of an array one by one
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i] + " ");
		}
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.println(numbers[i][j]);
			}
			
		}
		
		
		
	
	}

}
