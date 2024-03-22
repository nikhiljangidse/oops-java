package Inheritance;

public class SingleInheritance{
    public static void main(String[] args){
        Child c = new Child();
        c.badHabits();
        c.goodHabits();
    }
}

class Parent{
    public void goodHabits(){
        System.out.println("He wakes up early in the morning.");
    }
}

class Child extends Parent{
    public void badHabits(){
        System.out.println("He is naughty");
    }
}