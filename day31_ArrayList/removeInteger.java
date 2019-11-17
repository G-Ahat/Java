package day31_ArrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {
		
		ArrayList <Integer> nums= new ArrayList<>();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		
		nums.add(4);
		nums.add(5);
		nums.add(7);
		nums.add(902);
		nums.add(1345);
		nums.add(8754);
		
		System.out.println(nums.toString());
		
		nums.remove(5);
		System.out.println(nums.toString());
		
		Integer n1=new Integer(5);
		Integer n2=Integer.valueOf(5);
		
		nums.remove(n1);
		
		System.out.println(nums.toString());
		nums.remove(new Integer(4));
		
		System.out.println(nums.toString());
		
		
	}

}
