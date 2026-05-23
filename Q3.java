/*Even or Odd Checker. Write a Java program that checks if a number (taken as input) 
is even or odd using an if-else statement. */

import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter in your integer: ");
        int num = scanner.nextInt();

        if (num%2 == 0){
            System.out.println(num + " is a even number.");
        } else {
            System.out.println(num + " is a odd number.");
        }
    }
}