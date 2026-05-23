/*Comparison using if-else Write a Java program that takes two numbers and prints the greater number. */

import java.util.Scanner;

public class Q6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter in your first Integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your second Integer: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } else if (num2 > num1){
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
        scanner.close();
    }
}