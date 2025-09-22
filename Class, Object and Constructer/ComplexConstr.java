/*Design a class ‘ComplexNum’ to manipulate Complex numbers having data members as real and img.
The class should have a parameterized constructor to initialize its data members. 
It should also have methods displayCompNumber() to display the complex number (in the format 5+3i for example), addCompNumber() to add two Complex numbers. 
Test these methods by creating main method in another class.*/

import java.util.Scanner;
class Complex {
    int real;
    int imag;
    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
}
class ComplexConstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);
        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();
        Complex sum = c1.add(c2);
        System.out.print("Sum of Complex Numbers: ");
        sum.display();
    }
}

