package ControlStatements;
import java.util.Scanner;

//Check if a number is positive.

public class PositiveNumber {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number > 0) {
	            System.out.println(number + " is positive");
	        } else if (number < 0) {
	            System.out.println(number + " is negative");
	        } else {
	            System.out.println("The number is zero");
	        }

	        scanner.close();
	    }
	}


