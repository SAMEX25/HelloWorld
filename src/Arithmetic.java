// ARITHMETIC OPERATION OF TWO NUMBERS

import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();

        int Addition = num1 + num2;
        int Division = num1/num2;
        int Multiplication = num1*num2;
        int Subtraction = num1 - num2;
        int Remainder = num1%num2;
        System.out.println("The Addition of the two numbers is:" + Addition);
        System.out.println("The Multiplication  of the two numbers is:" + Multiplication);
        System.out.println("The Subtraction of the two number is:" + Subtraction);
        if (num1>=num2){
        System.out.println("The Division of the two numbers is:" + Division);
        System.out.println("The Remainder of the two numbers is:" + Remainder);}
       else {
            System.out.println ("The first number should be greater to be divided:");
        }
    }
}
