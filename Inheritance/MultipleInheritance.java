package Inheritance;

// Multiple inheritance can only be achieved through interfaces
public class MultipleInheritance {
    public static void main(String[] args){
        C c = new C();
        c.print();
        c.printHello();
    }
}

interface A{
    public void print();
}

interface B{
    public void printHello();
}

class C implements A, B{
    @Override
    public void print(){
        System.out.println("Hi.");
    }

    @Override
    public void printHello(){
        System.out.println("Hello.");
    }
}