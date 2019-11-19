package day36_StaticClassMmebers;

public class Countable {

	static int instanceCount=0;
	public Countable() {
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}
}
