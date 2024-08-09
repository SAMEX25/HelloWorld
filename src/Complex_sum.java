// ADDITION OF COMPLEX NUMBER

import java.util.Scanner;
public class Complex_sum {
    double real;
    double imaginary;

    public Complex_sum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex_sum add(Complex_sum other) {
        return new Complex_sum(this.real + other.real, this.imaginary + other.imaginary);
    }
    public String toString() {
        return this.real + " + " + this.imaginary + "i";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the real part of the first complex number:");
        double real1= input.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imaginary1= input.nextDouble();
        System.out.println("Enter the real part of the second complex number:");
        double real2= input.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imaginary2= input.nextDouble();
        Complex_sum c1 = new Complex_sum(real1,imaginary1);
        Complex_sum c2 = new Complex_sum(real2,imaginary2);

        Complex_sum sum=c1.add(c2);
        System.out.println("Sum:" + sum);
        input.close();

    }

    }


