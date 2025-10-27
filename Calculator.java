

import java.util.Scanner;

	public class Calculator {
	    public static void main(String[] args) {
	       Scanner sc =new Scanner(System.in);
	     
	        double output;
	       

	        System.out.println("--------Peform different operations on digits using this java based Calculator---------");
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter Second number: ");
	        double num2 = sc.nextDouble();
	        

	        System.out.println("Enter the option you want to perform operation :");
	        System.out.println("Addition: 1 ,Substraction :2, Multiplication :3 , Division:4");
	         int option = sc.nextInt();

	        switch(option) {
	            case 1:
	                output = num1 + num2;
	                System.out.println("Result: " + output);
	                break;
	            case 2:
	                output = num1 - num2;
	                System.out.println("Result: " + output);
	                break;
	            case 3:
	                output= num1 * num2;
	                System.out.println("Result: " + output);
	                break;
	            case 4:
	            	output= num1% num2;
	            	System.out.println("Result: "+ output);
	            case 5:
	                if(num2 != 0) {
	                    output = num1 / num2;
	                    System.out.println("Result: " + output);
	                } else {
	                    System.out.println("Error: Cannot divide by zero.");
	                }
	                break;
	            default:
	                System.out.println("Invalid operator!");
	        }
	        sc.close();
	    }
	}

