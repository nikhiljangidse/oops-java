package Inheritance;

public class HybridInheritance {
    public static void main(String[] args){
        D obj = new D();
        obj.print();
        obj.printHello();
        obj.printBye();
    }
}

interface A{
    public void print();
}

interface B extends A{
    public void printHello();
}

interface C extends A{
    public void printBye();
}

class D implements B, C{

    @Override
    public void print() {
        System.out.println("Hi");
    }

    @Override
    public void printBye() {
        System.out.println("Bye");
    }

    @Override
    public void printHello() {
        System.out.println("Hello");
    }

}
