package day10_controlFlowStatements_Part4;

public class task_44 {

	public static void main(String[] args) {
		
		final int firstKPH=60;
		final int lastKPH=130;
		final int increment=10;
	
		System.out.println("KPH                  MPH");
		int kph;
		double mph;
		
		for(kph=firstKPH;kph<=lastKPH;kph+=increment) {
			mph=kph*0.6214;
			System.out.println(kph + "                  " + mph);
			
		}
		
		 System.out.println("KPH          MPH");//this way is easier
	        System.out.println("-----------");
	        for(int i = 60 ; i <= 130 ; i += 10) {
	            System.out.println(i + "        " + (i*0.6214));
	        }

	}

}
