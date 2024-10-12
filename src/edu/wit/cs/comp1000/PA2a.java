package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		 Scanner scanner = new Scanner(System.in);
	    
	        
	       // storing the  five numbers
	        int[] numbers = new int[5];
	        
	        // asks user for input
	        System.out.println("Enter five whole numbers with a space between each number :");
	        for (int i = 0; i < 5; i++) {
	            numbers[i] = scanner.nextInt(); 
	        }
	        
	        // Variables to store sums and counts
	        int sumAll = 0;
	        int sumPositive = 0;
	        int sumNonPositive = 0;
	        int countPositive = 0;
	        int countNonPositive = 0;
	        
	        // Calculate sums and counts
	        for (int num : numbers) {
	            sumAll += num; 
	            
	            if (num > 0) { // Check if the number is positive
	                sumPositive += num; 
	                countPositive++; 
	            } else { // Number is non-positive
	                sumNonPositive += num; 
	                countNonPositive++; 
	            }
	        }
	        
	        // Calculate averages with simple if-else statements
	        double avgAll = sumAll / 5.0;
	        double avgPositive;
	        if (countPositive > 0) {
	            avgPositive = sumPositive / (double) countPositive; // Average for positive numbers
	        } else {
	            avgPositive = 0; // No positive numbers
	        }
	        
	        double avgNonPositive;
	        if (countNonPositive > 0) {
	            avgNonPositive = sumNonPositive / (double) countNonPositive; // Average for non-positive numbers
	        } else {
	            avgNonPositive = 0; // No non-positive numbers
	        }
	        
	        // Output results
	        System.out.println("The sum of the positive numbers: " + sumPositive);
	        System.out.println("The sum of the non-positive numbers: " + sumNonPositive);
	        System.out.println("The sum of the numbers: " + sumAll);
	        System.out.printf("The average of the positive numbers: %.2f\n", avgPositive);
	        System.out.printf("The average of the non-positive numbers: %.2f\n", avgNonPositive);
	        System.out.printf("The average of the numbers: %.2f\n", avgAll);
	        
	        scanner.close(); // Close the scanner
	}

}
