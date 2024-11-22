package com.lbrce.calc;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Predefined input values
        double num1 = 10; // First number
        double num2 = 5;  // Second number

        // Perform all operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;

        // Handle division by zero
        double division = (num2 != 0) ? num1 / num2 : Double.NaN;

        // Display results
        System.out.println("Numbers: " + num1 + ", " + num2);
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Error (division by zero)");
        }
    }
}
