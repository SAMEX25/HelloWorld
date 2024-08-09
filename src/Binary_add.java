// ADDITION OF BINARY NUMBER

import java.util.Scanner;
public class Binary_add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first binary number:");
        String binary1= input.nextLine();
        System.out.println("Enter the second binary number:");
        String binary2= input.nextLine();

        int num1=Integer.parseInt(binary1,2);
        int num2=Integer.parseInt(binary2,2);
        int sum = num1 + num2;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + binarySum) ;
    }

}
