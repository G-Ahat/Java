package day14_methods_Part2;

public class Task_66 {
	/*he distance a vehicle travels can be calculated as follows:
	 * Distance=Speed*Time
	 * Write a method named distance that accepts a vehicle’s speed and time as arguments,
	 *  and return the distance the vehicle has traveled.
	 */

	public static void main(String[] args) {
		int distance=Distance(60,40);
		System.out.println(distance);
		if(distance>500) {
			System.out.println("you spent too much gas");
		}else {
			System.out.println("you spent ok gas");
		}
	}
 
	public static int Distance(int speed,int time) {
		int distance=speed*time;
		return distance;
	}
}
