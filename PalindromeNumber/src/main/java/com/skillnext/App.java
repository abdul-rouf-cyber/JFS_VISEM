package com.skillnext;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = sc.nextInt();

        int originalNumber = number;
        int reversed = 0;

        while (number != 0) {
            int rem = number % 10;
            reversed = reversed * 10 + rem;
            number = number / 10;
        }

        if (reversed == originalNumber) {
            System.out.println(originalNumber + " is a palindrome number");
        } else {
            System.out.println(originalNumber + " is not a palindrome number");
        }
    }
}
