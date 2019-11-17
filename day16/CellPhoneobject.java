package day16;

public class CellPhoneobject {

	public static void main(String[] args) {
		
		CellPhone cell1= new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		
		cell1.brand= "nokia 6300";
		cell1.screenSize=2.0;
		cell1.color="silver";
		cell1.price=76.16;
		
		System.out.println(cell1.brand);
		System.out.println(cell1.color);
		System.out.println(cell1.price);
		System.out.println(cell1.screenSize);
		
		cell1.color="black";
		System.out.println(cell1.color);
		
		CellPhone cell2= new CellPhone();
		cell2.brand="siemens";
		cell2.screenSize=1.5;
		cell2.price=39.22;
		cell2.color="red";
		System.out.println("cell2 values");
		System.out.println("brand: " + cell2.brand);
		System.out.println("screensize: " + cell2.screenSize);
		System.out.println("color: " + cell2.color);
		
		System.out.println("calling method");
		cell1.call();
		cell1.message();
		cell1.takeAphoto();
		
		cell2.call();
		cell2.takeAphoto();
		cell2.message();
		

	}

}
