package Inheritance;

public class MultilevelInheritance {
    public static void main(String[] args){
        ChildB b = new ChildB();
        b.badHabits();
        b.goodHabits();
        b.interest();

        ChildA a = new ChildB();
        a.badHabits();
        a.goodHabits();
    }
}

class Parent {
    public void goodHabits(){
        System.out.println("He wakes up early in the morning");
    }
}

class ChildA extends Parent{
    public void badHabits(){
        System.out.println("He is naughty");
    }
}

class ChildB extends ChildA{
    public void interest(){
        System.out.println("Playing guitar");
    }
}