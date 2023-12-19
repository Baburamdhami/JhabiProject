package javaCode;

import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the lenght ");
			double lenght = scanner.nextDouble();
			
			System.out.print("Ehter the breadth ");
			double breadth = scanner.nextDouble();
			
			double area = lenght * breadth;
			
			int areaAsInt = (int)area;
			/*Type casting: To convert the double value to an int, we use (int)
			 * Narrowing casting
			 */
			
			System.out.println("Area of the rectangle is " + areaAsInt);
		}
	}

}
