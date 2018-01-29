package newPackage;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		double num1;
		double num2;
		String operation;
		Scanner numinput = new Scanner (System.in);
		System.out.println("What is your first number: ");
		num1 = numinput.nextDouble();
		System.out.println("What is your second number: ");
		num2= numinput.nextDouble();
		Scanner op = new Scanner(System.in);
		System.out.println("What operation do you want to perform?");
        operation = op.next();
         if(operation.equals("+")){
        	 System.out.println("Your result is " + (num1+num2));
         }
	if(operation.equals ("-")) {
		System.out.println("Your result is " + (num1-num2));
	}
	if(operation.equals ("/")) {
		System.out.println("Your result is " +(num1/num2));
		
	}
	
	if(operation.equals ("*")) {
		System.out.println("Your result is " +(num1*num2) );
	}
	}
	}


