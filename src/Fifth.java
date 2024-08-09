// FACTORIAL OF ANY NUMBER

import java.util.Scanner;
public class Fifth {
   public static int factorial(int n)
   {
      if (n == 0) {
          return 1;
      } else {
          return n*factorial(n - 1);
      }
   }

   public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number to calculate its factorial:");
        int num = input.nextInt();

        if (num<0) {
            System.out.println("Factorial is not defined for negative number.");
        }else {
            int result = factorial(num);
                System.out.println("Factorial of " + num + " is: " + result);

            input.close();
            }
        }

   }


