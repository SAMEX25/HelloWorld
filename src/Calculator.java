// CALCULATOR FOR 2 DIGITS

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean exit = false;
        while (!exit) {
            System.out.println("Enter the first number: ");
            double num1 = input.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = input.nextDouble();
            System.out.println("Choose the operation to perform:(+,-,*,/)");
            char operation = input.next().charAt(0);
            double result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Zero can't be the Divisor!! ");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid Operation! ");
                continue;
            }

            System.out.println("Result: " + result);
            System.out.println("Do you want to continue ? (yes/no) ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("no")) {
                exit = true;
            }
        }
        input.close();
    }
}














