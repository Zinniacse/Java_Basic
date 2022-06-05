package Java_Basic;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// check which number is bigger
		
		Scanner input = new Scanner (System.in);
		
		//Datatype variable name
		
        System.out.print("Enter First Number :");
        
        int number1 = input.nextInt();
        
        System.out.print("Enter Second Number :");
        int number2 = input.nextInt();
		
        if(number1>number2) {
        	
        	System.out.println("Number "+number1+" is greater than Number"+number2);
        			
        }else if(number1 == number2) {
        	
        	System.out.println("Number "+number1+" is equal "+number2);
        }
        else {
        	System.out.println("Number "+number1+" is less than Number"+number2);
        	
        }
        }

}
