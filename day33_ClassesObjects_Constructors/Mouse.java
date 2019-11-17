package day33_ClassesObjects_Constructors;

public class Mouse {
	int numTeeth;
	int numWhiskers;
	int weight;
	
	public Mouse(int weight) {
		this(weight,16);
	}
	
	public Mouse(int weight,int numTeeth) {
		this(weight,numTeeth,6);
	}
	
	public Mouse(int weight, int numTeeth,int numWhiskers) {
		this.numTeeth=numTeeth;
		this.numWhiskers=numWhiskers;
		this.weight=weight;
	}

	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
}
 