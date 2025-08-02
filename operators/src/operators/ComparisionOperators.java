package operators;

import java.util.*;

public class ComparisionOperators {
	
	public static void main(String[] args){
	System.out.println("Enter the number");
	
	Scanner sc = new Scanner(System.in);
	int number1 = sc.nextInt();
    int number2 = sc.nextInt();
       if(number1>number2) 
               System.out.println("number1+ is greater");
       else if(number1==number2)
    	     System.out.println("both numbers are equal");
    else
    	   	System.out.println("number1+ is smaller");
	}


}
