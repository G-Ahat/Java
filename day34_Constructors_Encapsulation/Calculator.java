package day34_Constructors_Encapsulation;

public class Calculator {

	Floor floor;
	Carpet carpet;
	
	public Calculator(Floor floor,Carpet carpet) {
		this.carpet=carpet;
		this.floor=floor;
	}
	public double getTotalCost() {
		return this.floor.getArea()*this.carpet.getCost();
	}
}
