package ControlStatements;
import java.util.Scanner;

public class PrintNumbers {   
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number ");
	        int N = scanner.nextInt();

	        if (N <= 0) {
	            System.out.println("number greater than 0.");
	        } else {
	            System.out.println("Numbers from 1 to " + N + ":");
	            for (int i = 1; i <= N; i++) {
	                System.out.print(i + " ");
	            }
	        }

	        scanner.close();
	    }
	}


