package day6_logicalOperators;

public class Task_Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String OutsideWeather;
		int degree;
		OutsideWeather="Shinny";
		degree=70;
		
		boolean comp=(!(OutsideWeather=="Rainy" || degree==70));
		System.out.println(comp);

	}

}
