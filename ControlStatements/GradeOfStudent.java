package ControlStatements;
import java.util.Scanner;

public class GradeOfStudent {
	
	    public static void main(String[] args) {
	    	
	        Scanner scanner= new Scanner(System.in);

	        System.out.print("Enter student's marks  ");
	        int marks = scanner.nextInt();
	        
	        if (marks > 90) {
	            System.out.println("Grade: A");

	        } else if (marks > 70) {
	            System.out.println("Grade: B");
	            
	        } else if (marks > 60) {
	            System.out.println("Grade: C");
	        }

	        scanner.close();
	    }
	}


