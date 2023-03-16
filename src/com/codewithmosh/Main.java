package com.codewithmosh;
import java.util.Scanner;

public class Main {
    public static void main(String[] names) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number ");
        int number = scanner.nextInt();
        if ((number % 3 == 0) && (number % 5 == 0))
            System.out.println("FizzBuzz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
    }
}

