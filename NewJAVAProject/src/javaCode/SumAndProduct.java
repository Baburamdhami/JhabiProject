package javaCode;
//This is a package//

import java.util.Scanner;
//This imports Scanner from java.util//

public class SumAndProduct {
// This is the class name//
	
	public static void main(String[] args) {
	  //Main method: It serves as the starting point of the program's execution//
		
		
		try (Scanner key = new Scanner(System.in)) {
			System.out.print("Enter the first number: ");
			int num1 = key.nextInt();
			//num1,num2 are variables//
			
			System.out.print("Enter the second number: ");
			int num2 = key.nextInt();
			
			int sum = num1 + num2;
			int product = num1 * num2;
			int deduct = num1-num2;
			//+ & * are arithmetic operators//
			
			System.out.println("The sum is " + sum);
			System.out.println("The product is " + product);
			System.out.println("The deduct is " + deduct);
		}
			

	}
		
	}

			/* public int calculateSum(int num1, int num2) {
    				int sum = num1 + num2;
    				return sum;
			}*/
