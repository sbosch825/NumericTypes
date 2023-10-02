// TASK #2 Add an import statement for the Scanner class
import java.util.Scanner;
/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      try (// TASK #2 Create a Scanner object here
    	   Scanner scan = new Scanner(System.in)) {
    	  
		// Identifier declarations
		  final int NUMBER = 2 ;        // Number of scores
		  final int SCORE1 = 100;       // First test score
		  final int SCORE2 = 95;        // Second test score
		  final int BOILING_IN_F = 212; // Boiling temperature
		  int fToC;                     // Temperature Celsius
		  double average;               // Arithmetic average
		  String output;                // Line of output

		  // TASK #2 declare variables used here
		  String firstName; // First name
		  String lastName; //  Last name
		  String fullName; //  Full name
		  
		  // TASK #3 declare variables used here
		  char firstInitial;
		  char lastInitial;
		  
		  // TASK #4 declare variables used here
		  double diameter;
		  double radius;
		  double volume;
		  
		  

		  // Find an arithmetic average.
		  average = (float)(SCORE1 + SCORE2) / NUMBER;
		  output = SCORE1 + " and " + SCORE2 +
		           " have an average of " + average;
		  System.out.println(output);

		  // Convert Fahrenheit temperature to Celsius.
		  fToC = (BOILING_IN_F - 32)* 5/9;
		  output = BOILING_IN_F + " in Fahrenheit is " +
		           fToC + " in Celsius.";
		  //Print output
		  System.out.println(output);
		  System.out.println();      // To leave a blank line

		  // ADD LINES FOR TASK #2 HERE
		  
		  // Prompt the user for first name
		  System.out.println("Please enter your first name.");
		  
		  // Read the user's first name
		   firstName= scan.nextLine();
		   
		  // Prompt the user for last name
		   System.out.println("Please enter your last name.");
		   
		  // Read the user's last name
		   lastName= scan.nextLine();
		   
		  // Concatenate the user's first and last names
		   fullName = firstName + " " +lastName;
		   System.out.println();
		 
		   // Print out the user's full name
		   System.out.println(fullName);
		   System.out.println();      // To leave a blank line
		   
		  // ADD LINES FOR TASK #3 HERE
		  
		  // Get the first character from the user's first name
		  firstInitial = firstName.charAt(0);
		  
		  // Print out the user's first initial
		  System.out.println(firstInitial);
		  
   // Get the first character from the user's last name
		  lastInitial = lastName.charAt(0);
		  
		  // Print out user's last initial
		  System.out.println(lastInitial);
		  
		  // Convert the user's full name to uppercase
		  fullName = fullName.toUpperCase();
		  System.out.println();
		 
		  // Print out the user's full name in uppercase
		  System.out.println(fullName);
		  System.out.println();      // To leave a blank line

		  //Print out length of characters
		  System.out.println(fullName.length());
		  System.out.println();// To leave a blank line
		  // ADD LINES FOR TASK #4 HERE
		  
		  // Prompt the user for a diameter of a sphere
		  System.out.println("Please enter the diameter. ");
		 
		  // Read the diameter
		  diameter = scan.nextDouble();
		  
		  // Calculate the radius
		  radius = diameter / 2;
		  
		  // Calculate the volume
		  volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
		  
		  // Print out the volume
		  System.out.println("The volume is "+ volume);
	}
   }
}
