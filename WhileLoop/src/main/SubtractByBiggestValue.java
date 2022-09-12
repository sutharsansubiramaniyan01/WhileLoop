package main;

import java.util.Scanner;

public class SubtractByBiggestValue {	// Create class.
	static int value1;					// Create static variable because static method cannot take non-static field.
	static int value2;
	static int result;
	public static void main(String[] args) {	// Main method.
		Scanner scannerObject = new Scanner(System.in); // Create scanner object for get input from user.
		System.out.print("Enter the first value : ");
		 value1 = scannerObject.nextInt();				// Get next int variable input from user.
		 System.out.print("Enter the second value : ");
		 value2 = scannerObject.nextInt();
		while(value1 > value2){							// Check the user first input is bigger than user second input using while. 
			result = value1 - value2;					// If the condition is true then subtract value1 from value2 and store in result variable.
			System.out.println("Subtracted value from straight: " + result);
			break;
	}
		while(value1 < value2) {						// Check the user first input is smaller than user second input.
			result = value2 - value1;					// If the condition is true then subtract value2 from value1 and store in result variable.
			System.out.println("subtracted value from reverse : "+ result);
			break;
		}
  }
}