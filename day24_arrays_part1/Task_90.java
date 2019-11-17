package day24_arrays_part1;

public class Task_90 {

	public static void main(String[] args) {
		String cars[]= {"mercedes","Honda","ferrari","ford","audi","BMW"};
		boolean flag=false;
		
		for(int i=0;i<cars.length;i++) {
			if(cars[i].contentEquals("Honda")) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("found it");
		}else {
			System.out.println("not found it");
		}

	}

}
