package Java_Basic;

import java.util.Scanner;

public class Basic_Calculator {


	static void addition (int num1, int num2) {
		
        int sum = num1 + num2;
        System.out.println("Add: "+sum);
		
	}
	
	static void subtraction (int num1, int num2) {
		
        int sub = num1 - num2;
        System.out.println("sub: "+sub);
		
	}
	
static void multiplication (int num1, int num2) {
		
        int multiplication = num1 * num2;
        System.out.println("multiplication: "+multiplication);
		
	}

static void division (int num1, int num2) {
	
    int division = num1 / num2;
    System.out.println("Division: "+division);
	
}
	
	public static void main(String[] args) {
		// INPUT TAKEN FROM USER
	
        Scanner input = new Scanner (System.in);
		
		System.out.print("Enter First Number :");
	        
	        int number1 = input.nextInt();
	        
	        System.out.print("Enter Second Number :");
	        int number2 = input.nextInt();
	        
	        addition(number1,number2);
	        subtraction(number1,number2);
	        multiplication(number1,number2);
	        division(number1,number2);

	}

}
