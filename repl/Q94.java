package repl;

import java.util.Scanner;

public class Q94 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);//input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
		    String html = scan.nextLine();
		    
		    int a = html.indexOf("id=\"") + "id=\"".length();
			int b = html.indexOf("\">", a);

			if (a != -1 && b != -1) {
				System.out.println(html.substring(a, b));
			} else {
				System.out.println("Invalid input!");
			}
		

	}

}
