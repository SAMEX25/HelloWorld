// GREATER BETWEEN THREE NUMBERS

import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        System.out.println("Enter the third number:");
        int c = input.nextInt();
        int max = a;
        if(b>max){max = b;}
        if(c>max){max = c;}

        System.out.println("The Maximum of three numbers is:" + max);

    }
}
