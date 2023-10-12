package com.pockocmoc.calculator;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Sum");
        System.out.println("2. Multiply");
        System.out.println("3. Divide");
        System.out.println("4. Subtract");
        System.out.print("Enter the operation number: ");
        int operation = scanner.nextInt();

        double result;
        try {
            switch (operation) {
                case 1:
                    result = Calculator.sum(num1, num2);
                    System.out.println("Sum result: " + result);
                    break;
                case 2:
                    result = Calculator.multiply(num1, num2);
                    System.out.println("Multiply result: " + result);
                    break;
                case 3:
                    result = Calculator.divide(num1, num2);
                    System.out.println("Divide result: " + result);
                    break;
                case 4:
                    result = Calculator.subtract(num1, num2);
                    System.out.println("Subtract result: " + result);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation number");
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
