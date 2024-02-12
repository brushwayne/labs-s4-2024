/*Write a program in java to create a class complex having data members real and imaginary and
member functions add(complex c2)-- used to add two complex numbers and display()-- used to
display result of added complex numbers*/

class p1 {
    public static void main(String args[]) {

    Complex c1 = new Complex(2, 4);
    Complex c2 = new Complex(2, 4);

    c1.add(c2);

    System.out.printf("%f + %fi", c1.real, c1.imaginary);
    }
}

class Complex {
    
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex c) {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }
}

