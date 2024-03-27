package Polymorphism;

public class Polymorphism {
    public static void main(String[] args){
        Maths maths = new Maths();
        maths.multiply(2, 3);
        maths.multiply(5.5, 3.8);
        maths.multiply(3, 4.7, 9);
    }
}

class Maths {
    public void multiply(int a, int b){
        int result = a*b;
        System.out.println("Multiply of " + a + "x" + b + " = " + result);
    }

    public void multiply(double a, double b){
        double result = a*b;
        System.out.println("Multiply of " + a + "x" + b + " = " + result);
    }

    public void multiply(int a, double b, double c){
        double result = a*b*c;
        System.out.println("Multiply of " + a + "x" + b + "x" + c + " = " + result);
    }
}