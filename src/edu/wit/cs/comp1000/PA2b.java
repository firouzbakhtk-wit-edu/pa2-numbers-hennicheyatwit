package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user for input
	        System.out.print("Enter coefficients a, b, and c (separated by spaces): ");
	        double a = scanner.nextDouble();
	        double b = scanner.nextDouble();
	        double c = scanner.nextDouble();
	        
	        // Calculate the discriminant
	        double discriminant = b * b - 4 * a * c;

	        // Determine the roots based on the discriminant
	        if (discriminant < 0) {
	            // If the discriminant is negative, roots are imaginary
	            System.out.println("Roots: imaginary");
	        } else if (discriminant == 0) {
	            // If the discriminant is zero, there is one real root
	            double root = -b / (2 * a);
	            System.out.printf("Root: %.2f\n", root);
	        } else {
	            // If the discriminant is positive, there are two real roots
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

	            // Print the roots in increasing order
	            System.out.printf("Roots: %.2f, %.2f\n", Math.min(root1, root2), Math.max(root1, root2));
	        }

	        // Close the scanner
	        scanner.close();
	}

}
