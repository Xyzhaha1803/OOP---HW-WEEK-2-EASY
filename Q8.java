/* Simple Calculator (if-else). Write a Java program that asks the user to enter two numbers 
and an operator (+, -, *, /) and then calculates the result based on the operator using 
if-else statements. */

import java.util.Scanner;

public class Q8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter in an integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter in a second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter in an operator: ");
        String operator = scanner.next();

        if (operator.equals("+")){
            System.out.println("The sum is " + (num1+num2));
        } else if (operator.equals("-")){
            System.out.println("The difference is " + (num1 - num2));
        } else if (operator.equals("*")){
            System.out.println("The product is " + (num1*num2));
        } else if (operator.equals("/")){
            System.out.println("The division is " + (num1/num2));
        } else {
            System.out.println("Input a valid operator.");
        }

        scanner.close();
    }
}