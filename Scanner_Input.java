package Java_Basic;

import java.util.Scanner;

public class Scanner_Input {

	public static void main(String[] args) {
		// INPUT TAKEN FROM USER
		
				Scanner input = new Scanner(System.in);
				//data type variable name = value
				
				 System.out.print("Enter a Number: ");
				 
				 int number = input.nextInt();
				 
				 System.out.print("Enter a Name: ");
				 
				 String name = input.next();
				 
				 System.out.println("Number :" +number);
				 
				 System.out.println("Name :" +name);
				 
				 System.out.println("Name :" +name + " Number :" +number);

	}

	

}
