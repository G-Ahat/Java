package day9_controlFlowStatements_Part3;

public class Assignment_2 {
     //BMI calculator code
	public static void main(String[] args) {
		double pound,kg,inches,meter;
		meter=1.62;
	    kg=65;
		pound=kg*2.2;
		inches=meter/0.0254;
		System.out.println("your weight in pounds: " + pound);
		System.out.println("your height in inches: " + inches);
		
		double BMI=kg/(meter*meter);
		System.out.println("your BMI is " + BMI);
		
		if (BMI<18.5) {
			System.out.println("your risk factory is underweight");
		}else if (BMI>=18.5 && BMI<25) {
				System.out.println("your risk factory is normal weight");
			}else if (BMI>=25 && BMI<30) {
				System.out.println("your risk factory is overweight");
				}else if (BMI>=30) {
					System.out.println("your risk factory is obese");
				}
		}

	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	



