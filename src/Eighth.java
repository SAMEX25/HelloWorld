//To calculate the simple interest

import java.util.Scanner;
public class Eighth
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.println("Enter the annual interest rate( % ):  ");
        double rate = input.nextDouble();
        System.out.println("Enter the time( years )");
        int time = input.nextInt();
        double simpleInterest = (amount * rate * time) / 100;
        System.out.println("Simple Interest= " + simpleInterest );
        input.close();

    }
}

