package ControlStatements;
import java.util.Scanner;

public class EvenOrOdd {

	//Check if a number is even or odd
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        if (number % 2 == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }

	        scanner.close();
	    }
	}


