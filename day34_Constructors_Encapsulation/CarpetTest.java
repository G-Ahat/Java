package day34_Constructors_Encapsulation;

public class CarpetTest {

	public static void main(String[] args) {
		Carpet carpet= new Carpet(8);
		Floor floor=new Floor(10, 12);
		Calculator calculate= new Calculator(floor, carpet);
		System.out.println(calculate.getTotalCost());

	}

}
