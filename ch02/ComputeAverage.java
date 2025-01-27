package ch02;

import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAverage {
  public static void main(String[] args) {
    // Create a Scanner object
	  try(Scanner in = new Scanner(System.in)){


		  // Prompt the user to enter three numbers
		  System.out.print("Enter three numbers: ");
		  double number1 = in.nextDouble();
		  double number2 = in.nextDouble();
		  double number3 = in.nextDouble();

		  // Compute average
		  double average = (number1 + number2 + number3) / 3;

		  // Display result
		  System.out.println("The average of " + number1 + " " + number2
				  + " " + number3 + " is " + average);
	  }
  } 
}