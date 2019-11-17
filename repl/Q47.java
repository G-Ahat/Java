package repl;

import java.util.*;

public class Q47 {

	public static void main(String[] args) {
		 int propertyPrice = 0; 
			int numberOfBedrooms, garageSpots;
			float metroAccessibility, schoolScore, highwayAccessibility;
			boolean backyard, smoking, garage;
			String houseType;
			Scanner scan = new Scanner(System.in);
			System.out.println("*****************************************");
			System.out.println("* Welcome to the RealEstate calculator! *");
			System.out.println("*****************************************");
	   
	    //WRITE YOUR CODE HERE
	    	System.out.println("Enter your property type: ");
				houseType=scan.nextLine();
				switch (houseType) {
				case "Condo":
					propertyPrice+=50000;
				case "Townhouse":
					propertyPrice+=75000;
				case "Single family home":
					propertyPrice+=95000;
					
					System.out.println(" How many bedrooms do you have?");
					numberOfBedrooms=scan.nextInt();
					propertyPrice+=numberOfBedrooms*30000;
					System.out.println("Do you have a backyard?");
					backyard=scan.nextBoolean();
					if(true) {
					       if(houseType.equals("Condo")) {
					        System.out.println("Backyard is not available for condo!");      
					       }   else  {
					         propertyPrice+=5000;
					        }
					   }     

				     System.out.println("Do you have garage?");
				     garage=scan.nextBoolean();
				     if(true) {
				    	 System.out.println("How many spots?");
				    	 garageSpots=scan.nextInt();
				    	 if(garageSpots>10) {
				    		 System.out.println("Pardon,  it's not a public parking!");
				    		 propertyPrice=propertyPrice;			    		 
				    	 
				    	 }else {
				    		 propertyPrice+=garageSpots*5000;
				    	 }
				    	 }else {
				propertyPrice=propertyPrice;
			}
					
				}System.out.println("How close is metro station?");
				metroAccessibility=scan.nextFloat();
				if(metroAccessibility<=1) {
					propertyPrice+=10000;
				}else if(1<metroAccessibility &&metroAccessibility<3) {
					propertyPrice+=5000;
				}
				System.out.println("How close is highway");
				highwayAccessibility=scan.nextFloat();
				if(highwayAccessibility<=1) {
					propertyPrice+=15000;
				}else if(1<highwayAccessibility&&highwayAccessibility<=5) {
					propertyPrice+=8000;
				}else if(5<highwayAccessibility&&highwayAccessibility<=20) {
					propertyPrice+=4000;
				}
				System.out.println("What's the rating of nearest school?");
				schoolScore=scan.nextFloat();
				if(8<schoolScore&&schoolScore<=10) {
					propertyPrice+=45000;

				}else if(schoolScore<8 &&schoolScore>=4) {
					propertyPrice+=20000;
				}else {
					propertyPrice+=5000;
				}
				System.out.println("Does any of your family members smoking?");
				smoking=scan.nextBoolean();
				
				if(true) {
					propertyPrice-=5000;
				}
				System.out.println("Market report has been generated");
				System.out.println("Your estimate market price is: " + propertyPrice + "$");
			

	}
	
}



