package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
	        // Create a Scanner object for user input
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter values for a, b, and c
	        System.out.print("Enter a b c: ");
	        double a = scanner.nextDouble();
	        double b = scanner.nextDouble();
	        double c = scanner.nextDouble();

	        // Calculate the discriminant (b^2 - 4ac)
	        double discriminant = b * b - 4 * a * c;

	        if (discriminant < 0) {
	            // Case 1: Imaginary roots
	            System.out.println("Roots: imaginary");
	        } else if (discriminant == 0) {
	            // Case 2: One real root (double root)
	            double root = -b / (2 * a);
	            System.out.printf("Root: %.2f%n", root);
	        } else {
	            // Case 3: Two real roots
	            double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);

	            // Print the roots in increasing order
	            if (root1 < root2) {
	                System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
	            } else {
	                System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
	            }
	        }

	        // Close the scanner to avoid resource leaks
	        scanner.close();
	}

}
