package day31_ArrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		ArrayList<String> shoppingList=new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("fruit");
		shoppingList.add("bread");
		
		System.out.println(shoppingList.size());
		for(String list: shoppingList) {
			System.out.print(list + " ");
		}

		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0));
		System.out.println(shoppingList.get(shoppingList.size()-1));
	}

}
