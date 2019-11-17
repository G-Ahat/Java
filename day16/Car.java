package day16;

public class Car {
	
	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		
		String info = "Car make[" + make + "],model[" + model + "],color[" + color +
				"],current speed[" + currentSpeed + "]";
		
		System.out.println(info);
	}
	
	public void showCurrentSpeed(int speedlimit) {
		if(currentSpeed<=speedlimit) {
			System.out.println(make + " is driving at " + currentSpeed + " mph,following the speed limit-" + speedlimit);
		}else {
			System.out.println(make + " is driving at " + currentSpeed + " mph,over the speed limit-" + speedlimit);
		}
	}
	
	public void drive() {
		
		System.out.println(make + " " + model + " is driving...");
		
	}
	
	public void accelerate(int mph) {
		
		currentSpeed = currentSpeed + mph;
	}






}
