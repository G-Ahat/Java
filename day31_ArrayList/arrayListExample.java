package day31_ArrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		// Languages
		ArrayList <String> languages=new ArrayList<> ();
		
		languages.add("Spanish");
		languages.add("German");
		languages.add("Turkish");
		languages.add("Arabic");
		System.out.println(languages.size());
		System.out.println(languages.get(0));
		System.out.println(languages.toString());
		
		languages.remove(0);
		
		System.out.println(languages.toString());
		languages.add("Russian");
		System.out.println(languages.toString());
		
		

	}

}
