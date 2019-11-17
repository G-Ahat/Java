package day16;

public class CarObjects {

	public static void main(String[] args) {

      Car car1= new Car();
      car1.printCarInfo();
      car1.make="ford";
      car1.model="fiesta";
      car1.color="grey";
      car1.currentSpeed=55;
      
      car1.printCarInfo();
      
      car1.showCurrentSpeed(70);
      car1.showCurrentSpeed(35);
      
      car1.drive();
      System.out.println("before:" +car1.currentSpeed);
      
      car1.accelerate(20);
      
      System.out.println("after: " + car1.currentSpeed);

	}

}
