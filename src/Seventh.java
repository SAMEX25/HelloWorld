// ADDITION OF COMPLEX NUMBER

import java.util.Scanner;
public class Seventh {
    double real;
    double imaginary;

    public Seventh(double real,double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Seventh add(Seventh other) {
        return new Seventh(this.real + other.real, this.imaginary + other.imaginary);
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
        Seventh c1 = new Seventh(real1,imaginary1);
        Seventh c2 = new Seventh(real2,imaginary2);

        Seventh sum=c1.add(c2);
        System.out.println("Sum:" + sum);
        input.close();

    }

    }


