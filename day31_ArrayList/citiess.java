package day31_ArrayList;

import java.util.ArrayList;

public class citiess {

	public static void main(String[] args) {
		
		
		ArrayList<String> cities=new ArrayList<>();
		
		cities.add("London");
		cities.add("Berlin");
		cities.add("Bonn");
		cities.add("Boston");
		cities.add("Baku");
		cities.add("Baku");
		
		System.out.println(cities.toString());

		//print each city by using for-each loop seperated by space
		
		for(String city : cities) {
			System.out.println(city + " ");
			
		}
		
		//print each citi using for iterator loop
		
		for(int i=0;i<cities.size();i++) {
			System.out.println(cities.get(i));
		}
		
		System.out.println("----------------------");
		
		System.out.println("Removing Baku");
	
		cities.remove("Baku");
		cities.remove("Boston");
		System.out.println(cities.toString());
		System.out.println("________________");
		
		cities.add(0,"Istanbul");
		cities.add(2,"Ankara");
		
		System.out.println(cities.toString());
		System.out.println("____________");
		
		int idx=cities.indexOf("Istanbul");
		System.out.println(idx);//it will print index number of Istanbul
		
		System.out.println(cities.indexOf("Bursa"));//it will print -1 because Bursa is not an element of cities
		
		cities.clear();
		System.out.println(cities.isEmpty());//will print boolean
			
		
		
		
	}

}
