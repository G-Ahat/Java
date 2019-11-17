package day32_arrayList_part2;

import java.util.ArrayList;

public class GroceryList {
	
	ArrayList<String> groceryList=new ArrayList<>();
	// we do not use static here because we want to reach this method from other classes
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	public void printGroceryList() {
		System.out.println("you have " + groceryList.size() + " in your list");
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
			
    }
	
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + position+1 + " has been modofied");
	}
	
	public void removeGroceryItem(int position) {
		groceryList.remove(position);
		}
	
	public String findItem(String searchItem) {
		int position=groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}return null;
	}


}
