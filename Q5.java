/*Use of Logical Operators. Write a Java program to check if a person is eligible to vote. 
(The person must be 18 or older and a citizen.) */

import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen(1 for yes & 0 for no): ");
        int citizen = scanner.nextInt();

        if (age >= 18 && citizen == 1){
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}