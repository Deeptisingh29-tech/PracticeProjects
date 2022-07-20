package phase1;

import java.util.*;

public class ArithematicCalculator {

	public static void main(String[] args) {
		
		// double data-type is used to manage all types of numbers
		double value1;
		double value2;
		
		// taking user input
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number 1: ");
		
		value1 = s.nextDouble();
		
		System.out.println("Enter the operator (+, -, *, /) ");
		char sign = s.next().charAt(0);
		
		System.out.println("Enter the number 2: ");
		value2 = s.nextDouble();
		
		
		
		double ans = 0;
		
		switch(sign) {
		
		//case for addition
		case '+' : 
			ans = value1 + value2;
			break;
			
		//case for subtraction
		case '-' :
			ans = value1 - value2;
			break;
			
		//case for multiplication
		case '*' : 
			ans = value1 * value2;
			break;
			
		//case for division
		case '/' :
			ans = value1 / value2;
			break;
		
		}
		
		System.out.println("The result : " +value1+ " "+ sign+ " "+ value2+ " = "+ ans );
		
	}

}
