package Inheritance;

public class HeirarchicalInheritance {
    public static void main(String[] args){
        Car c = new Car();
        c.detail();
        c.run();

        Bike b = new Bike();
        b.detail();
        b.run();
    }
}

class Vehicle{
    public void run(){
        System.out.println("Used in transportation");
    }
}

class Car extends Vehicle{
    public void detail(){
        System.out.println("It is a car.");
    }
}

class Bike extends Vehicle{
    public void detail(){
        System.out.println("It is a bike.");
    }
}