package day32_arrayList_part2;

import java.util.ArrayList;
import java.util.Random;

public class customMethods {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> numlist=new ArrayList<>();
		numlist.add(10);
		numlist.add(10);
		numlist.add(7);
		numlist.add(8);
		numlist.add(8);
		numlist.add(3);
		numlist.add(4);
		numlist.add(8);
		
		printList(numlist);
		ArrayList<Double> doubleList=new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(1.22);
		doubleList.add(7.34);
		doubleList.add(3.55);
		doubleList.add(4.76);
		
		double sum=sumList(doubleList);
		System.out.println(sum);
		
		ArrayList<Integer> list= getList(15);
		System.out.println(list.toString());	
		
		ArrayList<Integer> rList=getRandomList(20);
		System.out.println(rList.toString());
		
		ArrayList<String> strnums=new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		ArrayList<Integer> converted=convertToIntList(strnums);
		System.out.println(converted);
		
		
		
	}
	public static ArrayList<Integer> convertToIntList(ArrayList<String> strList){
		ArrayList<Integer> newArr=new ArrayList<>();
		for(String str:strList) {
			newArr.add(Integer.parseInt(str));
		}
		return newArr;
	}
	
	public static ArrayList<Integer> getRandomList(int rn){
		ArrayList<Integer> ranList=new ArrayList<>();
		Random r=new Random();
		for(int i=1;i<=rn;i++) {
			ranList.add(r.nextInt(101));
		}
		return ranList;
	}
	public static ArrayList<Integer> getList(int ls) {
		
		ArrayList<Integer> newlist=new ArrayList<>();
		for(int i=1;i<=ls;i++) {
		newlist.add(i);
		}
		return newlist ;
		}
		
	
	public static void printList(ArrayList<Integer> nums) {
		for(Integer n:nums) {
			System.out.print(n+ " ");
		}
		System.out.println("-------------------------");
	}
	
	public static double sumList(ArrayList<Double> db) {
		double sum=0;
		for(Double d: db) {
			sum+=d;
		}
		return sum;
	}

}
