/*Positive, Negative or Zero. Write a Java program that takes a number and prints whether the 
number is positive, negative, or zero. */

import java.util.Scanner;

public class Q9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter in a integer: ");
        int num = scanner.nextInt();

        if (num > 0){
            System.out.println(num + " is a postive number.");
        } else if (num == 0){
            System.out.println(num + " is equal to zero.");
        } else if (num < 0){
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("Error occured.");
        }

        scanner.close();
    }
}