package day36_StaticClassMmebers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom=new Dinner();
		Dinner kid=new Dinner();
		Dinner dad=new Dinner();
		
		System.out.println("Total Slices: "+ Dinner.pizzaSlice);
		
		dad.takeASlice();
		mom.takeASlice();
		kid.takeASlice();
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
		kid.takeASlice(3);
		dad.takeASlice(2);
		
		System.out.println("Total Slices: " + Dinner.pizzaSlice);
		
		
		
		
		

	}

}
